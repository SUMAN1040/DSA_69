//Perfect Number In Java
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number && number != 0) {
            System.out.println("This is a perfect number");
        } else {
            System.out.println("This is not a perfect number");
        }
        in.close();
    }
}
