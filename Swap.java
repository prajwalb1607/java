class Swap{
public static void main(String [] args){
	int a=1,b=2;
	System.out.println("before swaping");
	System.out.println("a="+a+"b="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swaping");
	System.out.println("a="+a+"b="+b);
}
}