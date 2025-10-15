class Sport {
    byte teamSize;
    short totalMatches;
    int ranking;
    long matchId;
    char category;
    String sportName;
    String captain;
    float averageScore;
    double winPercentage;
    boolean isOlympic;

    public static void main(String args[]) {
        Sport s1 = new Sport();
        s1.teamSize = 11;
        System.out.println("Team Size == " + s1.teamSize);
		Sport s11 = new Sport();
        s11.teamSize = 11;
        System.out.println("Team Size == " + s1.teamSize);

        Sport s2 = new Sport();
        s2.totalMatches = 85;
        System.out.println("Total Matches == " + s2.totalMatches);

        Sport s3 = new Sport();
        s3.ranking = 2;
        System.out.println("World Ranking == " + s3.ranking);

        Sport s4 = new Sport();
        s4.matchId = 9876543210L;
        System.out.println("Match ID == " + s4.matchId);

        Sport s5 = new Sport();
        s5.category = 'A';
        System.out.println("Category == " + s5.category);

        Sport s6 = new Sport();
        s6.sportName = "Cricket";
        System.out.println("Sport Name == " + s6.sportName);

        Sport s7 = new Sport();
        s7.captain = "Rohit Sharma";
        System.out.println("Captain == " + s7.captain);

        Sport s8 = new Sport();
        s8.averageScore = 245.5f;
        System.out.println("Average Team Score == " + s8.averageScore);

        Sport s9 = new Sport();
        s9.winPercentage = 78.32;
        System.out.println("Win Percentage == " + s9.winPercentage);

        Sport s10 = new Sport();
        s10.isOlympic = false;
        System.out.println("Is Olympic Sport == " + s10.isOlympic);
    }
}
