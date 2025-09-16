class Default{
static byte age=27;
static short amount=2700;
static int price=19000;
static long number=7203637727l;
static char series='A';
public static void local(){
	float gst=128.202092f;
	double sgst=272.20298;
	boolean available=true;
	String movie="kgf";
System.out.println("gst is :"+gst);
System.out.println("sgst is :"+sgst);
System.out.println("available is :"+available);
System.out.println("movie name is :"+movie);
}
public static void watch(){
	System.out.println("watching a movie kgf");
}

public static void main(String[] args){
System.out.println("age is :"+age);
System.out.println("amount is :"+amount);
System.out.println("price is :"+price);
System.out.println("number is :"+number);
System.out.println("series is :"+series);
local();
watch();
}
}