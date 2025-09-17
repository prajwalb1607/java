class Book{
static byte size;
static short no;
static int price;
static long number;
static char series;
static float gst;
static double sgst;
static boolean isAvailable;
static String name;
public static byte size(){
	size=21;
return size;
}
public static short no(){
return 1289;
}
public static int price(){
return 1236;
}
public static long number(){
return 7092927289l;
}
public static char series(){
	return 'D';
}
public static float gst(){
	return 134.171f;
}
public static double sgst(){
	return 12.1717;
}
public static boolean isAvailable(){
	return true;
}
public static String name(){
	return "vision";
}
public static void main(String [] args){
	System.out.println(size());
	System.out.println(no());
	System.out.println(price());
	System.out.println(number());
	System.out.println(series());
	System.out.println(gst());
	System.out.println(sgst());
	System.out.println(isAvailable());
    System.out.println(name());
}
}