//Curved Surface Area Of Cylinder
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Curved_Surface_Area_Cylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        float height = in.nextFloat();
        calculate(height, radius);
        in.close();
    }

    static void calculate(float height, float radius) {
        double csa = (float) 2 * Math.PI * radius * height;
        System.out.printf("The Curved Surface Area Of Cylinder: %.2f", csa);
    }
}
