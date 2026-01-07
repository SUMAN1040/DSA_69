//Given an array of integers and an integer k, rotate the array by k positions.
package Assignments.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Element {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int k = in.nextInt();

        //Using suffix base rotation, Right Rotate(The complexity of this time: O(n) and the space: O(n)
//        k %= n;
//        int[] result = new int[n];
//        int index = 0;
//
//        for (int i = n - k; i < n; i++) {
//            result[index++] = arr[i];
//        }
//
//        for (int i = 0; i < n - k; i++) {
//            result[index++] = arr[i];
//        }
//
//        System.out.println(Arrays.toString(result));
//        in.close();


        //Left Rotation by K Positions:  (Time complexity: O(n) & Space Complexity: O(1)
//        leftRotate(arr, k);
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        in.close();


        //Right Rotation
        rightRotate(arr, k);
        System.out.println("Array after right rotation:");
        System.out.println(Arrays.toString(arr));
        in.close();

    }

    //Left Rotation by K Positions
//    public static void leftRotate(int[] arr, int k) {
//        int n = arr.length;
//        k = k % n;
//        reverse(arr, 0, k - 1);
//        reverse(arr, k, n - 1);
//        reverse(arr, 0, n - 1);
//    }
//
//    public static void reverse(int[] arr, int start, int end) {
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//    }


    //Right rotation
    static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
