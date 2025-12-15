//Power In Java
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class JavaPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int power = in.nextInt();
        double result = Math.pow(number, power);
        System.out.println(result);
        in.close();
    }
}
