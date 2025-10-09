class Run{
public static void main(String args []){
Watchs obj=new Watchs(10000,"Rolex");
System.out.println("price of the watch is == "+obj.price);
System.out.println("brand of the watch is == "+obj.brand);
       System.out.println();

Watchs obj1=new Watchs(1000,"titan");
System.out.println("price of the watch is == "+obj1.price);
System.out.println("brand of the watch is == "+obj1.brand);
       System.out.println();


Watchs obj2=new Watchs(1002,"Neotime");
System.out.println("price of the watch is == "+obj2.price);
System.out.println("brand of the watch is == "+obj2.brand);
       System.out.println();

 Headphone h1 = new Headphone(5999, "Sony", 0.25f, true);
        System.out.println("Price of headphone == " + h1.price);
        System.out.println("Brand == " + h1.brand);
        System.out.println("Weight == " + h1.weight);
        System.out.println("Wireless == " + h1.wireless);
        System.out.println();

        Headphone h2 = new Headphone(2999, "Boat", 0.30f, true);
        System.out.println("Price of headphone == " + h2.price);
        System.out.println("Brand == " + h2.brand);
        System.out.println("Weight == " + h2.weight);
        System.out.println("Wireless == " + h2.wireless);
        System.out.println();

        Headphone h3 = new Headphone(1999, "Zebronics", 0.40f, false);
        System.out.println("Price of headphone == " + h3.price);
        System.out.println("Brand == " + h3.brand);
        System.out.println("Weight == " + h3.weight);
        System.out.println("Wireless == " + h3.wireless);
		       System.out.println();
		
		
        Game g1 = new Game("Valorant", 10, 2.5f);
        System.out.println("Game name == " + g1.name);
        System.out.println("Number of players == " + g1.players);
        System.out.println("Version == " + g1.version);
		       System.out.println();
 

        Game g2 = new Game("Chess", 2, 1.0f);
        System.out.println("Game name == " + g2.name);
        System.out.println("Number of players == " + g2.players);
        System.out.println("Version == " + g2.version);
		       System.out.println();
    

        Game g3 = new Game("PUBG", 100, 3.2f);
        System.out.println("Game name == " + g3.name);
        System.out.println("Number of players == " + g3.players);
        System.out.println("Version == " + g3.version);
		       System.out.println();
		
		
		  Shoe s1 = new Shoe("Nike", 5500, 9.0f, true);
        System.out.println("Brand == " + s1.brand);
        System.out.println("Price == " + s1.price);
        System.out.println("Size == " + s1.size);
        System.out.println("Sports shoe == " + s1.isSports);
        System.out.println();

        Shoe s2 = new Shoe("Puma", 4200, 8.5f, true);
        System.out.println("Brand == " + s2.brand);
        System.out.println("Price == " + s2.price);
        System.out.println("Size == " + s2.size);
        System.out.println("Sports shoe == " + s2.isSports);
        System.out.println();

        Shoe s3 = new Shoe("Bata", 2500, 7.0f, false);
        System.out.println("Brand == " + s3.brand);
        System.out.println("Price == " + s3.price);
        System.out.println("Size == " + s3.size);
        System.out.println("Sports shoe == " + s3.isSports);
}
}