class Jeep{

public static void start(byte gears,int price,short no,long phoneNo,boolean is){
System.out.println("gears of jeep="+gears);
System.out.println("price of jeep="+price+"\n no of jeep="+no+"\n phoneNo os jeep driver="+phoneNo+"\n driver is avaiable="+is);
}
public static void close(float gst,double sgst,int price,String name){
	System.out.println(gst);
System.out.println(sgst);
	System.out.println(price);
	System.out.println(name);
}
public static void details(byte gears,int price,short no,long phoneNo,boolean is){
		System.out.println(gears);
			System.out.println(price);
			System.out.println(no);
				System.out.println(phoneNo);
					System.out.println(is);
}
public static void run(float gst,double sgst,int price,String name){
	System.out.println(gst);
System.out.println(sgst);
	System.out.println(price);
	System.out.println(name);
}
public static void main(String [] args){
  start((byte)5,1233,(short)122,12929292l,true);
  close(127.292928f,12.292928d,27299,"sagar");
  details((byte)82,28282,(short)1818,818818188l,false);
  run(1355.3838f,1332,2727d,234435,"kumar");

}
}

