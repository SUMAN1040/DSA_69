//Area Of Equilateral Triangle
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Area_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float side = in.nextFloat();
        calculate(side);
        in.close();
    }

    static void calculate(float side) {
        double area = (Math.sqrt(3) * Math.pow(side, 2)) / 4;
        System.out.printf("The area of equilateral triangle is: %.2f", area);
    }
}
