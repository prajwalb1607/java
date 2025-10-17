class VisaCard extends CardPayment {
    void provider() {
        System.out.println("Provider: VISA");
    }
	void type(){
		  System.out.println("payment type is online");
	}
 public static void main(String[] args) {
        VisaCard v = new VisaCard();
        v.type();
        v.cardType();
        v.provider();
		
		Payment p=new CardPayment();
		p.type();
		CardPayment c=new VisaCard();
		c.type();
		Payment p1=new VisaCard();
		p1.type();
		
    }
}