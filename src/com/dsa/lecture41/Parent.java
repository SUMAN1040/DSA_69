package com.dsa.lecture41;

public abstract class Parent {

    static int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        this.VALUE = 1040;
    }

    static void hello() {
        System.out.println("Hello");
    }

    void normal() {
        System.out.println("normal");
    }

    abstract void career();

    abstract void partner();
}