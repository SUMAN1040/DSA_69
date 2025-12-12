package com.dsa.lecture9;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //PRINT NUMBERS FROM 1 TO 5
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

        /*
            syntax of for loops:
            for (initializations; conditions; increment/decrement){
                //body part
            }
        */
//        for (int num = 1; num <= 5; num++) {
//            System.out.println(num);
//        }
        int n = input.nextInt();
//        for (int num = 1; num <= n; num++) {
////            System.out.println(num + "");
//            System.out.println("hello World");
//        }

//        int num = 1;
//        while(num<=5){
//            System.out.println(num);
//            num++;
//        }

        int num = 1;
        do {
            System.out.println(num);
        } while (num <= 5);

    }
}