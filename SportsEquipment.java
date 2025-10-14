class SportsEquipment {
    String type;
    int quantity;
    char size;
    double price;

    SportsEquipment() {
        this("Cricket Bat");
        System.out.println("No-args constructor");
    }

    SportsEquipment(String type) {
        this(type, 1);
        System.out.println("One-arg constructor");
    }

    SportsEquipment(String type, int quantity) {
        this(type, quantity, 'M');
        System.out.println("Two-args constructor");
    }

    SportsEquipment(String type, int quantity, char size) {
        this(type, quantity, size, 2500.0);
        System.out.println("Three-args constructor");
    }

    SportsEquipment(String type, int quantity, char size, double price) {
        System.out.println("Four-args constructor");
        this.type = type;
        this.quantity = quantity;
        this.size = size;
        this.price = price;
    }


}
