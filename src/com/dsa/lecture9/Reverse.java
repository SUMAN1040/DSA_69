package com.dsa.lecture9;

public class Reverse {
    public static void main(String[] args) {
        int n = 45536;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }
}