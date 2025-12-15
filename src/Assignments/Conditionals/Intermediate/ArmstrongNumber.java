//Armstrong Number In Java
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Number = in.nextInt();
        int rem = 0;
        int sum = 0;
        int count = 0;
        int temp = Number;
        int temp2 = Number;

        while (temp > 0) {
            count += 1;
            temp = temp / 10;
        }
        while (temp2 > 0) {
            rem = temp2 % 10;
            sum = (int) (sum + Math.pow(rem, count));
            temp2 = temp2 / 10;
        }
        if (sum == Number) {
            System.out.println("This is an Armstrong Number");
        } else {
            System.out.println("This is not a Armstrong Number");
        }
        in.close();
    }
}
