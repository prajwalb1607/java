class Chef {
    public static void wakeUp() {
        System.out.println("Chef wakes up at 8:00 AM");
		buyIngredients();
    }
    public static void buyIngredients() {
        System.out.println("Chef buys vegetables at 9:00 AM");
		cookLunch();
		Cricketer.warmUp();
    }
    public static void cookLunch() {
        System.out.println("Chef cooks lunch at 12:00 PM");
		cookDinner();
    }
    public static void cookDinner() {
        System.out.println("Chef cooks dinner at 7:00 PM");
		sleep();
    }
    public static void sleep() {
        System.out.println("Chef sleeps at 11:00 PM");
    }

    public static void main(String[] args) {
        wakeUp();
       
    }
}
