//Volume Of Sphere
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Volume_Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        calculate(radius);
        in.close();
    }

    static void calculate(float radius) {
        double vSphere = (float) (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.printf("The volume of the sphere is: %.2f", vSphere);
    }
}
