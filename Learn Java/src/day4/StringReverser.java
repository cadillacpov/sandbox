package day4;

import java.util.Scanner;

/**
 * Demonstrates string manipulation using a static method and StringBuilder.
 */
public class StringReverser {

    /**
     * Reverses a string using StringBuilder's built-in reverse method.
     * @param s The string to reverse
     * @return The reversed string
     */
    public static String reverseString(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = reverseString(input);

        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);

        scanner.close();
    }
}