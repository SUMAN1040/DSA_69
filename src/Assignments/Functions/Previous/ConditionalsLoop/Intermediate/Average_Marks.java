//Calculate Average Marks
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        int number_of_subjects = in.nextInt();
        float avg_marks = 0;
        float sum = 0;
        for (int i = 1; i <= number_of_subjects; i++) {
            float marks = in.nextInt();
            sum += marks;
        }
        avg_marks = sum / number_of_subjects;
        System.out.println(avg_marks);
    }
}
