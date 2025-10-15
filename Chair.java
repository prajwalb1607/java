class Chair{
public static void run(int price,String name){
System.out.println("price of the chair =="+price);
System.out.println("name of the chair =="+name);
}
public static void run(String name,char series){
System.out.println("name of the chair =="+name);
System.out.println("series of the chair =="+series);
}
public static void main(String args []){
run(1000,"anba");
run("am",'A');
}
}