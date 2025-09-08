class Table3{
       
             public static void main(String [] args){
			 int i;
			 boolean[] isAvailable={true,false,true,false,true};
			 isAvailable[3]=false;
			 for(boolean car : isAvailable){
			 
			 System.out.println("car is available :"+car);
			 for(i=0;i<car.length;i++){
				 System.out.println("car is available:"+car[i]);
			 }
	
			}
		}
}