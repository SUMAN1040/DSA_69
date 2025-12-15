//Volume Of Pyramid
package Assignments.Conditionals;

import java.util.Scanner;

public class VPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float length = in.nextFloat();
        float width = in.nextFloat();
        float height = in.nextFloat();

        double Vpyramid = 0.5 * length * width * height;
        System.out.println(Vpyramid);
    }
}
