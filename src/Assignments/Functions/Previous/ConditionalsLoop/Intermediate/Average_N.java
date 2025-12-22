//Calculate Average Of N Numbers
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Average_N {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        calculate(count, in);
        in.close();
    }

    static void calculate(int count, Scanner in) {
//        Scanner in = new Scanner(System.in);
        float avg = 0;
        float sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += in.nextFloat();
        }
        avg = sum / count;
        System.out.println(avg);
    }
}
