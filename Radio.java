class Radio{
public Radio(){
System.out.println("no args constructor");
}
public Radio(int price){
System.out.println("one args constructor");
System.out.println("price of the radio=="+price);
}

public static void main(String args []){
new Radio();
new Radio(1000);
}
}