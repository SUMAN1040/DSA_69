//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//         Marks        Grade
//        91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        51-60          CD
//        41-50          DD
//        <=40          Fail
package Assignments.Functions;

import java.util.Scanner;

public class DisplayGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int marks = in.nextInt();
        checkGrade(marks);
        in.close();
    }

    static void checkGrade(int number) {
        if (number < 0) {
            System.out.println("Enter right number");
        } else {
            if (number >= 91 && number <= 100) System.out.println("AA");
            else if (number >= 81 && number <= 90) System.out.println("AB");
            else if (number >= 71 && number <= 80) System.out.println("BB");
            else if (number >= 61 && number <= 70) System.out.println("BC");
            else if (number >= 51 && number <= 60) System.out.println("CD");
            else if (number >= 41 && number <= 50) System.out.println("DD");
            else if (number <= 40) System.out.println("FAIL");
            else System.out.println("Enter the right number");
        }
    }
}
