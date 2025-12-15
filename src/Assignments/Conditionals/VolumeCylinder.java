//Volume Of Cylinder
package Assignments.Conditionals;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float radius = in.nextFloat();
        float height = in.nextFloat();

        double Vcylinder = 3.14 * radius * radius * height;

        System.out.println(Vcylinder);
    }
}
