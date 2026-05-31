//Calculate Average Of N Numbers
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if (number <= 0) {
            System.out.println("Number of elements must be greater than 0");
            return;
        }

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int n = in.nextInt();
            sum += n;
        }

        double avg = (double) sum / number;
        System.out.println("Average = " + avg);

        in.close();
    }
}
