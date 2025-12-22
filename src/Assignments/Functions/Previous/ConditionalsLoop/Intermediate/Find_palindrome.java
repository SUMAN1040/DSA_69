//Find if a number is palindrome or not
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Find_palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        int number = in.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers cannot be palindrome");
            return;
        }

        int temp_num = number;
        int count = 0;
        while (temp_num > 0) {
            int rem = temp_num % 10;
            count = (count * 10) + rem;
            temp_num = temp_num / 10;
        }
        if (count == number) {
            System.out.println("This is palindrome number");
        } else {
            System.out.println("This is not palindrome number");
        }
    }
}
