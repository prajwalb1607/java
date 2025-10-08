class SmartWatch {
    byte id;
    short batteryLife;
    int price;
    char model;
    String brand;

    SmartWatch() {
        System.out.println("no args constructor");
    }

    SmartWatch(int price) {
        System.out.println("one args constructor");
        System.out.println("Price == " + price);
    }

    SmartWatch(int price, String brand) {
        System.out.println("two args constructor");
        System.out.println("Price == " + price);
        System.out.println("Brand == " + brand);
    }

    public static void main(String args[]) {
        SmartWatch w1 = new SmartWatch();
        w1.id = 11;
        w1.batteryLife = 48;
        w1.price = 8999;
        w1.model = 'M';
        w1.brand = "Noise";
        System.out.println("Brand == " + w1.brand);
        System.out.println("Battery life == " + w1.batteryLife + " hrs");

        SmartWatch w2 = new SmartWatch(12999);
        SmartWatch w3 = new SmartWatch(19999, "Apple");
    }
}
