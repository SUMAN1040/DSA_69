//Compound Interest Java Program
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
    }

    //     \(A=P(1+R/N)^{nt}\)
    static void calculate(Scanner in) {
        float Principle = in.nextFloat();
        float InterestRate = in.nextFloat();
        float NumberOfYearPerInvest = in.nextFloat();
        double AmountIncludingPrinciple = Principle * Math.pow((1 + (InterestRate/100)), NumberOfYearPerInvest);

        System.out.println(AmountIncludingPrinciple);
    }
}
