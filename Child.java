class Child extends Parent {
    void generation3() {
        System.out.println("This is the Child generation");
    }
	
	void name(){
     System.out.println("child  name ");
	}

    public static void main(String[] args) {
        Child c = new Child();
        c.generation1();
        c.generation2();
        c.generation3();
		GrandParent g=new Parent();
		g.name();
		Parent p=new Child();
		p.name();
		GrandParent g1=new Child();
		g1.name();
    }
}