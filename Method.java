class Method{
	public static void wakeUp(){
	System.out.println("sagar wake up at 9am");
	wentTobreash();
	}
	public static void wentTobreash(){
		System.out.println("sagar is wentTobreash at 9:30am");
		breakfast();
	}
	public static void breakfast(){
		System.out.println("sagar is eating a breakfast");
		wentTocourse();
	}
	public static void wentTocourse(){
		System.out.println("sagar is wentTocourse at 2:30pm");
		wentTosleep();
	}
	public static void wentTosleep(){
		System.out.println("sagar is wentTosleep ");
	}
public static void main(String args[]){
	wakeUp();
	
}
}
