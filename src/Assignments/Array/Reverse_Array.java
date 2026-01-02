//Reverse an Array
package Assignments.Array;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        reverse(arr);

        // Print reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        in.close();
    }

    static void reverse(int[] arr) {
//        int[] reverse = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            reverse[i] = arr[arr.length - 1 - i];
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(reverse[i]);
//        }


        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
