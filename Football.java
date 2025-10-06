class Football {
    public Football() {
        System.out.println("this is no args constructor");
    }

    public Football(String teamName, int teamValue) {
        System.out.println("teamName is = " + teamName + "\nteamValue is = " + teamValue);
    }

    public Football(int trophies, String captain) {
        System.out.println("no of trophies won = " + trophies + "\nteam captain is = " + captain);
    }

    public static void main(String args[]) {
        new Football();
        new Football("Manchester United", 1892);
        new Football(20, "Bruno Fernandes");
    }
}
