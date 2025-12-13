//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package Assignments.First_Java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount (p): ");
        int p = input.nextInt();

        System.out.print("Enter the time in years (t): ");
        int t = input.nextInt();

        System.out.print("Enter the rate of interest (r): ");
        int r = input.nextInt();

        int SimpleInterest = (p * r * t) / 100;

        System.out.println("The SimpleInterest of these given value: " + SimpleInterest);

        input.close();
    }
}
