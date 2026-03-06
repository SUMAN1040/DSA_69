package com.dsa.lecture20;

import java.util.Arrays;

class Duplicate {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        findDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){

            if(arr[i] != i + 1){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr, i, correctIndex);
                }else{
                    return;
                }
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}