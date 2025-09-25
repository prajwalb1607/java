class Swiggy {
    public static void order(String dish) {
        System.out.println("You ordered 1 " + dish);
    }

    public static void order(int noOfOrders)	{
        System.out.println("You ordered " + noOfOrders+"items" );
    }

    public static int order(String dishName, int noOfOrders) {
       
	if (dishName=="idli"){ 
		return 100 * noOfOrders;
	}
    if (dishName=="dosa") {
	     return 80 * noOfOrders;
		}
    if (dishName=="pori") {
		return  90 * noOfOrders;
		 }
     return 0;
	}

    public static void main(String[] args) {
  order("idli");
      order(5);
        int total = order("dosa", 3);
        System.out.println("Total bill with delivery: " + total);
    }
}

