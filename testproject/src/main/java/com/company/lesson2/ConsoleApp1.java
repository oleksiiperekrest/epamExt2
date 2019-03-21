package com.company.lesson2;

public class ConsoleApp1 {
    public static void main(String[] args) {

//        int a = 5;
//
//        if (a > 0 | ++a < 11) {
//            System.out.println(a);
//        }
//
//        if (a > 0 || ++a < 11) {
//            System.out.println(a);
//        }
//
//        String name = "Oleg";
//
//        method(name);
//    }
//
//    private static void method(String name) {
//        switch (name) {
//            case "Oleg":
//                System.out.println("Yes");
//                break;
//            case "Alex":
//                System.out.println("No Alex");
//                break;
//            default:
//                System.out.println("No");
//        }
//    }
//
//    private static String method1(String name) {
//        switch (name) {
//            case "Oleg":
//                return "Yes";
//            case "Alex":
//                return "No Alex";
//            default:
//                return "No";
//        }

        A a1 = new A();
        A a2 = null;

        a1.method();
        a2.method();

        a1.staticMethod();
        a2.staticMethod();

        A.staticMethod();




    }


}
