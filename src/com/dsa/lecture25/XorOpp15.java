package com.dsa.lecture25;

import java.util.Scanner;

public class XorOpp15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(xorUpToA(n));
    }

    static int xorUpToA(int n) {
        if (n % 4 == 0) return n;
        if (n % 4 == 1) return 1;
        if (n % 4 == 2) return n + 1;
        return 0;
    }
}
