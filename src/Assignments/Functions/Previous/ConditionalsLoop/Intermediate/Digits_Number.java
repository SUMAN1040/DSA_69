//Sum Of A Digits Of Number
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Digits_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        System.out.println("The sum value of the number: " + calculate(Math.abs(number)));
    }

    static int calculate(int a) {
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            sum = sum + rem;
            a = a / 10;
        }
        return sum;
    }
}
