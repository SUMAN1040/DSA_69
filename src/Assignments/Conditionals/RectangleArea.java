//Area Of Rectangle Program
package Assignments.Conditionals;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        float width = in.nextFloat();

        double Area = height*width;

        System.out.println(Area);
    }
}
