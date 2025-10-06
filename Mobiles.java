class Mobiles {

    public Mobiles() {
        System.out.println("this is no args constructor");
    }

    public Mobiles(String brandName, int modelNo) {
        System.out.println("brandName is = " + brandName + "\nmodelNo is = " + modelNo);
    }

    public Mobiles(int price, String feature) {
        System.out.println("price of mobile is = " + price + "\nfeature of the mobile = " + feature);
    }

    public static void main(String args[]) {
        new Mobiles();
        new Mobiles("Samsung", 101);
        new Mobiles(25000, "AMOLED Display");
    }
}
