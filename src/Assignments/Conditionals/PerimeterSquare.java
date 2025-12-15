//Perimeter Of Square
package Assignments.Conditionals;

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat();

        double Perimeter = 4 * side;
        System.out.println(Perimeter);
    }
}
