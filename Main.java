class Main{
public static void main(String[] args){
int []num={1,5,7,9,7};
			 num[4]=10;
			 switch(7){
				 case 1: 
				 System.out.println("the number is 1");
				 break;
				 case 5:
				 System.out.println("the number is 5");
				 break;
				 case 7:
				 System.out.println("the number is 7");
				   if(!(num[0]==5&&num[2]<4)){
					   System.out.println("true");
				   }else{
					   System.out.println("false");
				   }
					   
				 break;
				 case 10:
				 System.out.println("the number is 10");
				 break;
				 
			default:
			System.out.println("unknown");
			}
			}
			}