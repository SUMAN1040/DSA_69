package com.dsa.lecture41;

public abstract class Parent2 {
    int age;
    final int VALUE;

    public Parent2(int age) {
        this.age = age;
        VALUE = 1040;
    }

    static void hello() {
        System.out.println("hello");
    }

    void normal() {
        System.out.println("This is a normal method");
    }

    abstract void career();

    abstract void partner();
}
