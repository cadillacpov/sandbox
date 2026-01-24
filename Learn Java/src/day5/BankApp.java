package day5;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.printf("Successfully deposited $%.2f%n", amount);
    }

    public void withdraw(double amount) {
        // Business Rule: Throw exception if funds are insufficient
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds! Transaction rejected.");
        }
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }
        balance -= amount;
        System.out.printf("Successfully withdrew $%.2f%n", amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(0.0); // Start with an empty account
        boolean running = true;

        System.out.println("=== Welcome to the Java Console Bank ===");

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.printf("Current Balance: $%.2f%n", account.getBalance());
                    break;

                case "2":
                    System.out.print("Enter deposit amount: ");
                    if (scanner.hasNextDouble()) {
                        double depAmount = scanner.nextDouble();
                        account.deposit(depAmount);
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear invalid token
                    }
                    break;

                case "3":
                    System.out.print("Enter withdrawal amount: ");
                    if (scanner.hasNextDouble()) {
                        double withAmount = scanner.nextDouble();
                        try {
                            account.withdraw(withAmount);
                        } catch (IllegalArgumentException e) {
                            // Catching the exception thrown by the BankAccount class
                            System.out.println("Operation Failed: " + e.getMessage());
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear invalid token
                    }
                    break;

                case "4":
                    running = false;
                    System.out.println("Thank you for using our service. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}