//HCF Of Two Numbers Program
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();

//        if (number1 <= 0 || number2 <= 0) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        int hcf = 0;
//        for (int i = 1; i <= Math.min(number1, number2); i++) {
//            if (number2 % i == 0 && number1 % i == 0) {
//                if (hcf <= i) {
//                    hcf = i;
//                }
//            }
//        }
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        System.out.println(number1);

//        System.out.println(hcf);
        in.close();
    }
}
