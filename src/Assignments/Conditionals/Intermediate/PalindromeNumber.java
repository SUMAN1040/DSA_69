package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if(rev.equals(str)){
            System.out.println("This is palindrome number");
        }else{
            System.out.println("This is not a palindrome");
        }
    }
}
