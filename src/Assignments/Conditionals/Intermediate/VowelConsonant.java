//Java Program Vowel Or Consonant
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch>= 'A' && ch<= 'Z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println(ch + " is a Vowel");
                } else {
                    System.out.println(ch + " is a Consonant");
                }
            }
        }
        in.close();
    }
}