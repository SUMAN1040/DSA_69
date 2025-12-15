//Take integer inputs till the user enters 0 and print the largest number from all.
package Assignments.Conditionals;

import java.util.Scanner;

public class LargestInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int max = 0;
        while (number != 0) {
            if (max < number) {
                max = number;
            }
            number = in.nextInt();
        }
        System.out.println(max);
    }
}