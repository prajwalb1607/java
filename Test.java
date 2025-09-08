1. java is high level programming langauage which is used to run and execute a programm
2. bytecode is exceute a code without a main program
3. jdk is java developement tool kit it  is a software environment tool to run and exceute a program
   jdk has have jre and build tools
   build tools like javac: it is a complier to complies a code
   javadoc,jar,
   jre is a java run time environment it is having jvm and some set of libaries
   jvm is a java virtual machine
   jvm needs a main program without main program code will not exceute
   
4. jvm is a java virtual machine
   jvm needs a main program without main program code will not exceute
   
   
5. varibles is a name given to the memoty address
types are: 1.local varibles
            2. static varibles
			3.non static varibles
			4.prameterized varibles
			
  local varibles:it is decalare inside a method 
  static varibles:it is decalare at level of class
  non static varibles:it is decalare inside a class
  

6.datatype is a type of data which varible refer to
 2 type of datatypes
  1.prmitive datatype
  2.non prmitive datatype
  1. prmitive datatype:it is a predefined datatype in which it has a fixed size
  it has 8 types 
  byte :1 byte =8bits
  short :2byte =16bits
  int :4byte=32bits
  long :8byte=64bits
  char :2byte=8bits
  float :4byte=16bits
  double :8byte=32bits
  boolean :1byte=8bits
  
  2.non prmitive datatype:it is a predefined datatype in which itis not fixed size
  types :string
          array
		  custom class
7. array is a set of element with same type
  ex:String [] name="sagar";
  program:
  class array{
  public static void main (String [] args){
  int [] age=27;
  System.out.println("age is ="+age);
  }
}

8. local varibles is declare at level or inside method
 ex int age=36;
 static varible is declare at level of class with keyword static
 ex :class age{
     static int age=37;

9. methods are the block of code which perform a some specific task

10.static varible is declare at level of class with keyword static
 ex :class Age{
     static int age=37;
	 public static void main(String args[]){
	 System.out.println(age);
	 }
	}

11. method chaining is linking a method with another method

class Sagar {
    public static void wakeUp() {
        System.out.println("kumar wakes up at 7:00 AM");
		study();
    }
    public static void study() {
        System.out.println("kumar studies from 8:00 AM to 10:00 AM");
		attendClass();
    }
    public static void attendClass() {
        System.out.println("kumar attends class at 11:00 AM");
	}
	public static void main (String [] args){
		wakeUp();
	}
}

12.default values are the value from the datatype of static varibles 
static varible provides a default values

13. local varibles program
class Name{
	public static void main(String args[]){
		byte ram=36;
		System.out.println("ram size is ="+ram);
	}
}
     static varible program
	 class Ram{
		 static long number=7090282297l;
		 public static void main(String args[]){
			 System.out.println("number is ="+number);
		 }
	 }





	 
   
   