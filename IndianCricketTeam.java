class IndiaCricketTeam {
    byte totalPlayers;
    short totalMatches;
    int totalRuns;
    long teamCode;
    char grade;
    String teamName;
    String captain;
    float avgRunRate;
    double winPercentage;
    boolean worldCupWinner;

    public static void main(String args[]) {
        IndiaCricketTeam t1 = new IndiaCricketTeam();
        t1.totalPlayers = 11;
        System.out.println("Total Players == " + t1.totalPlayers);

        IndiaCricketTeam t2 = new IndiaCricketTeam();
        t2.totalMatches = 1025;
        System.out.println("Total Matches Played == " + t2.totalMatches);

        IndiaCricketTeam t3 = new IndiaCricketTeam();
        t3.totalRuns = 258740;
        System.out.println("Total Runs Scored == " + t3.totalRuns);

        IndiaCricketTeam t4 = new IndiaCricketTeam();
        t4.teamCode = 20251007L;
        System.out.println("Team Code == " + t4.teamCode);

        IndiaCricketTeam t5 = new IndiaCricketTeam();
        t5.grade = 'A';
        System.out.println("Team Grade == " + t5.grade);

        IndiaCricketTeam t6 = new IndiaCricketTeam();
        t6.teamName = "Team India";
        System.out.println("Team Name == " + t6.teamName);

        IndiaCricketTeam t7 = new IndiaCricketTeam();
        t7.captain = "Rohit Sharma";
        System.out.println("Captain == " + t7.captain);

        IndiaCricketTeam t8 = new IndiaCricketTeam();
        t8.avgRunRate = 6.45f;
        System.out.println("Average Run Rate == " + t8.avgRunRate);

        IndiaCricketTeam t9 = new IndiaCricketTeam();
        t9.winPercentage = 71.38;
        System.out.println("Win Percentage == " + t9.winPercentage);

        IndiaCricketTeam t10 = new IndiaCricketTeam();
        t10.worldCupWinner = true;
        System.out.println("World Cup Winner == " + t10.worldCupWinner);
    }
}
