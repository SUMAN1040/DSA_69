package com.dsa.lecture24;

public class Main {
    public static void main(String[] args) {
        System.out.println(fiboFormula(50));
    }

    static long fiboFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}