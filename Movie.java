class Movie {

    public Movie() {
        System.out.println("This is a no-args constructor");
    }
    public Movie(String name) {
        System.out.println("Movie name: " + name);
    }
    public Movie(String name, String hero) {
        System.out.println("Movie name: " + name + "\nHero: " + hero);
    }

    public static void main(String args[]) {
        new Movie();                               
        new Movie("KGF");                            
        new Movie("Kantara", "Rishab Shetty");       
      
    }
}
