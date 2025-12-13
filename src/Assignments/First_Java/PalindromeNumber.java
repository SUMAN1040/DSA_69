//To find out whether the given String is Palindrome or not.

package Assignments.First_Java;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

//        String rev = new StringBuilder(str).reverse().toString();
//
//        if (str.equals(rev)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
