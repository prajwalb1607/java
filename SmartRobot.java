class SmartRobot extends Robot {
    void work() { 
	System.out.println("Smart robot cleaning the floor"); 
	}
    void speak() { 
	System.out.println("Smart robot speaking multiple languages");
	}

    public static void main(String[] args) {
	         Robot.powerOn();
			 Robot.powerOff();
        Robot r = new Robot();
        r.work();
		r.speak();

        SmartRobot s = new SmartRobot();
        s.work(); 
		s.speak();

        Robot r2 = new SmartRobot();
        r2.work();
		r2.speak();
		r2.powerOff();
    }
}