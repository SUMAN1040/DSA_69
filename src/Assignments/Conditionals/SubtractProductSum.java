//Subtract the Product and Sum of Digits of an Integer
package Assignments.Conditionals;

import java.util.Scanner;

public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int rem = 0;
        int sum = 0;
        int product = 1;

        while (number != 0) {
            rem = number % 10;
            sum += rem;
            product *= rem;
            number = number / 10;
        }
        int Subtract = product - sum;
        System.out.println(Subtract);
    }
}
