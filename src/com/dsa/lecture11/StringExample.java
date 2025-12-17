package com.dsa.lecture11;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String massage = greet();
//        System.out.println(massage);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);

        int ans2 = sum3(23, 23);
        System.out.println(ans2);


    }

    static String myGreet(String name) {
        String massage = "Hello " + name;
        return massage;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }

    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }

}


