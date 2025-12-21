//Total Surface Area Of Cube
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Surface_Area_Cube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();
        calculate(side);
        in.close();
    }

    static void calculate(float side) {
        double sCube = (float) 6 * side;
        System.out.printf("The surface area of cube is: %.2f", sCube);
    }
}
