class Teams extends Department {
    void team() {
        System.out.println("Team: Software Development Team");
    }
	void name() {
		 System.out.println(" Software Development Team");
    }
		

    public static void main(String[] args) {
	   Teams t=new Teams();
	   t.team();
       Company c=new Department();
	   c.name();
	   Department d=new Teams();
	   d.name();
	   Company c1=new Teams();
	   c1.name();
	   }
}