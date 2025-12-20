//Take a number as input and print the multiplication table for it.
package Assignments.Functions.Previous.FlowOfProgram;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        multiplication(number);
        in.close();
    }

    static void multiplication(int a) {
        int mul = 1;
        for (int i = 1; i <= 10; i++) {
            mul = a * i;
            System.out.println(a + "*" + i + "=" + mul);
        }
    }
}
