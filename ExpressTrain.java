class ExpressTrain extends Train {
    void travel() { 
	System.out.println("Express train travels at high speed"); 
	}
    void announce() { 
	System.out.println("Express train next station: Bengaluru");
	}
	public static void main(String[] args) {
		Train.startService(); 
		Train.stopService();
        Train t = new Train();
        t.travel(); 
		t.announce();
		
        ExpressTrain.startService(); 
		ExpressTrain.stopService();
        ExpressTrain e = new ExpressTrain();
        e.travel(); 
		e.announce();

        Train t2 = new ExpressTrain();
        t2.travel(); 
		t2.announce();
    }
}