//To find Armstrong Number between two given number.
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        check(number1, number2);
        in.close();
    }

    static void check(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
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
    }
}
