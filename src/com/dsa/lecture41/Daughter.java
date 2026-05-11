package com.dsa.lecture41;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Hey I am from daughter class");
    }

    @Override
    void partner() {
        System.out.println("Hey i am from daughter class with age");
    }
}
