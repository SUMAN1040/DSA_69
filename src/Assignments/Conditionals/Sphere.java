//Volume Of Sphere
package Assignments.Conditionals;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();

        double Vsphere = (double) (4 / 3) * 3.14 * Math.pow(radius, 3);

        System.out.println(Vsphere);
    }
}
