package day4;

import java.util.Scanner;

public class EvenChecker {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's even: ");

        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            if (isEven(input)) {
                System.out.println(input + " is even.");
            } else {
                System.out.println(input + " is odd.");
            }
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }
}