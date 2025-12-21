//Volume Of Pyramid
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Volume_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float width = in.nextFloat();
        float height = in.nextFloat();
        float base = in.nextFloat();
        calculate(base, height, width);
        in.close();
    }

    static void calculate(float base, float height, float width) {
        double vPyramid = (float) (1.0 / 3) * base * height * width;
        System.out.printf("The volume of pyramid is: %.2f", vPyramid);
    }
}
