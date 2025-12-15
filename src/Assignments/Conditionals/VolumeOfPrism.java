//Volume Of Prism

package Assignments.Conditionals;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float base = in.nextFloat();
        float height = in.nextFloat();

        double Volume = base * height;
        System.out.println(Volume);
    }
}
