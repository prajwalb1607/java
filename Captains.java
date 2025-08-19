class Captains{
       public static void main(String [] args){
		 int i;
	//for loop(reverse)
	   String indianCaptains[]={"viratKohli","msDhoni","rohitSharma","suhbhamGill","klrahul"};
	   for( i=indianCaptains.length-1;i>=0;i--){
	   System.out.println("indianCaptains are :"+indianCaptains[i]);
	   }
	
	      //for each
	   
	    for(String captains:indianCaptains){
		   System.out.println("indianCaptains are :"+captains);
		}
		//for loop(reverse)
	    for( i=0;i<indianCaptains.length;i++){
	   System.out.println("indianCaptains are :"+indianCaptains[i]);
		
		}
	}
}