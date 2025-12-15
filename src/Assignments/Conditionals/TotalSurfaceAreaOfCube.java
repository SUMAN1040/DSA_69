//Total Surface Area Of Cube
package Assignments.Conditionals;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat();

        double Area = 6 * (side * side);

        System.out.println(Area);
    }
}
