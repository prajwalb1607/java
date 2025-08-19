class Jio{
       public static void main(String [] args){
       //for loop(reverse)
	   int i;
	   String teluguMovies[]={"rrr","bahubali","pushpa","devara","ega"};
	   for(i=teluguMovies.length -1;i>=2;i--){
	   System.out.println("teluguMovies are :"+teluguMovies[i]);
	   }
	    
		//for each
	   	   
		   for(String movies:teluguMovies){
			   System.out.println("teluguMovies are ;"+movies);
		   
	  }
	  //for loop (forward)
	  	for(i=0;i<teluguMovies.length;i++){
	   System.out.println("teluguMovies are :"+teluguMovies[i]);
		}
	  
	 }
}