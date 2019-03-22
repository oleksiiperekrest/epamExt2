package com.company.lesson2.homework2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HomeworkTest {

    private int[] arrInit =     {0, 5, 4, 6, 5, 2, 3, 1, 8, 7};
    private int[] arrSorted =   {0, 1, 2, 3, 4, 5, 5, 6, 7, 8};
    private int[] arrSwapped =  {7, 5, 4, 6, 5, 2, 3, 1, 8, 0};

    @Test
    public void bubbleSort() {
        int[] arr = arrInit;
        Homework.bubbleSort(arr);
        assertEquals(Arrays.toString(arrSorted), Arrays.toString(arr));
    }

    @Test
    public void swap() {
        int[] arr = arrInit;
        Homework.swap(arr, 9, 0);
        assertEquals(Arrays.toString(arrSwapped), Arrays.toString(arr));

    }
}