package com.dsa.lecture15;

import java.util.Scanner;

//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/#alternate-approach-ologk-time-and-o1-space
public class InfiniteArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 10, 12, 23, 34, 45, 56, 57, 22, 33, 44};
        int target = 10;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int[] arr, int target) {
        //Finding the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        //condition for the target to lie the range
        while (target > arr[end]) {
            int temp = end + 1; //This is my array start
            //Double the box value
            //End = Previous end + SizeOfBox * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
