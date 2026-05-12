package com.dsa.lecture42.generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student suman = new Student(1040, 99.99f);
        Student kumar = new Student(1010, 99.19f);

        if(suman.compareTo(kumar) < 0){
            System.out.println("Suman has more marks");
        }
    }
}
