//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Assignments.Functions;

import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        System.out.println("Maximum: " + Maximum(number1, number2, number3));
        System.out.println("Minimum: " + Minimum(number1, number2, number3));
    }

    static int Maximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    static int Minimum(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
