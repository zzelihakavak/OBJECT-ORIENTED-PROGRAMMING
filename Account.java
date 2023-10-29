import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;
    private String password;

    public Account(String ownerName, double initialBalance, String password) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.password = password;
    }

    public Account(String ownerName) {
        this(ownerName, 0, null);
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("%.2f$ deposited into the account%n", amount);
    }

    public boolean withdraw(double amount, String enteredPassword) {
        if (this.password.equals(enteredPassword)) {
            if (this.balance >= amount) {
                this.balance -= amount;
                System.out.printf("Withdrawal of %.2f$ completed%n", amount);
                return true;
            } else {
                System.out.println("Insufficient funds in your account");
            }
        } else {
            System.out.println("Incorrect password, please try again");
        }
        return false;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public static void main(String[] args) {

        Account account = new Account("John Doe", 1000.0, "securepassword");

        System.out.println("Account balance: " + account.getBalance());

        boolean withdrawalSuccessful = account.withdraw(500.0, "securepassword");

        if (withdrawalSuccessful) {
            System.out.println("New balance after withdrawal: " + account.getBalance());
        }
    }
}
