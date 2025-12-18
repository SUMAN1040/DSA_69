//Define a program to find out whether a given number is even or odd.
package Assignments.Functions;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        boolean result = isEven(number);
        OddEven(result);
        in.close();
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static void OddEven(boolean isEven) {
        if (isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
