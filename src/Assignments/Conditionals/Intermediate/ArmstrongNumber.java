//Armstrong Number In Java
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int temp = number;
        int digitCount = 0;

        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digitCount);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not an Armstrong Number");
        }

        in.close();
    }
}
