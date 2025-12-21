//Perimeter Of Parallelogram
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Perimeter_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        float side = in.nextFloat();
        calculate(base, side);
        in.close();
    }

    static void calculate(float base, float side) {
        float perimeter = (float) 2 * (base + side);
        System.out.printf("The perimeter of the parallelogram is: %.2f", perimeter);
    }
}
