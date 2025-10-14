class Scooter {
    String brand;
    int engineCC;
    char modelGrade;
    double mileage;

    Scooter() {
        this("Honda Activa");
        System.out.println("No-args constructor");
    }

    Scooter(String brand) {
        this(brand, 125);
        System.out.println("One-arg constructor");
    }

    Scooter(String brand, int engineCC) {
        this(brand, engineCC, 'S');
        System.out.println("Two-args constructor");
    }

    Scooter(String brand, int engineCC, char modelGrade) {
        this(brand, engineCC, modelGrade, 45.5);
        System.out.println("Three-args constructor");
    }

    Scooter(String brand, int engineCC, char modelGrade, double mileage) {
        System.out.println("Four-args constructor");
        this.brand = brand;
        this.engineCC = engineCC;
        this.modelGrade = modelGrade;
        this.mileage = mileage;
    }

 
}
