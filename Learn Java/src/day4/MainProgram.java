package day4;

// Importing the class from the com.myutils package
import com.myutils.RandomUtil;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Random Number Generator ---");
        System.out.print("Enter minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter maximum value: ");
        int max = scanner.nextInt();

        // Using the static method from the imported class
        int result = RandomUtil.generateRandom(min, max);

        System.out.println("Generated Random Number: " + result);
        scanner.close();
    }
}