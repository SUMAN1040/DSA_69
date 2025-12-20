//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package Assignments.Functions.Previous.FlowOfProgram;

import java.util.Scanner;

public class PressSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = check(in);
        System.out.println(result);
        in.close();
    }

    static int check(Scanner in) {
        int sum = 0;
        while (true) {
            String input = in.next();
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            sum += Integer.parseInt(input);
        }
        return sum;
    }
}
//Time & Space Complexity
//
//Time Complexity: O(n)
//(n = number of inputs entered)
//
//Space Complexity: O(1)