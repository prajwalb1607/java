class Actor {
    byte id;
    short movies;
    int followers;
    char grade;
    String name;

    Actor() {
        System.out.println("no args constructor");
    }

    Actor(int followers) {
        System.out.println("one args constructor");
        System.out.println("Followers == " + followers);
    }

    Actor(int followers, String name) {
        System.out.println("two args constructor");
        System.out.println("Followers == " + followers);
        System.out.println("Actor name == " + name);
    }

    public static void main(String args[]) {
        Actor a1 = new Actor();
        a1.id = 10;
        a1.movies = 45;
        a1.followers = 1200000;
        a1.grade = 'A';
        a1.name = "Yash";
        System.out.println("id == " + a1.id);
        System.out.println("movies == " + a1.movies);
        System.out.println("grade == " + a1.grade);
        System.out.println("Actor == " + a1.name);
        System.out.println("Followers == " + a1.followers);

        Actor a2 = new Actor(2000000);
        Actor a3 = new Actor(5000000, "Allu Arjun");
    }
}
