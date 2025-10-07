class Team{
byte value;
short brand;
int price;
long number;
char series;
String teamName;
String teamLeader;
double gst;
public static void main(String args []){
Team obj=new Team();
obj.value=125;
System.out.println("value of the team is =="+obj.value);

Team obj1=new Team();
obj1.brand=1314;
System.out.println("brand of the team is == "+obj1.brand);

Team ref=new Team();
ref.price=12232;
System.out.println("price value  of the team == " +ref.price);


Team ref1=new Team();
ref1.series='I';
System.out.println("series team will playing  == " +ref1.series);


Team ref2=new Team();
ref2.teamName="RCB";
System.out.println(" team name is  == " +ref2.teamName);


Team ref3=new Team();
ref3.teamLeader="Rajat Patidar";
System.out.println("team leader is  == " +ref3.teamLeader);


Team ref4=new Team();
ref4.gst=123.27272;
System.out.println("gst value  of the team == " +ref4.gst);

}
}