class PhonePay{
public static void transaction(String accountName){
System.out.println("name in the account="+accountName);
}
public static void transaction(String accountName,int balance){
System.out.println("balance in the account="+balance);
}
public static void main(String [] args){
transaction("prajwal");
transaction("prajwal",120);
}
}