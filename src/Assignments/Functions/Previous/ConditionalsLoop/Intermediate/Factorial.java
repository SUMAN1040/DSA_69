//Factorial Program In Java
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        calculate(number);
        in.close();
    }

    static void calculate(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
