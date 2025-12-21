//Perimeter Of Square
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Perimeter_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();
        calculate(side);
        in.close();
    }

    static void calculate(float side) {
        float perimeter = (float) 4 * side;
        System.out.printf("The perimeter of square: %.2f", perimeter);
    }
}
