//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class press_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        calculate(number);
        in.close();
    }

    static void calculate(int a) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (a != 0) {
            sum += a;
            a = in.nextInt();
        }
        System.out.println(sum);
    }
}
