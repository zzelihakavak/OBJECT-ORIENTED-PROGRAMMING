import java.util.Scanner;

public class Account2 {
    private double balance;
    private String ownerName;
    private int password = 1234;
    private boolean isBlocked = false;

    public Account2(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public Account2(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public void add(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("%.2f$ added to the account%n", amount);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (isBlocked) {
            System.out.println("Your account is blocked.");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        int enteredPassword = input.nextInt();
        int tries = 0;

        while (tries < 3) {
            if (this.password == enteredPassword) {
                if (this.balance < amount) {
                    System.out.println("Insufficient balance. Withdrawal canceled.");
                    break;
                } else {
                    this.balance -= amount;
                    System.out.printf("%.2f$ withdrawn from the account%n", amount);
                    break;
                }
            } else {
                System.out.println("Wrong password, try again");
                tries += 1;
                if (tries < 3) {
                    System.out.print("Enter your password: ");
                    enteredPassword = input.nextInt();
                }
            }
        }

        if (tries == 3) {
            System.out.println("Your account is blocked.");
            isBlocked = true;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public static void main(String[] args) {
        Account2 account1 = new Account2("John", 1000.0);
        account1.add(500.0);
        account1.withdraw(200.0);
        System.out.println("Account Balance: " + account1.getBalance());

        Account2 account2 = new Account2("Alice");
        account2.add(200.0);
        account2.withdraw(300.0);
        System.out.println("Account Balance: " + account2.getBalance());
    }
}
