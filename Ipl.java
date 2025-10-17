class Ipl extends Cricket {
    void league() {
        System.out.println("IPL is a cricket league in India");
    }

    public static void main(String[] args) {
        Ipl i = new Ipl();
        i.play();
        i.team();
        i.league();
		
	
	   Sports s=new Sports();
	   s.play();
	
	    Cricket c=new Cricket();
		c.team();
		c.play();
    }
}