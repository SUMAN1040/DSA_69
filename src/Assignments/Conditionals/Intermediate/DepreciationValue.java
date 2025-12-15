//Calculate Depreciation of Value
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class DepreciationValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float cost = in.nextFloat();
        float salvage_value = in.nextFloat();
        float useful_life = in.nextFloat();
        double Annual_deduction = (cost - salvage_value) / useful_life;

        System.out.println(Annual_deduction);
        in.close();
    }
}
