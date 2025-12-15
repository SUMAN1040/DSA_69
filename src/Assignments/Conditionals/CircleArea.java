//Area Of Circle Java Program

package Assignments.Conditionals;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float radius = in.nextFloat();

        double AreaOfCircle = 3.14 * radius * radius;

        System.out.println("The area of circle is " + AreaOfCircle);
    }
}
