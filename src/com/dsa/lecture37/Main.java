package com.dsa.lecture37;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //store 5 roll number
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        // data of 5 students
        //[Roll, name, marks]
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];


//        Student[] students = new Student[5];
        //for creating new data type there need to working in class


//        Student suman;
//        suman = new Student();

        Student suman = new Student(40, "Dey", 100);
        Student rahul = new Student();

//        suman.rno = 40;
//        suman.name = "Suman Kumar Dey";
//        suman.marks = 99;

//        suman.changeName("Hello Bhai");
//        suman.gretting();


//        System.out.println(suman.rno);
//        System.out.println(suman.name);
//        System.out.println(suman.marks);

        Student random = new Student(suman);
        System.out.println(random.name);


        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "Some other";
        System.out.println(two.name);
    }

}

// For creating a class
class Student {
    int rno;
    String name;
    float marks = 90;

    void gretting() {
        System.out.println("Hello My name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // We need a way to add the values of the above properties object by object
    //We need one word to access every object
    Student() {
        //This is how you call a constructor from another constructor
        //Internally this woking like : new Student();
        this(13, "default", 100f);
    }

    //Student kumar = new Student(22, "Suman", 89.7f)
    //Here this will be replaced with kumar
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
