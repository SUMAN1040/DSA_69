//Area Of Rhombus
package Assignments.Conditionals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float diagonal1 = in.nextFloat();
        float diagonal2 = in.nextFloat();

        double area = 0.5* diagonal1*diagonal2;

        System.out.println(area);
    }
}
