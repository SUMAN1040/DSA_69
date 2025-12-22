//Calculate Depreciation of Value
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Depreciation_Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    //    Formula: (Cost - Salvage Value) / Useful Life
    static void calculate(Scanner in) {
        float Cost = in.nextFloat();
        float Salvage_value = in.nextFloat();
        float Useful_life = in.nextFloat();

        float Depreciation_value = (Cost - Salvage_value) / Useful_life;
        System.out.println(Depreciation_value);
    }
}
