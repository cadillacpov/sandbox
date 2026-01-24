package day2;

import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        // Ensure input is an integer to prevent crashes
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();

            if (age < 0) {
                System.out.println("Invalid age entered.");
            } else if (age < 18) {
                System.out.println("You are a minor.");
            } else if (age <= 64) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a senior citizen.");
            }
        } else {
            System.out.println("Error: Please enter a valid numerical age.");
        }

        scanner.close();
    }
}