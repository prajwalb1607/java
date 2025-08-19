class Amazon{
          public static void main(String [] args){
		 // for each
		 int i;
		  String tamilMovies[]={"jailer","coolie","vikram","kaithi","leo","master"};
		  for(String movies :tamilMovies){
		  System.out.println("tamilMovies are :"+movies);
		  
		  }
		  // for loop(reverse)
			  
			  for(i=tamilMovies.length-1;i>=0;i--){
				  System.out.println("tamilMovies are :"+tamilMovies[i]);
			  }
		//for loop(forward)
		
		
	          for(i=0;i<tamilMovies.length;i++){
				  System.out.println("tamilMovies are :"+tamilMovies[i]);
		}
}
}
		  