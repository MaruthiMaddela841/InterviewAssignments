package in.ineuron.assignment_4;

import java.util.Scanner;

public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new bank account with an initial balance
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        int choice;
        do {
            // Display menu options
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3: // Check balance
                    System.out.println("Current balance: $" + account.getBalance());
                    break;

                case 4: // Exit
                    System.out.println("Thank you for using the Bank Account Simulation. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}