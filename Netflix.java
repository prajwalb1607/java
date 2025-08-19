class Netflix{
      public static void main(String [] args){
	//for loop(forward)
	  String kannadaMovies[]={"sarathi","om","jogi","kgf","rajakumara"};
	  int i;
	  for( i=0;i<kannadaMovies.length;i++){
       System.out.println("kannadaMovies are: " + kannadaMovies[i]);
	  }
	//for each
	  	  
		  for(String movies:kannadaMovies){
			  System.out.println("kannadaMovies are :"+movies);
	
		  }
	//for loop (reverse)
	      	  for( i=kannadaMovies.length-1;i>=0;i--){
       System.out.println("kannadaMovies are: " + kannadaMovies[i]);
	  }
	

       
    }
}

	  
	

