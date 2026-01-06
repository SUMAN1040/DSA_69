//Given an array of integers arr[] and an integer target, determine whether
// there exists a pair of elements in the array whose sum equals the given target.
package Assignments.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_With_Given_Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target digit: ");
        int target = in.nextInt();
        System.out.println(findPair(arr, target));
    }

    public static boolean findPair(int[] arr, int target) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
