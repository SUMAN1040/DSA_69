package com.dsa.lecture41;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("Hey I am in son class");
    }

    @Override
    void partner() {
        System.out.println("Hey I am in son class with age");
    }
}
