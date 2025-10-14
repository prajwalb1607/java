class Teacher {
    String name;
    int id;
    char grade;
    double salary;

    Teacher() {
        this("Ravi Kumar");
        System.out.println("No-args constructor");
    }

    Teacher(String name) {
        this(name, 101);
        System.out.println("One-arg constructor");
    }

    Teacher(String name, int id) {
        this(name, id, 'A');
        System.out.println("Two-args constructor");
    }

    Teacher(String name, int id, char grade) {
        this(name, id, grade, 55000.0);
        System.out.println("Three-args constructor");
    }

    Teacher(String name, int id, char grade, double salary) {
        System.out.println("Four-args constructor");
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();
        System.out.println("\nName: " + t.name);
        System.out.println("ID: " + t.id);
        System.out.println("Grade: " + t.grade);
        System.out.println("Salary: ₹" + t.salary);
    }
}
