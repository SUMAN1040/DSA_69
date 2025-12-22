package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Future_Investment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    //    FV = PV * (1 + r)^n
    static void calculate(Scanner in) {
        System.out.println("Enter the principle amount: ");
        float principle = in.nextFloat();
        System.out.println("Enter the rate amount: ");
        float rate = in.nextFloat();
        System.out.println("Enter the time amount: ");
        float time = in.nextFloat();
        double fv = (float) (principle * Math.pow((1 + rate), time));
        System.out.println(fv);
    }
}
