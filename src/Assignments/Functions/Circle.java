//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package Assignments.Functions;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextFloat();
        double circumferenceOfCircle = circumference(radius);
        double areaOfCircle = areaOfCircle(radius);
        System.out.println("The circumference of circle is: " + circumferenceOfCircle);
        System.out.println("The Area of Circle is: " + areaOfCircle);
    }

    static double circumference(double r) {
        return (int) (2 * Math.PI * r);
    }

    static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }
}
