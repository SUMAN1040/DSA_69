//Future Investment Value
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float pv = in.nextFloat();
        float r = in.nextFloat();
        float t = in.nextFloat();

        double futureInvestmentValue = pv * Math.pow((1 + r), t);
        System.out.println(futureInvestmentValue);
    }
}
