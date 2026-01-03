//Check if Array is Sorted
package Assignments.Array;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        boolean isSorted = check(arr);
        System.out.println(isSorted);

        in.close();
    }

    static boolean check(int[] arr) {
        if (arr.length <= 1) return true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
