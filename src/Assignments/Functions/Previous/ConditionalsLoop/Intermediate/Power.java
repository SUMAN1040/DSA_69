//Power In Java
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        int number = in.nextInt();
        int power = in.nextInt();

        int answer = (int) Math.pow(number, power);
        System.out.println(answer);
    }
}
