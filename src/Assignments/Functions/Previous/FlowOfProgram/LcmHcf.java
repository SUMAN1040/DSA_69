package Assignments.Functions.Previous.FlowOfProgram;

import java.util.Scanner;

public class LcmHcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int hcf = Hcf(number1, number2);
        int lcm = Lcm(number1, number2);
        System.out.println(hcf);
        System.out.println(lcm);
        in.close();
    }

    static int Hcf(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int Lcm(int a, int b) {
        return ((a * b) / Hcf(a, b));
    }
}
