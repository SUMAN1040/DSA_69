package com.dsa.lecture27;

public class NtoOne {
    public static void main(String[] args) {
        funBoth(5);
    }
    static void fun(int n){
        if (n == 0) return;
        System.out.println(n);
        fun(n-1);
    }

    static void reverse(int n){
        if (n == 0) return;
        reverse(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if (n == 0) return;
        System.out.println(n);
        funBoth(n-1);
        System.out.print(n + " ");
    }
}
