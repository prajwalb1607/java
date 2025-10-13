class Bicycle {
    int price;
    String brand;
    float gearCount;
    boolean hasBell;

    Bicycle(int price, String brand, float gearCount, boolean hasBell) {
        this.price = price;
        this.brand = brand;
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    void price() {
        System.out.println("Bicycle price is == " + price);
        gear();
    }

    void gear() {
        System.out.println("Gear count == " + gearCount);
        brand();
    }

    void brand() {
        System.out.println("Brand == " + brand);
        System.out.println("Has Bell == " + hasBell);
    }

    public static void main(String args[]) {
        Bicycle obj = new Bicycle(12000, "Hero", 21.0f, true);
        System.out.println("=== Bicycle Details ===");
        System.out.println("Price: " + obj.price);
        System.out.println("Brand: " + obj.brand);
        System.out.println("Gear Count: " + obj.gearCount);
        System.out.println("Has Bell: " + obj.hasBell);
        obj.price();
    }
}
