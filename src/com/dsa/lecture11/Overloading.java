package com.dsa.lecture11;

public class Overloading {
    public static void main(String[] args) {
//        function(445);
        function("Suman");
        int ans1 = sum(2, 3);
        System.out.println(ans1);
        int ans2 = sum(3, 4, 5);
        System.out.println(ans2);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void function(int a) {
        System.out.println(a);
    }

    static void function(String name) {
        System.out.println(name);
    }
}
//When the two or more function have same name or same return type but diff argument then that might