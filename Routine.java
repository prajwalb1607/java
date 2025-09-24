class Routine {

    static String name = "Sagar";

    public static void wakeUp() {
       int time = 7; 
        System.out.println(name + " wakes up at " + time);
    }

    public static void study() {
        int timing=8; 
        System.out.println(name + " studies from " + timing);
    }

    public static void sleep() {
        int times=10;  
        System.out.println(name + " sleeps at " + times);
    }

    public static void main(String[] args) {
        wakeUp();
        study();
        sleep();
    }
}
