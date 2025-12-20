//To find out whether the given String is Palindrome or not.
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        check(input);
        in.close();
    }

    static void check(String a) {
        String str = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            str += a.charAt(i);
        }
        if (a.equals(str)) {
            System.out.println("this is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
