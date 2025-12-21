//Area Of Rhombus
package Assignments.Functions.Previous.ConditionalsLoop;

import java.util.Scanner;

public class Area_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float diagonal1 = in.nextFloat();
        float diagonal2 = in.nextFloat();
        calculate(diagonal1, diagonal2);
        in.close();
    }

    static void calculate(float diagonal1, float diagonal2) {
        double area = diagonal1 * diagonal2;
        System.out.printf("The area of rhombus is: %.2f", area);
    }
}
