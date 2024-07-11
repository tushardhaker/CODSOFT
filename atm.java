
import java.util.Scanner;
// Define a simple Account class to hold balance and perform operations
class Account {
    private double balance;

    public Account(double initial_Balance) { 
        this.balance = initial_Balance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }
}

public class atm {
    public static void main(String[] args) {
        
        Account account = new Account(1000.0); // Initial balance set to 1000.0

        Scanner scanner = new Scanner(System.in);
        int choice;

        // ATM Interface for checking conditions ..
        do {
            System.out.println("ATM Interface");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Current Balance: " + account.checkBalance());
                    break;
                case 2:
                    // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    // Exit
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
            }// Bank line
            System.out.println(); 
        } while (choice != 4);

        scanner.close();
    }
}
