//HCF Of Two Numbers Program
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class HCF_Two_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hcf(in);
    }

    static void Hcf(Scanner in) {
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        for (int i = number1; i < number2; i++) {
            while(number2!=0){
                int temp = number2;
                number2 = number1%number2;
                number1 = temp;
            }
            System.out.println(number1);
        }

    }
}
