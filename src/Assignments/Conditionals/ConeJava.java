//Volume Of Cone Java Program
package Assignments.Conditionals;

import java.util.Scanner;

public class ConeJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float height = in.nextFloat();
        float radius = in.nextFloat();

        double Volume = ((double) 1 / 3) * 3.14 * radius * radius * height;
        System.out.println(Volume);
    }
}
