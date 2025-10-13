class Speaker {
    int price;
    String brand;
    float wattage;
    boolean isBluetooth;

    Speaker(int price, String brand, float wattage, boolean isBluetooth) {
        this.price = price;
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    void price() {
        System.out.println("Speaker price is == " + price);
        wattage();
    }

    void wattage() {
        System.out.println("Wattage == " + wattage + " W");
        brand();
    }

    void brand() {
        System.out.println("Brand == " + brand);
        System.out.println("Bluetooth == " + isBluetooth);
    }

    public static void main(String args[]) {
        Speaker obj = new Speaker(3500, "JBL", 50.0f, true);
        System.out.println("=== Speaker Details ===");
        System.out.println("Price: " + obj.price);
        System.out.println("Brand: " + obj.brand);
        System.out.println("Wattage: " + obj.wattage);
        System.out.println("Bluetooth: " + obj.isBluetooth);
        obj.price();
    }
}
