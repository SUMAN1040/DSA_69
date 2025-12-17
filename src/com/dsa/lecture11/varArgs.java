package com.dsa.lecture11;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5, 6, 6);
        multiple(2, 3, "Suman", "Dey");

        func(2, 3, 4, 5, 6, 6);
        func("Suman", "Kumar", "Dey");
    }

    static void func(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void func(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int... v) { // that ...v is taking as arrays in integers( variable length arguments)
        System.out.println(Arrays.toString(v));
    }
}
