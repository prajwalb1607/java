class Bank {
    public static void account(String holder) {
        System.out.println("Account holder: " + holder);
    }

    public static void account(int accountNo) {
        System.out.println("Account number: " + accountNo);
    }

    public static double account(String holder, double balance) {
        return balance;
    }

    public static void main(String[] args) {
        account("Ramesh");
        account(12345);
        double balance = account("Suresh", 50000.50);
        System.out.println("Balance: " + balance);
    }
}
