class Sbi extends Banks {
	public void checkBalance() { 
	System.out.println("Check balance"); 
	}
   public void loan() { 
   System.out.println("Apply for loan"); 
	Banks.deposit();
   }
public static void main(String args []){
Banks.withdraw();
Banks b=new Banks();
b.checkBalance();
b.loan();
Sbi s = new Sbi();
s.checkBalance();
s.loan();
Banks b1=new Sbi();
b1.checkBalance();
b1.loan();	
}
}