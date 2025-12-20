//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float number1 = in.nextFloat();
        float number2 = in.nextFloat();
        char ch = in.next().charAt(0);
        calculate(number1, number2, ch);
        in.close();

    }

    static void calculate(float a, float b, char ch) {
        double Answer = 0;
        switch (ch) {
            case '+':
                Answer = a + b;
                break;
            case '-':
                Answer = a - b;
                break;
            case '*':
                Answer = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by zero is not allowed");
                    return;
                }
                Answer = a / b;
                break;
            default:
                System.out.println("Enter Proper value");
        }
        System.out.println(Answer);
    }
}