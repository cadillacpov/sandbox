package day2;

public class Countdown {
    public static void main(String[] args) {
        System.out.println("Initiating countdown...");

        // Loop from 10 down to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i + "...");

            try {
                // Brief pause to simulate a real countdown effect
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Lift-off!");
    }
}