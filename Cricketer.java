class Cricketer {
    public static void wakeUp() {
        System.out.println("Cricketer wakes up at 6:00 AM");
		warmUp();
    }
    public static void warmUp() {
        System.out.println("Cricketer does warm-up exercises at 6:30 AM");
		practiceBatting();
    }
    public static void practiceBatting() {
        System.out.println("Cricketer practices batting at 9:00 AM");
		practiceBowling();
    }
    public static void practiceBowling() {
        System.out.println("Cricketer practices bowling at 11:00 AM");
		playMatch();
    }
    public static void playMatch() {
        System.out.println("Cricketer plays a match at 2:00 PM");
		sleep();
    }
    public static void sleep() {
        System.out.println("Cricketer sleeps at 10:00 PM");
		Chef.cookLunch();
    }

    public static void main(String[] args) {
        wakeUp();
       
    }
}
