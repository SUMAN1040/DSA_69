//Perimeter Of Rectangle
package Assignments.Conditionals;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float length = in.nextFloat();
        float width = in.nextFloat();

        double perimeter = 2 * (length * width);

        System.out.println(perimeter);
    }
}
