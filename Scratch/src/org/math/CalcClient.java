package org.math;

import java.util.ArrayList;
import java.util.List;

import static org.math.Calculator.*;

class CalcClient {
    public static void main(String[] args) {

        double sum = Calculator.add(1.5, 4.5);
        System.out.println("sum is" + sum);


        double a = 8.7;
        double b = 3.5;
        double addResult = add(a, b);
        double subResult = subtract(a, b);

        System.out.println("sum is : " + addResult);
        System.out.println("sub is : " + subResult);

        boolean result = isEven(9);
        System.out.println("Result is : " + result);

        System.out.println(randomInt());

        System.out.println(randomInt(7, 26));
        System.out.println("The sum is : " + addResult);

        double avg = average(3, 5, 10, 13);  // should be 7.75
        System.out.println("The average is : " + avg);

        int winner = Calculator.randomInt(5, 20);
        System.out.println("The winner is : " + winner);

        double average = Calculator.average(3, 5, 10, 13);
        System.out.println("The average is : " + average);
        System.out.println();

        List<Integer> inputs = new ArrayList<>();
        inputs.add(5);
        inputs.add(7);
        inputs.add(1);
        int smallest = Calculator.findMin(inputs);
        System.out.println("The smallest is : " + smallest);
    }


}