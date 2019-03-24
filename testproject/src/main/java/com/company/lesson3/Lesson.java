package com.company.lesson3;

import java.util.Arrays;

public class Lesson {

    public static void main(String[] args) {


    }

    private static void sums() {
        int result1 = sum(1, 2);
        int result2 = sum(1, 2, 3);
        int[] arr = {1, 2, 3, -3, 4};
        int result3 = sum(arr);
        int result4 = sum(2,3,4,5);
        int result5 = sum (3);

        System.out.println(result5);
    }

//    private static int sum(int a, int... arg) {
//        return 0;
//    }

    private static int sum(int... arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

//    private static int sum(int[] arr) {
//        int sum = 0;
//        for (int element : arr) {
//            sum += element;
//        }
//        return sum;
//    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static void arrays() {
        int[] arr1 = new int[10];
        int[][] arr2 = new int[10][];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = new int[i + 1];
        }

        for (int[] element : arr2) {
            System.out.println(Arrays.toString(element));
        }
    }
}
