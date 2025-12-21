//Volume Of Prism
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Volume_Prism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        float height = in.nextFloat();
        calculate(base, height);
        in.close();
    }

    static void calculate(float base, float height) {
        double vPrism = base * height;
        System.out.printf("The volume of prism: %.2f", vPrism);
    }
}
