package com.company.lesson1.homework1;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HomeworkTest {

    private static int[] fibonacciSequence = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};

    @Test
    public void fibonacciNumberCyclic(){
        assertEquals(fibonacciSequence[4], Homework.fibonacciNumberCyclic(5));
        assertEquals(fibonacciSequence[8], Homework.fibonacciNumberCyclic(9));
        assertEquals(fibonacciSequence[0], Homework.fibonacciNumberCyclic(1));
    }
    @Test
    public void fibonacciNumberRecursive(){
        assertEquals(fibonacciSequence[4], Homework.fibonacciNumberRecursive(5));
        assertEquals(fibonacciSequence[8], Homework.fibonacciNumberRecursive(9));
        assertEquals(fibonacciSequence[0], Homework.fibonacciNumberRecursive(1));
    }
    @Test
    public void fibonacciSequenceCyclic(){
        assertEquals(Arrays.toString(fibonacciSequence), Arrays.toString(Homework.fibonacciSequenceCyclic(20)));

    }

}