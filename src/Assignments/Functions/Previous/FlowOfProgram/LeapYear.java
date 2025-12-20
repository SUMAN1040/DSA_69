//Input a year and find whether it is a leap year or not.
package Assignments.Functions.Previous.FlowOfProgram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (checkLeapYear(year)) {
            System.out.println("This is leap year");
        } else {
            System.out.println("This is not leap year");
        }
        in.close();
    }

    static boolean checkLeapYear(int number) {
        return number % 400 == 0 || (number % 100 != 0 && number % 4 == 0);
    }
}
//Time Complexity: O(1)
//
//Space Complexity: O(1)