package com.myutils;

import java.util.Random;

public class RandomUtil {

    public static int generateRandom(int min, int max) {
        if (min >= max) {
            return min;
        }
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}