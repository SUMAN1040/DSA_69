//Perimeter Of Circle
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Perimeter_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        calculate(radius);
        in.close();
    }

    static void calculate(float radius) {
        float perimeter = (float) (Math.PI * 2 * radius);
        System.out.printf("The perimeter is: %.2f", perimeter);
    }
}
