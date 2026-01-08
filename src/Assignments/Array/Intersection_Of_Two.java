//Given two arrays arr1[] and arr2[], print the common elements present in both arrays.
//Each common element should be printed once.
package Assignments.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection_Of_Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st arrays length:");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter 1st arrays elements:");
        for (int i = 0; i < n1; i++) arr1[i] = in.nextInt();

        System.out.println("Enter 2nd arrays length:");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter 2nd arrays elements:");
        for (int i = 0; i < n2; i++) arr2[i] = in.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        int j = 0;

        System.out.print("Intersection Elements: ");
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                // Print only once (skip duplicates)
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    System.out.print(arr1[i] + " ");
                }
                i++;
                j++;

            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}