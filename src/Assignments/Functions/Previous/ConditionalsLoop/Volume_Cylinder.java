//Volume Of Cylinder
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Volume_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        float radius = in.nextFloat();
        calculate(radius, height);
        in.close();
    }

    static void calculate(float radius, float height) {
        double vCylinder = (float) Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("The volume of cylinder: %.2f", vCylinder);
    }
}
