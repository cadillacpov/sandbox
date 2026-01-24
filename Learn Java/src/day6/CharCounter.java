package day6;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;

/**
 * Counts non-whitespace characters in a file.
 */
public class CharCounter {
    public static void main(String[] args) {
        String fileName = "story.txt";
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File " + fileName + " does not exist. Run GreetingWriter or create it first.");
            return;
        }

        int charCount = 0;

        try (FileReader reader = new FileReader(file)) {
            int data;
            while ((data = reader.read()) != -1) {
                char ch = (char) data;
                // Check if the character is NOT a whitespace character
                if (!Character.isWhitespace(ch)) {
                    charCount++;
                }
            }
            System.out.println("Total non-whitespace characters in " + fileName + ": " + charCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}