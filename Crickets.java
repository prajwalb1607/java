class Crickets{
public Crickets(){
System.out.println("this is no args constructor");
}
public Crickets(String teamName,int teamValue){
System.out.println("teamName is ="+teamName+"\n teamValue is ="+teamValue);
}
public Crickets(int trophies,String captain){
System.out.println("no of trophies won="+trophies+"\n team captain is ="+captain);
}
public static void main(String args []){
new Crickets();
new Crickets("RCB",1772);
new Crickets(1,"Rajat Patidar");
}
}