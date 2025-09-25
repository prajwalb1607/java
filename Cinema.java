class Cinema {
    public static void info(String title) {
        System.out.println("Movie: " + title);
    }

    public static void info(int duration) {
        System.out.println("Duration: " + duration + " mins");
    }

    public static double info(String title, double rating) {
		if(title=="coolie"){
			return 4;
    }
	    if(title=="kgf"){
			return 5;
		}
		if(title=="kantara"){
			return 5;
		}
		return 0;
	}

    public static void main(String[] args) {
        info("Inception");
        info(148);
        double rating = info("kgf",5);
        System.out.println("Rating: " + rating);
    }
}
