//Java Program Vowel Or Consonant
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Vowel_Consonant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        in.close();

        if (isVowel(ch)) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

//Time: O(1)
//Space: O(1)