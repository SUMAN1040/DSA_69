package com.dsa.lecture23;

public class NumbersExample {
    public static void main(String[] args) {
        //Write a function that takes in a number and prints it
        //Print first 5 numbers
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursive call
        //if you are calling a function again and again, you can treat it as a separate call in the stack
        //this is cal tail recursive
        //this is the last function call
        print(n + 1);
    }
}