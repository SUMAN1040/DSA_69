//Compound Interest Java Program
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float Principle = in.nextFloat();
        float InterestRate = in.nextFloat();
        float NumberOfYearPerInvest = in.nextFloat();

        double AmountIncludingPrinciple = Principle * Math.pow((1 + (InterestRate/100)), NumberOfYearPerInvest);

        System.out.println(AmountIncludingPrinciple);
        in.close();
    }
}