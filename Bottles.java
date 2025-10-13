class Bottles {
    int price;
    String brand;
    float gst;
    boolean isAvailable;

    Bottles(int price, String brand, float gst, boolean isAvailable) {
        this.price = price;
        this.brand = brand;
        this.gst = gst;
        this.isAvailable = isAvailable;
    }

    void rate() {
        System.out.println("Rate of the bottle is == " + price);
        gst();
    }

    void gst() {
        System.out.println("GST of the bottle is == " + gst);
        brand();
    }

    void brand() {
        System.out.println("Brand of the bottle is == " + brand);
    }

    public static void main(String args[]) {
        Bottles obj = new Bottles(100, "Bisleri", 12.5f, true);
        System.out.println("=== Bottle Details ===");
        System.out.println("Price: " + obj.price);
        System.out.println("Brand: " + obj.brand);
        System.out.println("GST: " + obj.gst);
        System.out.println("Available: " + obj.isAvailable);

   
        rate();
    }
}
