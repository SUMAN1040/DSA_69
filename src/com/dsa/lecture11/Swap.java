package com.dsa.lecture11;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        swap();

        String name = "Suman Kumar Dey";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String naam) {
        naam = "Auman";
    }

    //Primitives int, char, short, byte-- pass by value
//    But in case of objects and stuff there passing value of the reference variable

    //    this change will only be valid in this functions scope only
    static void swap() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
    }
}

