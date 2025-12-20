//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//        4! = 1 * 2 * 3 * 4 = 24
//        3! = 3 * 2 * 1 = 6
//        2! = 2 * 1 = 2
//Also,
//        1! = 1
//        0! = 1
package Assignments.Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        calculateFactorial(number);
        in.close();

    }

    static void calculateFactorial(int number) {
        int fact = 1;
        if (number < 0) {
            System.out.println("Print Positive number");
        } else {
            if (number == 0) {
                System.out.println("Factorial of: " + number + " " + "1");
            } else {
                for (int i = 1; i <= number; i++) {
                    fact *= i;
                }
                System.out.println(fact);
            }
        }
    }
}

//Time Complexity: O(n)
//
//Space Complexity: O(1)
