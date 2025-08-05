package practice2;

public class BankAccount {
    int accountNumber;
    double balance;
    String accountHolderName;

    BankAccount(int a, double b, String n){
        this.accountNumber = a;
        this.balance = b;
        this.accountHolderName = n;
    }

     void deposit(double balance){
        this.balance += balance;
        System.out.println("Deposited: " + balance);
        System.out.println("New Balance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(1, 22, "John Doe");
        System.out.println("Account Number: " + myAccount.accountNumber);
        myAccount.deposit(1000);
    }
}
