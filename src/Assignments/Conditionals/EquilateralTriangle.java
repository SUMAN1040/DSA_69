//Area Of Equilateral Triangle
package Assignments.Conditionals;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float side = in.nextFloat();

        double area = (Math.sqrt(3)/4) * Math.pow(side, 2);

        System.out.println(area);
    }
}
