package com.myutils;

import java.util.Random;

/**
 * A utility class located in a different package.
 */
public class RandomUtil {

    /**
     * Generates a random integer between min and max (inclusive).
     */
    public static int generateRandom(int min, int max) {
        if (min >= max) {
            return min;
        }
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}