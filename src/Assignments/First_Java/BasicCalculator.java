//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package Assignments.First_Java;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = input.nextInt();

        System.out.println("Enter the operator: (+, -, *, /)");
        char operator = input.next().trim().charAt(0);

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println(num1 / num2);
            } else {
                System.out.println("Invalid Input ");
            }
        } else {
            System.out.println("Invalid Operator");
        }
    }
}
