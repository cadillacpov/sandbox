package day3;

import java.util.Scanner;

/**
 * This program accepts five numbers into a primitive double array
 * and calculates their average.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];
        double sum = 0;

        System.out.println("Please enter 5 numbers:");

        // Loop to collect input and store in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
            }
            numbers[i] = scanner.nextDouble();
            sum += numbers[i]; // Accumulate the sum
        }

        // Calculate the average
        double average = sum / numbers.length;

        System.out.println("\nThe average of the numbers is: " + average);
        scanner.close();
    }
}