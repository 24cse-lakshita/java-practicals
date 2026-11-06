
class BankAccount {

    // Private instance variables
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String name, int number, double balance) {
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = balance;
    }

    // Getter methods
    String getAccountHolder() {
        return accountHolder;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } 
        else {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class practical10 {
    public static void main(String[] args) {

        // Creating bank account object
        BankAccount b = new BankAccount("Rahul", 101, 5000);

        System.out.println("Initial Account Details:");
        b.displayDetails();

        System.out.println("\nValid Deposit:");
        b.deposit(2000);

        System.out.println("\nInvalid Deposit:");
        b.deposit(-500);

        System.out.println("\nValid Withdrawal:");
        b.withdraw(1000);

        System.out.println("\nInvalid Withdrawal:");
        b.withdraw(-200);

        System.out.println("\nWithdrawal Greater Than Balance:");
        b.withdraw(10000);

        System.out.println("\nFinal Account Details:");
        b.displayDetails();
    }
}
