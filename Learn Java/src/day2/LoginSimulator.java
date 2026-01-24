package day2;

import java.util.Scanner;

/**
 * This program simulates login handling using a switch statement
 * based on numeric status codes.
 */
public class LoginSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Login Status Code (0: Success, 1: Bad User, 2: Bad Pass):");

        if (scanner.hasNextInt()) {
            int statusCode = scanner.nextInt();

            // Using a switch statement to handle specific cases
            switch (statusCode) {
                case 0:
                    System.out.println("Login Successful! Welcome back.");
                    break;
                case 1:
                    System.out.println("Error: Username not found.");
                    break;
                case 2:
                    System.out.println("Error: Incorrect password.");
                    break;
                default:
                    System.out.println("Error: Unknown status code.");
                    break;
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}