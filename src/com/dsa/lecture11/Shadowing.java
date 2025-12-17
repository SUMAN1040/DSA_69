package com.dsa.lecture11;

public class Shadowing {
    static int x = 100;// this will be shadowed in line 8

    public static void main(String[] args) {
        System.out.println(x);
        int x = 100000; //Local scope ( the class variable at line 4 is shadowed by this)
        System.out.println(x);
        fun();
    }

    static void fun() {
        System.out.println(x);
    }

}
