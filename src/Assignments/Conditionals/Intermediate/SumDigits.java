//Sum Of A Digits Of Number
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println(sum);
        in.close();
    }
}
