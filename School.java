class School {
    byte classrooms;
    short teachers;
    int students;
    long regNumber;
    char grade;
    String schoolName;
    String principal;
    double fees;

    public static void main(String args[]) {
        School s1 = new School();
        s1.classrooms = 25;
        System.out.println("Number of classrooms == " + s1.classrooms);

        School s2 = new School();
        s2.teachers = 150;
        System.out.println("Number of teachers == " + s2.teachers);

        School s3 = new School();
        s3.students = 2500;
        System.out.println("Total students == " + s3.students);

        School s4 = new School();
        s4.regNumber = 1234567890L;
        System.out.println("Registration number == " + s4.regNumber);

        School s5 = new School();
        s5.grade = 'A';
        System.out.println("School grade == " + s5.grade);

        School s6 = new School();
        s6.schoolName = "National Public School";
        System.out.println("School name == " + s6.schoolName);

        School s7 = new School();
        s7.principal = "Mr. Ramesh Kumar";
        System.out.println("Principal name == " + s7.principal);

        School s8 = new School();
        s8.fees = 45000.50;
        System.out.println("Annual fees == " + s8.fees);
    }
}
