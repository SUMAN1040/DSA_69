//Calculate CGPA Java Program
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Calculate_CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        int subjects = in.nextInt();
        double totalGradePoint = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter grade point for subjects " + i + ":");
            double GradePoints = in.nextDouble();
            totalGradePoint += GradePoints;
        }
        double cgpa = totalGradePoint / subjects;
        System.out.println(cgpa);
    }
}
