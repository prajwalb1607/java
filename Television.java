class Television {
    String brand;
    int screenSize;
    char type;
    double price;

    Television() {
        this("Sony");
        System.out.println("No-args constructor");
    }

    Television(String brand) {
        this(brand, 55);
        System.out.println("One-arg constructor");
    }

    Television(String brand, int screenSize) {
        this(brand, screenSize, 'O');
        System.out.println("Two-args constructor");
    }

    Television(String brand, int screenSize, char type) {
        this(brand, screenSize, type, 80000.0);
        System.out.println("Three-args constructor");
    }

    Television(String brand, int screenSize, char type, double price) {
        System.out.println("Four-args constructor");
        this.brand = brand;
        this.screenSize = screenSize;
        this.type = type;
        this.price = price;
    }


}
