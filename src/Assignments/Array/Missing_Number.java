/*You are given an array of size n-1 containing numbers from 1 to n, with exactly one number missing.
Find the missing number.*/
package Assignments.Array;

public class Missing_Number {

    public static void main(String[] args) {

        //Using mathematical formula
//        int[] arr = {1, 2, 3, 5};
//        int n = arr.length + 1;
//
//        int expectedSum = n * (n + 1) / 2;
//        int actualSum = 0;
//
//        for (int num : arr) {
//            actualSum += num;
//        }
//
//        int missingSum = expectedSum - actualSum;
//        System.out.println("Missing Number: " + missingSum);


        //Using XOR Method
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;

        int xor = 0;

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }
        for (int num : arr) {
            xor ^= num;
        }
        System.out.println("Missing Number: " + xor);
    }

}
