//Calculate CGPA Java Program
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int subjects = in.nextInt();

        double totalGradePoint = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.println("Enter grade point for subjects " + i + ":");
            double GradePoints = in.nextDouble();
            totalGradePoint += GradePoints;
        }
        double cgpa = totalGradePoint / subjects;
        System.out.println(cgpa);
        in.close();
    }
}
