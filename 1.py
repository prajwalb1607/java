import pandas as pd
import numpy as np
import ast
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity
from fuzzywuzzy import process  # pip install fuzzywuzzy[speedup]
import warnings
warnings.filterwarnings('ignore')

# ----------- Step 1: Load & Merge Data ------------
movies = pd.read_csv("tmdb_5000_movies.csv")
credits = pd.read_csv("tmdb_5000_credits.csv")

# Merge on movie id
movies = movies.merge(credits, left_on='id', right_on='movie_id')

# Select and rename columns
movies = movies[['id', 'title_x', 'overview', 'genres', 'keywords', 'cast', 'crew',
                 'vote_average', 'popularity', 'budget', 'revenue', 'runtime']]
movies.rename(columns={'title_x': 'title'}, inplace=True)

# Drop rows with missing overviews
movies.dropna(subset=['overview'], inplace=True)

# ---------- Step 2: Feature Extraction Helpers -------------

def parse_json_list(text, key='name'):
    try:
        return [i[key].replace(" ", "").lower() for i in ast.literal_eval(text)]
    except Exception:
        return []

def get_top_cast(text, top_n=3):
    try:
        cast_list = ast.literal_eval(text)
        return [c['name'].replace(" ", "").lower() for c in cast_list[:top_n]]
    except Exception:
        return []

def get_director(text):
    try:
        crew_list = ast.literal_eval(text)
        for member in crew_list:
            if member['job'] == 'Director':
                return [member['name'].replace(" ", "").lower()]
        return []
    except Exception:
        return []

# ---------- Step 3: Apply feature extraction -------------

movies['genres'] = movies['genres'].apply(parse_json_list)
movies['keywords'] = movies['keywords'].apply(parse_json_list)
movies['cast'] = movies['cast'].apply(get_top_cast)
movies['director'] = movies['crew'].apply(get_director)

# ---------- Step 4: Weight features -------------

movies['cast'] = movies['cast'].apply(lambda x: x * 3)      # triple weight for cast
movies['director'] = movies['director'].apply(lambda x: x * 5)  # quintuple weight for director

# Lowercase & split overview
movies['overview'] = movies['overview'].str.lower().str.split()

# Combine all features into tags
movies['tags'] = movies['overview'] + movies['genres'] + movies['keywords'] + movies['cast'] + movies['director']
movies['tags'] = movies['tags'].apply(lambda x: " ".join(x))

# ----------- Step 5: Vectorize and compute similarity -----------

tfidf = TfidfVectorizer(max_features=5000, stop_words='english')
vectors = tfidf.fit_transform(movies['tags']).toarray()

similarity = cosine_similarity(vectors)

# ----------- Step 6: Improved movie title matching -----------

def find_closest_title(input_title, titles_list, threshold=80):
    match, score = process.extractOne(input_title.lower(), titles_list)
    if score >= threshold:
        return match
    return None

# ----------- Step 7: Recommendation function -------------

def recommend(movie_name):
    titles = movies['title'].str.lower().tolist()
    matched_title = find_closest_title(movie_name, titles)
    
    if not matched_title:
        print(f"No close match found for '{movie_name}'. Please try again.")
        return
    
    idx = titles.index(matched_title)
    distances = list(enumerate(similarity[idx]))
    top_movies = sorted(distances, key=lambda x: x[1], reverse=True)[1:6]
    
    print(f"\nTop 5 recommendations for: {movies.iloc[idx]['title']}")
    for i, (movie_idx, score) in enumerate(top_movies, 1):
        print(f"{i}. {movies.iloc[movie_idx]['title']}")

# ----------- Step 8: Visualizations -------------

def plot_visualizations(df):
    sns.set_style('darkgrid')

    # 1. Top 10 movies by rating
    top_rated = df.sort_values('vote_average', ascending=False).head(10)
    plt.figure(figsize=(10,6))
    sns.barplot(x='vote_average', y='title', data=top_rated, palette='viridis')
    plt.title("Top 10 Movies by Rating")
    plt.xlabel("Rating")
    plt.ylabel("Movie Title")
    plt.tight_layout()
    plt.show()

    # 2. Top 10 movies by popularity
    top_popular = df.sort_values('popularity', ascending=False).head(10)
    plt.figure(figsize=(10,6))
    sns.barplot(x='popularity', y='title', data=top_popular, palette='magma')
    plt.title("Top 10 Popular Movies")
    plt.xlabel("Popularity")
    plt.ylabel("Movie Title")
    plt.tight_layout()
    plt.show()

    # 3. Top 10 by Budget (filter zero budgets)
    top_budget = df[df['budget'] > 0].sort_values('budget', ascending=False).head(10)
    plt.figure(figsize=(10,6))
    sns.barplot(x='budget', y='title', data=top_budget, palette='coolwarm')
    plt.title("Top 10 Highest Budget Movies")
    plt.xlabel("Budget")
    plt.ylabel("Movie Title")
    plt.tight_layout()
    plt.show()

    # 4. Runtime Distribution
    plt.figure(figsize=(10,5))
    sns.histplot(df['runtime'].dropna(), bins=30, kde=True, color='blue')
    plt.title("Runtime Distribution")
    plt.xlabel("Runtime (minutes)")
    plt.tight_layout()
    plt.show()

    # 5. Correlation heatmap of numeric features
    numeric_cols = ['vote_average', 'popularity', 'budget', 'revenue', 'runtime']
    plt.figure(figsize=(8,6))
    sns.heatmap(df[numeric_cols].corr(), annot=True, cmap='coolwarm', fmt=".2f")
    plt.title("Correlation Between Numeric Features")
    plt.tight_layout()
    plt.show()

# ----------- Step 9: Run visualizations -------------

plot_visualizations(movies)

# ----------- Step 10: User interaction -------------

# ----------- Step 10: User interaction with 'list' option -------------
if _name_ == "_main_":
    from sklearn.metrics import accuracy_score

# Example usage:

    print("Welcome to the Enhanced Movie Recommender!")
    print("Type 'list' to see all movie titles or 'exit' to quit.\n")

    def find_closest_title(input_title, titles_list, threshold=80):
        match, score = process.extractOne(input_title.lower(), titles_list)
        if score >= threshold:
            return match, score
        return None, score

    def recommend(movie_name):
        titles = movies['title'].str.lower().tolist()
        matched_title, match_score = find_closest_title(movie_name, titles)

        if not matched_title:
            print(f"No close match found for '{movie_name}'. Closest match score: {match_score}. Try again.")
            return

        idx = titles.index(matched_title)
        distances = list(enumerate(similarity[idx]))
        top_movies = sorted(distances, key=lambda x: x[1], reverse=True)[1:6]  # Exclude self

        print(f"\nTop 5 recommendations for: {movies.iloc[idx]['title']} (Matched with confidence: {match_score})")
        for i, (movie_idx, score) in enumerate(top_movies, 1):
            print(f"{i}. {movies.iloc[movie_idx]['title']} (Similarity Score: {score:.2f})")

    while True:
        user_movie = input("Enter a movie name: ").strip()

        if user_movie.lower() == 'exit':
            print("Goodbye!")
            break

        elif user_movie.lower() == 'list':
            print("\nAvailable Movies:\n")
            for i, title in enumerate(sorted(movies['title'].unique()), 1):
                print(f"{i}. {title}")
            print(f"\nTotal Movies: {len(movies['title'].unique())}\n")

        else:
            recommend(user_movie)