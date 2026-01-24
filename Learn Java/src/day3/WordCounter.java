package day3;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This program counts the frequency of unique words in a user-provided sentence
 * using a HashMap.
 */
public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        // Split the sentence into words using whitespace as a delimiter
        // We also convert to lowercase and remove common punctuation for accuracy
        String[] words = input.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (word.isEmpty()) continue;

            // If word exists, increment count; otherwise, start at 1
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nWord frequencies:");
        for (String key : wordCounts.keySet()) {
            System.out.println(key + ": " + wordCounts.get(key));
        }

        scanner.close();
    }
}