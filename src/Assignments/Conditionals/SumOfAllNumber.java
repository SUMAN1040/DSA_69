//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package Assignments.Conditionals;

import java.util.Scanner;

public class SumOfAllNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number;
            number = in.nextInt();
        }
        System.out.println(sum);
    }
}