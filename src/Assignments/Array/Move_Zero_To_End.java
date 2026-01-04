//Given a integer array arr[], move all the 0s to the end of the array while maintaining the relative order of the non zero elements.
package Assignments.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Move_Zero_To_End {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
//
//        int[] update = new int[n];
//        int index = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                update[index++] = arr[i];
//            }
//        }

        //2nd method using count non-zero
//        moveZeroes(arr);

        //3d method using two pointer
        Move_Zero_To_End move = new Move_Zero_To_End();
        move.moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
        in.close();
    }

//    static void moveZeroes(int[] arr) {
//        int index = 0;
//
//        for (int num : arr) {
//            if (num != 0) {
//                arr[index++] = num;
//            }
//        }
//
//        while (index < arr.length) {
//            arr[index++] = 0;
//        }
//    }


    //Using Two pointer technique
    public void moveZeroes(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;
                nonZeroIndex++;
            }
        }
    }
}
