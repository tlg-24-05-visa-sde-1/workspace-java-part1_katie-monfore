package org.math;

import java.util.Collection;
import java.util.List;

import static java.lang.Math.*;

/*
 * This is an "all-static" class, i/e/, one with nothing but static methods
 * These methods are called from clients as Calulator.add(), Calculator.subtract(), etc.
 */
class Calculator {

    public static int findMin(List<Integer> values) {
        //pretend it was 5, 7, 1

        int smallest = values.get(0);

        for (Integer value : values) {
            if (value < smallest) {
                smallest = value;
            }
        }

        return smallest;
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double average(int first, int... rest) {
        double sum = first;
        for (double value : rest) {
            sum += value;
        }

        double result = (1.0 * sum) / rest.length;

        return sum;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    /*
     * indicates if the supplied integer is even or not.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static int randomInt(int min, int max) {
        int result = 0;

        double rand = Math.random();
        double scaled = (rand * (max - min + 1)) + min;
        result = (int) scaled;

        return result;
    }

    public static int randomInt(int max) {
        return randomInt(1, max);
    }

    /*
     * Returns a random integer between 1 and 16 (inclusive)
     */
    public static int randomInt() {
        return randomInt(1, 16);
    }

    /*
     * Returns a random integer between min and max (inclusive)
     */
    public static int randomInt(double min, double max) {
        return (int) ((Math.random() * (max - min + 1)) + min);
    }


}