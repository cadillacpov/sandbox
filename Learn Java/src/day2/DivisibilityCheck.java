package day2;

import java.util.Scanner;

/**
 * This program checks if a number is divisible by both 3 and 5.
 */
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check divisibility: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            // Check if divisible by both using the modulo operator (%)
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " is divisible by both 3 and 5.");
            } else {
                System.out.println(number + " is NOT divisible by both 3 and 5.");

                // Optional helpful feedback
                if (number % 3 == 0) System.out.println("It is only divisible by 3.");
                else if (number % 5 == 0) System.out.println("It is only divisible by 5.");
            }
        } else {
            System.out.println("Please provide a valid integer.");
        }

        scanner.close();
    }
}