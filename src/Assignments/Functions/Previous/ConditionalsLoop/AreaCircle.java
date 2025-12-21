//Area Of Circle Java Program
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();
        calculate(radius);
        in.close();
    }

    static void calculate(float a) {
        double area = Math.PI * a * a;
        System.out.printf(String.format("The area of circle is: %.2f", area));
    }
}