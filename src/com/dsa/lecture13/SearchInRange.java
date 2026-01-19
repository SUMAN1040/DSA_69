package com.dsa.lecture13;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[7];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();

        System.out.println(linearSearch(nums, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}
