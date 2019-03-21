package com.company.lesson2;

public class Calculator {

    public static void main(String[] args) {
        double a = 43.4;
        double b = 32.0;

        System.out.println(calc(a, "+", b));
        System.out.println(calculate(a, "-", b));
        System.out.println(calculate(a, "-+", b));


    }
    public static double calc(double arg1, String operation, double arg2) {

        if ("+".equals(operation)) {
            return arg1 + arg2;
        }

        if ("-".equals(operation)) {
            return arg1 - arg2;
        }

        if ("*".equals(operation)) {
            return arg1 * arg2;
        }

        if ("/".equals(operation)) {
            return arg1 / arg2;
        }

        throw new IllegalArgumentException("Wrong operation");
    }

    public static double calculate(double arg1, String operation, double arg2) {
        switch (operation) {
            case "+":
                return arg1 + arg2;
            case "-":
                return arg1 - arg2;
            case "*":
                return arg1 * arg2;
            case "/":
                return arg1 / arg2;
            default: throw new IllegalArgumentException("Wrong operation");
        }
    }
}
