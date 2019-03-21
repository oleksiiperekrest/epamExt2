package com.company.lesson1;

public class Main1 {
    public static void main(String[] args) {

        // int -> Integer
//        Integer i1 = 100;
//        Integer i2 = 100;
//        Integer i3 = null;
//        Integer i4 = new Integer(100);
//
//        System.out.println(i1==i2);
//        System.out.println(i1==i4);
//        System.out.println(i1.equals(i2));
//        System.out.println(i1 - i3); // NPE
//
//        Boolean b1 = true;
//        Boolean b2 = true;
//        Boolean b3 = new Boolean(true);
//
//        System.out.println(b1 == b2);
//        System.out.println(b2 == b3);
//        System.out.println(b2.equals(b3));

        int factorial = factorial(15); //.var
        System.out.println(factorial);
        int i = recursiveFactorial(15);
        System.out.println(i);

    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static int recursiveFactorial(int number) {
//        if (number == 0 || number == 1) {
//            return 1;
//        }
//        return number * recursiveFactorial(--number);

        return (number == 0 || number == 1) ? 1 : number * recursiveFactorial(--number);

    }
}
