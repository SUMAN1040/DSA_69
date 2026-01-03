/*Given an integer array arr[],find the second-largest distinct element in the array.
        Do not use sorting.*/
package Assignments.Array;

import java.util.Scanner;

public class Second_Largest_Element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int result = findLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("Second largest value does not exist");
        } else {
            System.out.println("Second largest value is " + result);
        }
    }

    static int findLargest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}
