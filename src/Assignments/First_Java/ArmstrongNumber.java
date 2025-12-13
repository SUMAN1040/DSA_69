//To find ArmstrongNumber Number between two given number.

package Assignments.First_Java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for (int i = num1; i <= num2; i++) {
            int power = String.valueOf(Math.abs(i)).length();
            int temp = i;
            int sum = 0;

            if (temp < 0) {
                continue;
            }
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + (int) Math.pow(rem, power);
                temp = temp / 10;
            }


            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
