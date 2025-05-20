package com.dsa.lecture8;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.println("Put user input:");
        Scanner input = new Scanner(System.in);
//
//        int roll_no = input.nextInt();
//        System.out.println("Your roll number is " + roll_no);

        int a = 1200_000_000;
        System.out.println(a);

        String name = input.nextLine();
        System.out.println(name);


        float marks = input.nextFloat();
        System.out.println(marks);
    }
}