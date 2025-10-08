class FootballPlayer {
    byte id;
    short matches;
    int goals;
    char grade;
    String name;

    FootballPlayer() {
        System.out.println("no args constructor");
    }

    FootballPlayer(int goals) {
        System.out.println("one args constructor");
        System.out.println("Goals scored == " + goals);
    }

    FootballPlayer(int goals, String name) {
        System.out.println("two args constructor");
        System.out.println("Goals scored == " + goals);
        System.out.println("Player name == " + name);
    }

    public static void main(String args[]) {
        FootballPlayer f1 = new FootballPlayer();
        f1.id = 7;
        f1.matches = 150;
        f1.goals = 120;
        f1.grade = 'A';
        f1.name = "Messi";
		   System.out.println("id== " + f1.id);
		      System.out.println("matches == " + f1.matches);
			     System.out.println("grade== " + f1.grade);
        System.out.println("Name == " + f1.name);
        System.out.println("Goals == " + f1.goals);
		

        FootballPlayer f2 = new FootballPlayer(80);
		f2.id=13;
		f2.matches=125;
		f2.grade='B';
		f2.name="Neymar";
		System.out.println("id== " + f1.id);
		System.out.println("matches == " + f1.matches);
	    System.out.println("grade== " + f1.grade);
        System.out.println("Name == " + f1.name);
        FootballPlayer f3 = new FootballPlayer(90, "Ronaldo");
    }
}
