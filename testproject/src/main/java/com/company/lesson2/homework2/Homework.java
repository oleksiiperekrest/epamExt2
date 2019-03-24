package com.company.lesson2.homework2;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        swap(arr, 0,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort (int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length-1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }

    public static void swap (int[] arr, int first, int second) {
        if ((first < 0 || first >= arr.length) || (second < 0 || second >= arr.length)) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int temp = arr[first];
        arr[first] =  arr[second];
        arr[second] = temp;
    }


}
