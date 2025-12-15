//Calculate Average Of N Numbers
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int sum = 0;
        double avg = 0;
        for (int i = 1; i <= number; i++) {
            int n = in.nextInt();
            sum += n;

        }
        avg = (double) sum / number;
        System.out.println(avg);
    }
}
