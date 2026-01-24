package day2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * This program uses a HashMap to store state-capital pairs
 * and allows user lookup with error handling.
 */
public class StateCapitals {
    public static void main(String[] args) {
        HashMap<String, String> stateCapitals = new HashMap<>();

        // Populating the map
        stateCapitals.put("California", "Sacramento");
        stateCapitals.put("Texas", "Austin");
        stateCapitals.put("Florida", "Tallahassee");
        stateCapitals.put("New York", "Albany");
        stateCapitals.put("Washington", "Olympia");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a state name to find its capital: ");
        String state = scanner.nextLine();

        // Retrieve the capital, handling case sensitivity by checking exactly as stored
        // or you could normalize keys to lowercase
        if (stateCapitals.containsKey(state)) {
            System.out.println("The capital of " + state + " is " + stateCapitals.get(state) + ".");
        } else {
            System.out.println("Sorry, the state '" + state + "' is not in our database.");
        }

        scanner.close();
    }
}