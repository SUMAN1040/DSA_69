//LCM Of Two Numbers
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        if (number1 <= 0 || number2 <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int temp1 = number1;
        int temp2 = number2;

        while (temp2 != 0) {
            int temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        long LCM = ((long) number1 * (long) number2) / temp1;
        System.out.println(LCM);

        in.close();
    }
}
