//Given two arrays arr1[] and arr2[], find the union of both arrays.
//The union contains all unique elements present in either of the arrays.
package Assignments.Array;

import java.util.Scanner;

public class Union_Two_Arrays {
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


//        int[] union = new int[n1 + n2];
//        int index = 0;
//
//        for (int i = 0; i < n1; i++) {
//            union[index++] = arr1[i];
//        }
//        for (int i = 0; i < n2; i++) {
//            boolean isPresent = false;
//
//            for (int j = 0; j < index; j++) {
//                if (arr2[i] == union[j]) {
//                    isPresent = true;
//                    break;
//                }
//            }
//            if (!isPresent) {
//                union[index++] = arr2[i];
//            }
//        }
//        System.out.println("Union of Arrays: ");
//        for (int i = 0; i < index; i++) {
//            System.out.println(union[i] + " ");
//        }
//        in.close();


        int i = 0;
        int j = 0;

        System.out.println("Union of arrays: ");

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                printIfNotDuplicate(arr1, i);
                i++;
            } else if (arr1[i] > arr2[j]) {
                printIfNotDuplicate(arr2, j);
                j++;
            } else {
                printIfNotDuplicate(arr1, i);
                i++;
                j++;
            }
        }

        while (i < arr1.length) {
            printIfNotDuplicate(arr1, i);
            i++;
        }
        while (j < arr2.length) {
            printIfNotDuplicate(arr2, j);
            j++;
        }
        in.close();
    }

    static void printIfNotDuplicate(int[] arr, int index) {
        if (index == 0 || arr[index] != arr[index - 1]) {
            System.out.println(arr[index]);
        }
    }
}
