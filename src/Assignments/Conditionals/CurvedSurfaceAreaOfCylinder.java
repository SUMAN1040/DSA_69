//Curved Surface Area Of Cylinder
package Assignments.Conditionals;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();

        float radius = in.nextFloat();

        double Area = 2 * 3.14 * radius * height;

        System.out.println(Area);

    }
}
