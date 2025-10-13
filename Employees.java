class Employees {
    int id;
    String name;
    String department;
    double salary;

    Employees(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working in " + department);
        attendMeeting();
    }

    void attendMeeting() {
        System.out.println(name + " is attending a meeting.");
        showSalary();  
    }

    void showSalary() {
        System.out.println(name + "'s salary is " + salary);
    }

    public static void main(String[] args) {
        Employees obj = new Employees(201, "Rohan", "IT", 60000);
      
		System.out.println(obj.id);
		System.out.println( obj.name);
		System.out.println( obj.department);
		System.out.println( obj.salary);

        obj.work(); 
    }
}
