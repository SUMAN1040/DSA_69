/*Given an integer array, find the element that occurs the maximum number of times.
If multiple elements have the same maximum frequency, you may return any one of them (unless specified otherwise).
*/
package Assignments.Array;

import java.util.Scanner;

public class Element_Occurring_Maximum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxCount = 0;
        int element = arr[0];

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int k : arr) {
                if (arr[i] == k) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                element = arr[i];
            }
        }
        System.out.println("Element with maximum frequency: " + element);
        System.out.println("Frequency: " + maxCount);
    }
}
