package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StoryReader {
    public static void main(String[] args) {
        File file = new File("story.txt");

        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("--- Reading story.txt ---");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file 'story.txt' was not found. Please ensure it exists.");
        }
    }
}