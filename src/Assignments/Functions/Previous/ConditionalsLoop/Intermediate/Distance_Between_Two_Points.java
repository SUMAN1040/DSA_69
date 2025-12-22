//Calculate Distance Between Two Points
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();

        float distance = (float) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.println(distance);
    }
}
