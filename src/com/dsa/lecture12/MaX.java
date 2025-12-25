package com.dsa.lecture12;

public class MaX {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxRange(arr, 1, 4));
    }


    //work in edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end) {

        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //imagine that arr is not empty
    static int max(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
