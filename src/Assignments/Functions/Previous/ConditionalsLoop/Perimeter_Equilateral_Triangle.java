//Perimeter Of Equilateral Triangle
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Perimeter_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();
        calculate(side);
        in.close();
    }

    static void calculate(float side) {
        float perimeter = (float) 3 * side;
        System.out.printf("The Perimeter of the triangle: %.2f", perimeter);
    }
}
