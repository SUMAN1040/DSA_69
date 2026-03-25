package com.dsa.lecture28;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 10, 3, 5, 6, 8};
        System.out.println(sort(arr, 0));
    }

    static boolean sort(int[] arr, int index) {
        // Base Condition
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sort(arr, index + 1);
    }
}
