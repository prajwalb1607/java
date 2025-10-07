class Vehicle {
    byte wheels;
    short speed;
    int price;
    long engineNo;
    char type;
    String brand;
    String owner;
	float gst;
    double mileage;
    boolean isAvailable;
    public static void main(String args[]) {
        Vehicle v1 = new Vehicle();
        v1.wheels = 4;
        System.out.println("Number of wheels == " + v1.wheels);

        Vehicle v2 = new Vehicle();
        v2.speed = 180;
        System.out.println("Top speed == " + v2.speed);

        Vehicle v3 = new Vehicle();
        v3.price = 1200000;
        System.out.println("Price of vehicle == " + v3.price);

        Vehicle v4 = new Vehicle();
        v4.engineNo = 789654123L;
        System.out.println("Engine number == " + v4.engineNo);

        Vehicle v5 = new Vehicle();
        v5.type = 'C';
        System.out.println("Vehicle type == " + v5.type);

        Vehicle v6 = new Vehicle();
         v6.brand = "Tata";
        System.out.println("Brand name == " + v6.brand);

        Vehicle v7 = new Vehicle();
        v7.owner = "Ravi Kumar";
        System.out.println("Owner name == " + v7.owner);
		
		 Vehicle v8 = new Vehicle();
        v8.gst = 1235.2726f;
        System.out.println("gst == " + v8.gst);
		
		 Vehicle v9 = new Vehicle();
        v9.mileage = 20.5;
        System.out.println("Mileage == " + v9.mileage);
		
		 Vehicle v10 = new Vehicle();
        v10.isAvailable = true;
        System.out.println("vehicle isAvailable== " + v10.isAvailable);

    }
}
