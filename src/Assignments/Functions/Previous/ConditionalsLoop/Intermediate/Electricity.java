//Calculate Electricity Bill
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float units = in.nextFloat();
        calculate(units);
        in.close();
    }

    static void calculate(float units) {
        double bill = 0;
        if (units <= 100) {
            bill = 1.5 * units;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 300) * 4.0;
        } else {
            bill = (100 * 1.5) + (2.5 * 100) + (100 * 4.0) + (units - 300) * 6.0;
        }
        System.out.println(bill);
    }
}
