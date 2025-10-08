class Singer {
    byte id;
    short albums;
    int followers;
    char category;
    String name;

    Singer() {
        System.out.println("no args constructor");
    }

    Singer(int followers) {
        System.out.println("one args constructor");
        System.out.println("Followers == " + followers);
    }

    Singer(int followers, String name) {
        System.out.println("two args constructor");
        System.out.println("Followers == " + followers);
        System.out.println("Singer name == " + name);
    }

    public static void main(String args[]) {
        Singer s1 = new Singer();
        s1.id = 1;
        s1.albums = 10;
        s1.followers = 1000000;
        s1.category = 'P';
        s1.name = "vijay prakash";
        System.out.println("Singer == " + s1.name);
        System.out.println("Followers == " + s1.followers);

        Singer s2 = new Singer(2000000);
        Singer s3 = new Singer(5000000, "Shreya Ghoshal");
    }
}
