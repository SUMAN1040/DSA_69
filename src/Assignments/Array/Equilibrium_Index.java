package Assignments.Array;

import java.util.Scanner;

public class Equilibrium_Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Equilibrium index: " + equilibrium(arr));
    }

    static int equilibrium(int[] arr) {
        int totalSum = 0;

        for (int num : arr) {
            totalSum = totalSum + num;
        }
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
//arr = [1, 3, 5, 2, 2]