//Perimeter Of Parallelogram
package Assignments.Conditionals;

import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat();
        float area = in.nextFloat();

        double Perimeter = 2 * (side * area);

        System.out.println(Perimeter);

    }
}
