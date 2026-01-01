//Example: Taking a input from user of multidimensional array (Runtime) and print the count of even and odd number given by user.
package Assignments.Other;

import java.util.Scanner;
import java.util.*;

public class Array_Geeks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] arr = new int[n][];

        int t = 0;


        for (int i = 0; i < n; i++) {
            int m = in.nextInt();

            t = m;

            arr[i] = new int[m];

            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int odd = 0;
        int even = 0;

        System.out.println("Row " + n + " with" + t + " Column");
        System.out.println("Element of arrays: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");

                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                odd++;
            }
            System.out.println();
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
        in.close();
    }

}
