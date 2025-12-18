//Define a method that returns the product of two numbers entered by user.
package Assignments.Functions;

import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        long productOfTwoNumbers = product(number1, number2);
        System.out.println("The product of two numbers is: " + productOfTwoNumbers);
        in.close();
    }

    static long product(long a, long b) {
        return a * b;
    }
}
/*Q: What is the time and space complexity?
A:
{“The method performs a constant number of operations and does not depend on input size. There are no loops or recursive calls. Therefore, the time complexity is O(1) and the space complexity is also O(1).”}

Time Complexity: O(1)

Space Complexity: O(1)

Q: Why use a method for such a simple operation?
A:

To demonstrate modularity, reusability, and adherence to clean coding principles.

Final Verdict*/