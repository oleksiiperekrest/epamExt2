package com.company.lesson2;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    //    private static final String STUDENT_NAME = "Alex";
    private static final String STUDENT_NAME;
    private static final Map<String, String> map = new HashMap<>();

    static {
        STUDENT_NAME = "Alex";
        map.put("One", "1");
        System.out.println("First static block");
    }

    private static final String STUDENT_SURNAME = initSurname();

    private static String initSurname() {
        return "Alex";

    }

    static {
        System.out.println("Second static block");
    }

    {
        System.out.println("Not static block");
        type = "STUDENT";
    }
    
    
    private final Long id;
    private final String name;
    private final String surname;
    private final String date;
    private String type;
    private boolean good;
    private StudentType studentType;

    {
        studentType = StudentType.GOOD_STUDENT;
    }

//    private Student() {
//    }

    public Student(Long id, String name, String surname, String date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.date = date;
    }
    
    public Student setName(String name) {
        return new Student(this.id, name, this.surname, this.date);
    }
    
    

//    public Student(Long id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public Student(String name, Long id) {
////        super();
//        this(id, name);
//    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSurname() {
        return surname;
    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//    }

    public String getDate() {
        return date;
    }

    public boolean isGood() {
        return good;
    }

    //    public void setDate(String date) {
//        this.date = date;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(date, student.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                '}';
    }


    
    
}
