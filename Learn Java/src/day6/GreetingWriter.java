package day6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Prompts the user for a name and writes a greeting to greeting.txt.
 */
public class GreetingWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Use try-with-resources to ensure the file is closed automatically
        try (FileWriter writer = new FileWriter("greeting.txt")) {
            writer.write("Hello, " + name + "!");
            System.out.println("Successfully wrote to greeting.txt");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}