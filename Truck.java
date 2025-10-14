class Truck {
    String brand;
    int capacity;
    char modelCode;
    double price;

    Truck() {
        this("Ashok Leyland");
        System.out.println("No-args constructor");
    }

    Truck(String brand) {
        this(brand, 10);
        System.out.println("One-arg constructor");
    }

    Truck(String brand, int capacity) {
        this(brand, capacity, 'T');
        System.out.println("Two-args constructor");
    }

    Truck(String brand, int capacity, char modelCode) {
        this(brand, capacity, modelCode,1.0029);
        System.out.println("Three-args constructor");
    }

    Truck(String brand, int capacity, char modelCode, double price) {
        System.out.println("Four-args constructor");
        this.brand = brand;
        this.capacity = capacity;
        this.modelCode = modelCode;
        this.price = price;
    }

}
