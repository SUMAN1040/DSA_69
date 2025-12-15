//Calculate Batting Average
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Total_run_scored = in.nextInt();
        int Number_Of_Dismissed = in.nextInt();

        int Batting_Average = Total_run_scored / Number_Of_Dismissed;

        System.out.println(Batting_Average);
    }
}
