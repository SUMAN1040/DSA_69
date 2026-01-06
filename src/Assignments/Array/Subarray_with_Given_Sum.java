//Given an array of positive integers arr[] and an integer S, find a continuous subarray whose sum is equal to S.
//Return the 1-based starting and ending indices of the first such subarray.
//If no such subarray exists, return -1.
package Assignments.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Subarray_with_Given_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int integer = in.nextInt();
        System.out.println("The continuous subarray is: " + Arrays.toString(subArraySum(arr, n, integer)));
    }

    static int[] subArraySum(int[] arr, int n, int S) {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum > S && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == S) {
                return new int[]{start + 1, end + 1}; // 1-based indexing
            }
        }
        return new int[]{-1};
    }

}
//Q: Will this work with negative numbers?
//A: ❌ No. Sliding window works only with positive numbers.
//For negative numbers → use Prefix Sum + HashMap


