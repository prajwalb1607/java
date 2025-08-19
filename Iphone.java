class Iphone {
    public static void main(String[] args) {
        byte ram = 8;
        ram = 127;
        short internalShortage = 127;

        if (ram > 16) {
            System.out.println("ram is greater than 16");

            if (ram < 140) {
                System.out.println("ram is less than 140");

                if (ram == internalShortage) {
                    System.out.println("ram is equal to internalShortage");
                } else {
                    System.out.println("ram is not equal to internalShortage");
                }
            }
        } else {
            System.out.println("ram is not greater than 16");
        }
    }
}
