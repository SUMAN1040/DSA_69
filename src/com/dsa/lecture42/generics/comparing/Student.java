package com.dsa.lecture42.generics.comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int) (this.marks - o.marks);
        //if diff == 0: mean both are equal
        //if diff < 1: means o is bigger else o is smaller
        return diff;
    }
}
