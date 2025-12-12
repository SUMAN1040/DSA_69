package com.dsa.lecture11;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String massage = greet();
//        System.out.println(massage);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalized = myGreet(name);
        System.out.println(personalized);

    }

    static String myGreet(String name) {
        String massage = "Hello " + name;
        return massage;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
