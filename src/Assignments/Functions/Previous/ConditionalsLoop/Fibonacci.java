//Fibonacci Series In Java Programs
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        calculate(number);
        in.close();
    }

    static void calculate(int number) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= number; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
