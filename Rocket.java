class Rocket extends Satellite {
    void agency() {
        System.out.println("Rocket launched successfully!");
    }
  public static void main(String[] args) {
        SpaceAgency s = new Satellite();
        s.agency();
		Satellite s1=new Rocket();
		s1.agency();
		SpaceAgency s2=new Rocket();
		s2.agency();
       
		
		
    }
}