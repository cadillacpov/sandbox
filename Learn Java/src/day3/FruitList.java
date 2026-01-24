package day3;

import java.util.ArrayList;

/**
 * This program demonstrates using an ArrayList and an enhanced for loop
 * to iterate over a collection of Strings.
 */
public class FruitList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding five favorite fruits
        fruits.add("Mango");
        fruits.add("Blueberry");
        fruits.add("Dragonfruit");
        fruits.add("Peach");
        fruits.add("Pomegranate");

        System.out.println("My favorite fruits are:");

        // Use an enhanced for loop (for-each) to print each fruit
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}