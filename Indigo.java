class Indigo extends Airline {
    public static void main(String[] args) {
        Airline.bookTicket();
        Airline.cancelTicket();

        Indigo i = new Indigo();
        i.checkIn();
        i.boardFlight();
    }
}
