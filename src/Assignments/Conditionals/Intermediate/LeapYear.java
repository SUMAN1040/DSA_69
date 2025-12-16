package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not leap year");
        }
        in.close();
    }
}
