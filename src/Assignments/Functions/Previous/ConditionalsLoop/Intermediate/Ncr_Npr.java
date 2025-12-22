// Find nCr & nPr
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Ncr_Npr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        System.out.println("nPr = " + nPr(n, r));
        System.out.println("nCr = " + nCr(n, r));

        in.close();
    }

    static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    static long nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}
