//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package Assignments.Functions;

import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        boolean afterCheck = voteAgeTest(age);
        checkAge(afterCheck);
        in.close();
    }

    static boolean voteAgeTest(int number) {
        return number >= 18;
    }

    static void checkAge(boolean voteAgeTest) {
        if (voteAgeTest) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Under aged can't vote");
        }
    }
}
