class AirIndia extends Flight {
    void takeOff() { 
	System.out.println("Air India flight taking off smoothly");
	}
    void land() {
	System.out.println("Air India flight landing on time"); 
	}

    public static void main(String[] args) {
	     Flight.openGate(); 
		 Flight.closeGate();
        Flight f = new Flight();
        f.takeOff(); f.land();

        AirIndia a=new AirIndia();
        a.takeOff();
		a.land();

        Flight f2 = new AirIndia();
        f2.takeOff(); 
		f2.land();
    }
}