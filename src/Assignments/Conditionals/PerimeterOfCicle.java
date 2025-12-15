//Perimeter Of Circle

package Assignments.Conditionals;

import java.util.Scanner;

public class PerimeterOfCicle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius = in.nextFloat();

        double area = 2 * 3.14 * radius;

        System.out.println(area);
    }
}
