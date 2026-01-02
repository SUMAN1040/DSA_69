//Find the Maximum and Minimum Element
package Assignments.Array;

import java.util.Scanner;

public class Maximum_Minimum {

    static int[] getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] result = getMinMax(arr);

        System.out.println("Min element: " + result[0]);
        System.out.println("Max element: " + result[1]);
    }
}
