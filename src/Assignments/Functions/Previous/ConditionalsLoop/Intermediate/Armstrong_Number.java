//Armstrong Number In Java
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        int number = in.nextInt();
        if (number < 0) {
            System.out.println("Armstrong number is not defined for negative numbers");
            return;
        }
        int temp = number;
        int temp2 = number;
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        int rem = 0;
        int number1 = 0;
        while (temp2 > 0) {
            rem = temp2 % 10;
            number1 += (int) Math.pow(rem, count);
            temp2 /= 10;
        }
        if (number1 == number) {
            System.out.println("This is armstrong number");
        } else {
            System.out.println("This is not a armstrong number");
        }
    }
}
