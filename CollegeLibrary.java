class CollegeLibrary extends Library {
    public static void main(String[] args) {
        Library.addBook();
        Library.removeBook();

        CollegeLibrary c = new CollegeLibrary();
        c.issueBook();
        c.returnBook();
    }
}
