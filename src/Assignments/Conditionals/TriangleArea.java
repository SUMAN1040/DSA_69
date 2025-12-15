//Area Of Triangle
package Assignments.Conditionals;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        float base = in.nextFloat();
        double AreaOfTriangle = 0.5 * height * base;

        System.out.println(AreaOfTriangle);
    }
}
