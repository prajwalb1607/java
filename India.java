class India{
       public static void main(String [] args){
		 int i;
	//for loop(reverse)
	   String stateOfindia[]={"karnataka","kerala","tamilNadu","telagana","andraPradesh"};
	   for( i=stateOfindia.length-1;i>=0;i--){
	   System.out.println("stateOfindia are :"+stateOfindia[i]);
	   }
	
	//for each
	   
	  for(String state:stateOfindia){
		   System.out.println("stateOfindia are :"+state);
	   
	  }
	  //for loop(foeward)
	  	   for( i=0;i<stateOfindia.length;i++){
	   System.out.println("stateOfindia are :"+stateOfindia[i]);
		   }
	}
}