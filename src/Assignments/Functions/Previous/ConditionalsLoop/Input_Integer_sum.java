//Take integer inputs till the user enters 0 and print the largest number from all.
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Input_Integer_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        calculate(number);
        in.close();
    }

    static void calculate(int number) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (number != 0) {
            if (number > max) {
                max = number;
            }
            number = in.nextInt();
        }
        System.out.println(max);
    }
}
