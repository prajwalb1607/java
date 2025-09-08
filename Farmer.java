class Farmer {
    public static void wakeUp() {
        System.out.println("Farmer wakes up at 5:00 AM");
		goToField();
    }
    public static void goToField() {
        System.out.println("Farmer goes to the field at 6:00 AM");
		harvest();
    }
    public static void harvest() {
        System.out.println("Farmer harvests crops at 9:00 AM");
		sellCrops();
    }
    public static void sellCrops() {
        System.out.println("Farmer sells crops in the market at 2:00 PM");
		sleep();
    }
    public static void sleep() {
        System.out.println("Farmer sleeps at 9:00 PM");
    }

    public static void main(String[] args) {
        wakeUp();
      
    }
}
