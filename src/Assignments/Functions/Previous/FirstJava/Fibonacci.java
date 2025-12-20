//To calculate Fibonacci Series up to n numbers.
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        check(number);
        in.close();
    }

    static void check(int number) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= number; i++) {
            System.out.println(a + "");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

//Time	O(n)
//Space	O(1)
