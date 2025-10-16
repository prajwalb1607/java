class CollegeLibrary extends Library {
	
	public  void addBook() { 
	System.out.println("Adding some book"); 
	}
   public void removeBook() {
	System.out.println("Removing some book"); 
	}

   public void issueBook() {
	System.out.println("Issuing some book"); 
	}
   public void returnBook() {
	System.out.println("Returning some book");
   }	
    public static void main(String[] args) {

        Library c = new Library();
		c.addBook();
		c.removeBook();
        c.issueBook();
        c.returnBook();
		
		Library obj=new CollegeLibrary();
		obj.addBook();
		obj.removeBook();
		obj.issueBook();
		obj.returnBook();
    }
}
