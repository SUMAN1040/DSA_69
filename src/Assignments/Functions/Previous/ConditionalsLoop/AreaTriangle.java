//Area Of Triangle
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        float height = in.nextFloat();
        calculate(base, height);
        in.close();
    }

    static void calculate(float base, float height) {
        double area = 0.5 * base * height;
        System.out.printf(String.format("The area of triangle is: %.2f", area));
    }
}
