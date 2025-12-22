//Reverse A String In Java
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        String input  = in.next();
        StringBuilder str = new StringBuilder();

        for (int i = input.length()-1; i>=0; i--){
            str.append(input.charAt(i));
        }
        System.out.println(str);
    }
}
