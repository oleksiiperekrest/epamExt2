package com.company.lesson1.homework1;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        int i1 = 15;



        System.out.println("fibonacciSequenceCyclic of " + i1);
        System.out.println(Arrays.toString(fibonacciSequenceCyclic(i1)));

    }

    private static int fibonacciNumberCyclic(int number) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        for (int i = 0; i < number; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n3;
    }

    private static int[] fibonacciSequenceCyclic( int number) {
        int[] sequence = new int[number];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < number; i++) {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }

        return sequence;
    }


    private static int fibonacciNumberRecursive(int number) {
        return 0;
    }


    }
