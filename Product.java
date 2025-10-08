class Product{
byte id;
short ram;
int price;
char series;
String name;
Product(){
System.out.println("no args constructor");
}
Product(int price){
System.out.println("one args constructor");
System.out.println("price of the phone is == "+price);
}
Product(int price,String name){
System.out.println("two args constructor");
System.out.println("price of the phone is == "+price);
System.out.println("name of the phone is == "+price);
}
public static void main(String args []){
Product obj=new Product();
obj.id=123;
obj.ram=322;
obj.price=13242;
obj.series='A';
obj.name="phone";
System.out.println("id of the product is == "+obj.id);
System.out.println("ram  of the product is == "+obj.ram);
System.out.println("price of the product is == "+obj.price);
System.out.println("series of the product is == "+obj.series);
System.out.println("name of the product is == "+obj.name);
Product obj1=new Product(12562);
obj1.id=112;
obj1.ram=124;
obj1.series='C';
obj1.name="vivo";
System.out.println("id of the product is == "+obj1.id);
System.out.println("ram  of the product is == "+obj1.ram);
System.out.println("series of the product is == "+obj1.series);
System.out.println("name of the product is == "+obj1.name);
Product obj2=new Product(1323,"phone");
obj2.id=16;
obj2.ram=122;
System.out.println("id of the product is == "+obj2.id);
System.out.println("ram  of the product is == "+obj2.ram);

}
}


