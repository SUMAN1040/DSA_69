package com.dsa.lecture13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Enter your target value: ");
        int target = in.nextInt();
        System.out.println("After check the array element result is: ");
        System.out.println(linearSearch(nums, target));

    }

    //Searching in the array: return the index if item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            if (arr[i] == target) {
                return i;
            }
        }
        //this line will execute the none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
