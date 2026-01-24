package day6;

import java.util.Scanner;

/**
 * Performs division with specific handling for NumberFormat and Arithmetic exceptions.
 */
public class DivisionHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number (dividend): ");
            String input1 = scanner.next();
            System.out.print("Enter second number (divisor): ");
            String input2 = scanner.next();

            // This might throw NumberFormatException if input is not numeric
            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            // This might throw ArithmeticException if num2 is 0
            int result = num1 / num2;

            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid input. Please enter whole numbers only.");
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}