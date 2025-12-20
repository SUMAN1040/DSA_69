//Define a method to find out if a number is prime or not.
package Assignments.Functions;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (isPrime(number)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime Number");
        }
    }
    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
