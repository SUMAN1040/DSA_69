//Perimeter Of Rhombus
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Perimeter_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();
        calculate(side);
        in.close();
    }

    static void calculate(float side) {
        double perimeter = (float) 4 * side;
        System.out.printf("The Perimeter of Rhombus: %.2f", perimeter);
    }
}
