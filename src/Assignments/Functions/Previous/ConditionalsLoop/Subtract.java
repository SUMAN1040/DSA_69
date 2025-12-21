package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        calculate(number);
        in.close();
    }

    static void calculate(int n) {
        int sum = 0;
        int product = 1;
        int rem = 0;
        while (n > 0) {
            rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        int result = product - sum;
        System.out.println(result);
    }
}
