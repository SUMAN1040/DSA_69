//Take 2 numbers as input and print the largest number.

package Assignments.First_Java;

import java.util.Scanner;

public class LargestNumberCalculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 > num2) {
            System.out.println("The num" + num1 + " 1 is largest between two");
        } else {
            System.out.println("The number " + num2 + " is largest between two");
        }
    }
}
