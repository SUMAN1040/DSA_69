//Write a program to print whether a number is even or odd, also take input from the user.
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (isEven(number)) {
            System.out.println("This is Even");
        } else {
            System.out.println("This is Odd");
        }
        in.close();
    }

    static boolean isEven(int a) {
        return (a % 2 == 0);
    }
}

//Time Complexity: O(1)
//
//Space Complexity: O(1)