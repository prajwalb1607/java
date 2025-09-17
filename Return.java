class Return{
    public static byte age() {
        return 25;
    }

    public static short year() {
        return 2025;
    }

    public static int salary() {
        return 50000;
    }

    public static long population() {
        return 1400000000L;
    }

    public static char grade() {
        return 'A';
    }

    public static float temperature() {
        return 36.6f;
    }

    public static double price() {
        return 9999.99;
    }

    public static boolean isJavaFun() {
        return true;
    }

    public static String city() {
        return "Bangalore";
    }
	
public static void main(String [] args){
	byte ages=age();
	System.out.println(ages);
    System.out.println(year());
	System.out.println(salary());
	System.out.println(population());
	System.out.println(grade());
	System.out.println(temperature());
	System.out.println(price());
	System.out.println(isJavaFun());
	System.out.println(city());
}
}
