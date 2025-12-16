//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class Kunal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sumN = 0;
        int sumO = 0;
        int sumE = 0;
        while (number != 0) {
            if (number < 0) {
                sumN += number;
            } else if (number % 2 == 0 && number > 0) {
                sumE += number;
            } else {
                sumO += number;
            }
            number = in.nextInt();
        }
        System.out.println("The sum of Negative numbers: " + sumN);
        System.out.println("The sum of Odd numbers: " + sumO);
        System.out.println("The sum of Even numbers: " + sumE);
        in.close();
    }
}
