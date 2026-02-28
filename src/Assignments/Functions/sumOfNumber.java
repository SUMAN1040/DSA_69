//Write a program to print the sum of two numbers entered by user by defining your own method.
package Assignments.Functions;

import java.util.Scanner;

public class sumOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        int answer = sum(number1, number2);
        System.out.println("The Sum of two number is: " + answer);
        in.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }
}


/*
Interview Q&A You Should Be Ready For

Q: Why did you use a separate method?
A: To improve code reusability, readability, and separation of concerns.

Q: What is the time and space complexity?
A:  Time: O(1)
    Space: O(1)

Q: Can this be optimized further?
A: No, this is already optimal.
* */