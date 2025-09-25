class Store {
    public static void buy(String item) {
        System.out.println("You bought 1 " + item);
    }

    public static void buy(int qty) {
        System.out.println("You bought " + qty + " items");
    }

    public static int buy(String item, int qty) {
        if (item=="shirt"){ 
			return 500*qty;
		}
        if (item=="jeans"){
			return 1200*qty ;
		}
        if (item=="shoes"){
			return 2500*qty;
		}
        return 0;
    }

    public static void main(String[] args) {
        buy("shirt");
        buy(3);
        int total = buy("jeans", 2);
        System.out.println("Total bill: " + total);
    }
}

