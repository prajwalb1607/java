class Student {
    public static void wakeUp() {
        System.out.println("kumar wakes up at 7:00 AM");
		study();
    }
    public static void study() {
        System.out.println("kumar studies from 8:00 AM to 10:00 AM");
		attendClass();
    }
    public static void attendClass() {
        System.out.println("kumar attends class at 11:00 AM");
		playSports();
    }
    public static void playSports() {
        System.out.println("kumar plays football at 5:00 PM");
		sleep();
    }
    public static void sleep() {
        System.out.println("kumar sleeps at 10:00 PM");
    }

    public static void main(String[] args) {
        wakeUp();
    
    }
}
