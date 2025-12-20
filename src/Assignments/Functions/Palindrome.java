//Write a function to find if a number is a palindrome or not. Take number as parameter.
package Assignments.Functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (checkFinal(number)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("This is not a palindrome number");
        }
        in.close();

    }
    static boolean checkFinal(int number) {
        if (number < 0) {
            return false;
        }
        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return original == reversed;
    }

}
