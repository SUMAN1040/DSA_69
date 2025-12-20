//Take 2 numbers as input and print the largest number.
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        if (number1 == number2) {
            System.out.println("Both numbers are equal");
        } else if (checkLarge(number1, number2)) {
            System.out.println(number1 + " is largest");
        } else {
            System.out.println(number2 + " is largest");
        }
        in.close();
    }

    static boolean checkLarge(int a, int b) {
        return a > b;
    }
}

//| Aspect | Complexity |
//        | ------ | ---------- |
//        | Time   | **O(1)**   |
//        | Space  | **O(1)**   |

