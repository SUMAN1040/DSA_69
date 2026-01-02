//Count Even and Odd Numbers
package Assignments.Array;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        oddEven(arr);
        in.close();
    }

    static void oddEven(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }

}
