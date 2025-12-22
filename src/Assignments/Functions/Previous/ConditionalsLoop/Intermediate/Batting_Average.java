//Calculate Batting Average
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Batting_Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    //    Formula: Total Runs Scored / Number of Dismissals.
    static void calculate(Scanner in) {
        int run = in.nextInt();
        int number_of_dismissals = in.nextInt();
        float batting_avg = (float) run / number_of_dismissals;
        System.out.println(batting_avg);
    }
}
