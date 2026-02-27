//To calculate Fibonacci Series up to n numbers.

package Assignments.First_Java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int a = 0, b = 1;

        while (a <= number) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
