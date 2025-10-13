class Camera {
    int price;
    String brand;
    float resolution;
    boolean isDSLR;

    Camera(int price, String brand, float resolution, boolean isDSLR) {
        this.price = price;
        this.brand = brand;
        this.resolution = resolution;
        this.isDSLR = isDSLR;
    }

    void price() {
        System.out.println("Price of the camera is == " + price);
        resolution();
    }

    void resolution() {
        System.out.println("Resolution of the camera is == " + resolution + " MP");
        brand();
    }

    void brand() {
        System.out.println("Brand of the camera is == " + brand);
        System.out.println("DSLR Camera == " + isDSLR);
    }

    public static void main(String args[]) {
        Camera obj = new Camera(55000, "Canon", 24.2f, true);
        System.out.println("=== Camera Details ===");
        System.out.println("Price: " + obj.price);
        System.out.println("Brand: " + obj.brand);
        System.out.println("Resolution: " + obj.resolution);
        System.out.println("DSLR: " + obj.isDSLR);
        obj.price();
    }
}
