package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Area_Isosceles_Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        float height = in.nextFloat();
        calculate(base, height);
        in.close();
    }

    static void calculate(float base, float height) {
        double area = 0.5 * base * height;
        System.out.printf("The area of isosceles triangle is: %.2f", area);
    }
}
