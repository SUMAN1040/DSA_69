package com.dsa.lecture11;

import java.util.Scanner;

public class Sum {

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //return type
    static int sum2() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    //main method
    public static void main(String[] args) {
        /*
        access modifier (we'll look in OOP) return_type name(){
            //body
            return statement;
        }
        */
//        sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans2 = sum(20, 23);
        System.out.println(ans2);
    }
}
