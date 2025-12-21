//Area Of Rectangle Program
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float width = in.nextFloat();
        float height = in.nextFloat();
        calculate(width, height);
        in.close();
    }

    static void calculate(float width, float height) {
        double area = width * height;
        System.out.printf("The area of rectangle is: %.2f", area);
    }
}
