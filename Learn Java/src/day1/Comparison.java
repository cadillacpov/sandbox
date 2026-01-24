package day1;

import java.util.Scanner;

public class Comparison {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = input.nextInt();

        System.out.print("Enter second number: ");
        int second = input.nextInt();

        boolean isLessOrEqual = first <= second;
        System.out.println(isLessOrEqual);
    }
}
