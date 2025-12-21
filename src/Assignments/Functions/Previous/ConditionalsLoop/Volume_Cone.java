//Volume Of Cone Java Program
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Volume_Cone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        float radius = in.nextFloat();
        calculate(radius, height);
        in.close();
    }

    static void calculate(float radius, float height) {
        double vol = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.printf("The volume of the cone: %.2f", vol);
    }
}
