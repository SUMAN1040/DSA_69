//Take two numbers and print the sum of both.
package Assignments.Functions.Previous.FlowOfProgram;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int Sum_Of_Two_Number = sum(number1, number2);
        System.out.println("The sum of two number is: " + Sum_Of_Two_Number);
        in.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
