public class BankSystem {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankSystem(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Static method to calculate 13% interest
    public static double calculateInterest(double amount) {
        return amount * 0.13;
    }

    // Simple program to demonstrate usage
    public static void main(String[] args) {
        BankSystem account = new BankSystem("Alice", 1000.0);
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("After Deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("After Withdrawal: " + account.getBalance());

        double interest = BankSystem.calculateInterest(account.getBalance());
        System.out.println("13% Interest on Balance: " + interest);
    }
}
