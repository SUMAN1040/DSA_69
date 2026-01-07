//You are given a sorted array. Remove the duplicates in-place such that each element appears only once and return the new length of the array.
package Assignments.Array;

import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int newLength = removeDuplicates(arr);
        System.out.println("The new length is " + newLength);
        System.out.println("Array after removing duplicates is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
