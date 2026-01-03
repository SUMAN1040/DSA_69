/*Given an integer array arr[], count how many times each element appears.
You must not use HashMap or extra data structures—only arrays and loops.*/
package Assignments.Array;

import java.util.Scanner;

public class Count_Frequency {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " occurs" + count + " times");
        }
    }
}
