//Calculate Average Marks
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class AvarageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int NumberOfSubjects = in.nextInt();
        float sum = 0;
        for (int i = 1; i <= NumberOfSubjects; i++) {
            System.out.println("Enter the marks of " + i + ":");
            float marks = in.nextFloat();
            sum += marks;
        }
        float Avg = sum / NumberOfSubjects;
        System.out.println("Total Avg :" + Avg);
        in.close();
    }
}
