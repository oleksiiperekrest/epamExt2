package com.company.lesson2;

public enum StudentType {
    GOOD_STUDENT(3),

    BAD_STUDENT(4, "Alex") {
        @Override
        public void method() {
            System.out.println("hello");
        }
    };

    private int rate;
    private String name;

    StudentType(int rate) {
        this.rate = rate;
    }

    StudentType(int rate, String name) {
        this.rate = rate;
        this.name = name;
    }



    public static StudentType valueOfStudentType(String s) {
        for (StudentType studentType : values()) {
            if (studentType.name().equals(s)) {
                return studentType;
            }
        }
        return null;
    }


    public void method() {
        System.out.println("hi");
    }
}
