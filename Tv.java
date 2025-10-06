class Tv{

public Tv(){
System.out.println("this is no args constructor");
}
public Tv(String channelName,int channelNo){
System.out.println("channelName is ="+channelName+"\n channelNo is ="+channelNo);
}
public Tv(int timing,String content){
System.out.println("timing of channel is ="+timing+"\n content of the channel="+content);
}
public static void main(String args []){
new Tv();
new Tv("star sports",455);
new Tv(9,"sports");
}
}