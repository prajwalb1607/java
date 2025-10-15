1. i.local varible
static varible
instance varible
parameterized varible

local varible:varible is intialized and declare inside a method
static varible:varible is declare and intialized at level of class
instance varible:varible is declare at level of class with object 
parameterized varible:varible is declare inside  method parameter 

2.byte = 0
short=0,int=0,long=0,char=blank space,float=0.0, double=0.0,boolean=false,string=null

3. local varible do not have default values

4.static varible access at level of class with a keyword static

5.yes we can access non static varible inside a static varible belong to class and non static varible is belong to object it is own copies

6.method overloading: it having same method name and different parameter
constructor overloading: it having same constructor name and different parameter

7.no method overloading occur when having method name and different parameter

8.this keyword refer current object of the class 

9.static varible: is declare and intialized at level of class and access anywhere and it is belong to the class
instance varible: it is belong to their object and each object has their own copies

12.yes constructor is overloading

13.constructor: is a special type of method 
it is does not have a return type
constructor name should be same has class name

method: it is a block of code it perform a specific task
it is having a return type
method name should not be same has class name

14.constructor having a default constructor so it can be compile

15.we can call constructor from another constructor thourgh on-args constructor,and one-args constructor inside a class

16.no constructor do not have return type

17.class Radio{
int price;
Radio(int price){
this.price=price;
}
public static void main(String args []){
Radio obj=new Radio(1010);
System.out.println("price is =="+obj.price);
}
}

18.class Chair{
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

19.class Daily{
public static void wakeUp(){
System.out.println("wakeUp at time is 9");
}
public static void sleep(){


20.class Radio{
public Radio(){
System.out.println("no args constructor");
}
public Radio(int price){
System.out.println("one args constructor");
}

public static void main(String args []){
new Radio();
new Radio(1000);
}
}
