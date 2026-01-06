//Given an integer array arr[], find the contiguous subarray (containing at least one number) which has the maximum sum, and return that sum.
package Assignments.Array;

import java.util.Scanner;

public class Maximum_Subarray_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(maxSubArraySum(arr));

    }

    static int maxSubArraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
//[-2, 1, -3, 4, -1, 2, 1, -5, 4]
//Kadane's algorithm works by deciding at each index whether to start a new subarray or extend the previous one, based on which choice gives a higher sum
//CurrentSum tracks the best subarray ending at the current index, and maxSum tracks the best subArray seen so far