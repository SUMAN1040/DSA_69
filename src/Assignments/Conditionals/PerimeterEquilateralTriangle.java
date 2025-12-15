//Perimeter Of Equilateral Triangle

package Assignments.Conditionals;

import java.util.Scanner;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();

        double Perimeter = side * side * side;

        System.out.println(Perimeter);

    }
}
