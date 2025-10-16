class Indigo extends Airline {
	public  void bookTicket() { 
	System.out.println("Ticket is booked"); 
	}
    public  void cancelTicket() {
	System.out.println("Ticket is cancelled"); 
	}

    void checkIn() {
	System.out.println("Checked into flight"); 
	}
    void boardFlight() {
	System.out.println("Boarding is  flight");
	}	
    public static void main(String[] args) {

        Airline a=new Airline();
		a.boardFlight();
		a.cancelTicket();
        a.checkIn();
        a.boardFlight();
		
		Airline i=new Indigo();
		i.boardFlight();
		i.cancelTicket();
		i.checkIn();
		i.boardFlight();
    }
}
