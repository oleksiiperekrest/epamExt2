package com.company.lesson1.homework1;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {


        for (int i = 20; i <= 20; i++) {

            int number = i;

            System.out.println("Fibonacci's number " + number + " found cyclically:");
            System.out.println(fibonacciNumberCyclic(number));

            System.out.println("Fibonacci's number " + number + " found recursively:");
            System.out.println(fibonacciNumberRecursive(number));

            System.out.println("fibonacciSequenceCyclic of " + number + ":");
            System.out.println(Arrays.toString(fibonacciSequenceCyclic(number)));


        }
    }

    public static int fibonacciNumberCyclic(int number) {

        if (number < 0) throw new IllegalArgumentException("Unacceptable negative input");

        if (number == 1) return 0;
        if (number == 2) return 1;

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 2; i < number; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }

    public static int[] fibonacciSequenceCyclic(int number) {


        if (number < 0) throw new IllegalArgumentException("Unacceptable negative input");

        int[] sequence = new int[number];
        if (number == 0) return sequence;

        sequence[0] = 0;
        if (number == 1) return sequence;

        sequence[1] = 1;
        if (number == 2) return sequence;

        for (int i = 2; i < number; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }


    public static int fibonacciNumberRecursive(int number) {
        if (number < 0) throw new IllegalArgumentException("Unacceptable negative input");

        if (number <= 1) return 0;
        if (number == 2) return 1;

        return fibonacciNumberRecursive(number - 1) + fibonacciNumberRecursive(number - 2);
    }



}
