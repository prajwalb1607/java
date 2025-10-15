class Pallindrome{
 public static void main(String [] args){
 String name="markram";
 String rev="";
 for(int i=name.length()-1;i>=0;i--){
 rev=rev+name.charAt(i);
 }
 if(name.equals(rev)){
 System.out.println("pallindrome");
 }else
 {
 System.out.println("not pallindrome");
 }
 }
 }
 