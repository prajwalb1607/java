class Laptops extends Computer {

    public static void main(String[] args) {
        Computer.boot();
        Computer.shutdown();

        Laptops l = new Laptops();
        l.saveFile();
        l.runProgram();
    }
}