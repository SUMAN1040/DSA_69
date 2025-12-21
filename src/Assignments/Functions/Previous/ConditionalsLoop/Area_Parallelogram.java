//Area Of Parallelogram
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Area_Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        float height = in.nextFloat();
        calculate(base, height);
        in.close();
    }

    static void calculate(float base, float height) {
        float area = base * height;
        System.out.printf("The area of parallelogram is: %.2f", area);
    }
}
