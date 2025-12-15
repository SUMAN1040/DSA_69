//Find Ncr & Npr
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class NcrNpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        long fact_n = 1;
        long fact_r = 1;
        long fact_c = 1;

        if (r <= n && r >= 0) {
            System.out.println("Calculating.....");
        } else {
            System.out.println("Please enter the right alignment of value: ");
            return;
        }

        for (int i = 1; i <= n; i++) {
            fact_n = fact_n * i;
        }
        for (int i = 1; i <= r; i++) {
            fact_r = fact_r * i;
        }
        for (int i = 1; i <= (n - r); i++) {
            fact_c = fact_c * i;
        }
        double nPr = (double) fact_n / fact_c;
        double nCr = (double) fact_n / (fact_r * fact_c);
        System.out.println("The Ncr is: " + nCr);
        System.out.println("The Npr is: " + nPr);
        in.close();
    }
}
