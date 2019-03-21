package com.company.lesson2;

import java.time.LocalDate;
import java.util.Date;

public class ConsoleApp {
    public static void main(String[] args) {
        Student student1 = new Student(1L, "Alex","Alex", "Now");
        Student student2 = new Student(1L, "Alex","Alex", "Now");

        StudentType studentType = StudentType.GOOD_STUDENT;
        StudentType goodStudent = StudentType.valueOf("GOOD_STUDENT");
        StudentType[] values = StudentType.values();
        String name = StudentType.GOOD_STUDENT.name();
        System.out.println(name);

        StudentType studentType1 = StudentType.valueOfStudentType("GOOD_STUDENT");
        System.out.println(studentType1);


        StudentType studentType2 = StudentType.valueOfStudentType(null);
        System.out.println(studentType2);

        StudentType.GOOD_STUDENT.method();
        StudentType.BAD_STUDENT.method();
    }
}
