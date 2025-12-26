package com.dsa.lecture12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingIinFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }

    //Strings are immutable in java but in case of arrays are mutable in java
}
