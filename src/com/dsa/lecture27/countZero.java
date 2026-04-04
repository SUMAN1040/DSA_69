package com.dsa.lecture27;

public class countZero {

    static int count(int n) {
//        int res = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 0) {
//                res++;
//            }
//            n = n / 10;
//        }
//        return res;
        return helper(n, 0);
    }

    static int helper(int n, int c) {

        // Special pattern, how to pass a value to above calls
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }

    public static void main(String[] args) {
        System.out.println(count(302000004));
    }
}
