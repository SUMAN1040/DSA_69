//Sum Of N Numbers
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class NSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        float sum = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter the value which want to sum " + i + ":");
            float Value = in.nextFloat();
            sum += Value;
        }
        System.out.println("Total Value: " + sum);
        in.close();
    }
}
