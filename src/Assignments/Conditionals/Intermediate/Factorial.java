//Factorial Program In Java
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        long fact = 1;
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
        }
        System.out.println(fact);
    }
}