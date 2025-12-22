//Addition Of Two Numbers
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class AddTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        calculate(number1, number2);
        in.close();
    }

    static void calculate(int a, int b) {
        int sum_of_two = a + b;
    }
}
