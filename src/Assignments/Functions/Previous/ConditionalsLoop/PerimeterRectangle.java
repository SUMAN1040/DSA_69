//Perimeter Of Rectangle
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        float width = in.nextFloat();
        calculate(height, width);
        in.close();
    }

    static void calculate(float height, float width) {
        float perimeter = (float) 2 * (height + width);
        System.out.printf("The perimeter of rectangle is: %.2f", perimeter);
    }
}
