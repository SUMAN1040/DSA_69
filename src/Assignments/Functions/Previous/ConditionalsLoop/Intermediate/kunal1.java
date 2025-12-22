//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class kunal1 {
    public static void main(String[] args) {
        System.out.println("Kunal can go out on " + countEvenDaysInAugust() + " days");
    }

    static int countEvenDaysInAugust() {
        int count = 0;
        for (int day = 1; day <= 31; day++) {
            if (day % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
