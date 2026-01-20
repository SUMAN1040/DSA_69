package com.dsa.lecture13;

import java.util.Arrays;

public class maxItem {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {12, 14, 15, 5},
                {20, 21, 11, 45},
                {18, 12}
         };
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
