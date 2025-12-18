//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Assignments.Functions;

import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int number3 = in.nextInt();

        int MaxNumber = Maximum(number1, number2, number3);
        int MinNumber = Minimum(number1, number2, number3);

        System.out.println(MaxNumber);
        System.out.println(MinNumber);
    }

    static int Maximum(int a, int b, int c) {
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    static int Minimum(int a, int b, int c) {
        int min = 0;
        if (a < b && a < c) {
            min = a;
        } else if (b < c && b < a) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }
}
