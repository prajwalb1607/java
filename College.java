class College {
    public static void details(String name) {
        System.out.println("Name: " + name);
    }

    public static void details(int age) {
        System.out.println("Age: " + age);
    }

    public static int details(String name, int age) {
		if(name=="sagar"){
			return 22;
		}
		if(name=="prajwal"){
			return 23;
		}
		if(name=="kumar"){
			return 24;
		}
        return 0;
    }

    public static void main(String[] args) {
        details("kumar");
        details(21);
       int info = details("sagar", 22);
        System.out.println(info);
    }
}
