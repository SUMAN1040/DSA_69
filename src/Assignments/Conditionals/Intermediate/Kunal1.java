//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class Kunal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();

        while (day != 0 && day < 31) {
            if (day % 2 == 0) {
                System.out.println("Kunal Can Go");
            } else {
                System.out.println("Sorry");
            }
            day = in.nextInt();
        }
        System.out.println("You put invalid date so this counting calci goona off");
        in.close();
    }
}
