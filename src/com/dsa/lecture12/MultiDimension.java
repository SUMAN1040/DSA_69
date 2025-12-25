package com.dsa.lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
//        1, 2, 3, 4
//        4, 5, 6, 7
//        8, 9, 2, 4
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // no of rows
//        int[][] arr = {
//                {1, 2, 3},  //0th index
//                {4, 5, 6},  //1st index
//                {7, 8, 9}  //2nd index
//        };
        // in case of c/cpp there continues memory allocation happened but in case of java there not mandatory to continues memory allocation
        //input

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //output
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
