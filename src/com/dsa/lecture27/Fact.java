package com.dsa.lecture27;

public class Fact {
    public static void main(String[] args) {
        int ans = fun(5);
        System.out.println(ans);
    }

    static int fun(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        return n * fun(n - 1);
    }
}
