//Area Of Parallelogram
package Assignments.Conditionals;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        float height = in.nextFloat();

        double AreaOfParallelogram = base*height;

        System.out.println(AreaOfParallelogram);

    }
}
