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
	short years=year();
    System.out.println(years);
	int salaries=salary();
	System.out.println(salaries);
	long populations=population();
	System.out.println(populations);
	char grades=grade();
	System.out.println(grades);
	float temperatures=temperature();
	System.out.println(temperatures);
	double prices=price();
	System.out.println(prices);
	boolean fun=isJavaFun();
	System.out.println(fun);
	String cities=city();
	System.out.println(cities);
}
}
