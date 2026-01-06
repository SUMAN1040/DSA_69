//Given an integer array arr[] of size n, you will be asked multiple queries.
//Each query gives two indices L and R.
package Assignments.Array;

import java.util.Scanner;

public class Prefix_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < number; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the target digit: ");
        int L = input.nextInt();
        int R = input.nextInt();
        input.close();

        int[] prefix = buildPrefixSum(arr);
        System.out.println(rangeSum(prefix, L, R));
    }

    static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) {
            return prefix[R];
        }
        return prefix[R] - prefix[L - 1];
    }
}
