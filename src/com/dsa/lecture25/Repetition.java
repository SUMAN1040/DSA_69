package com.dsa.lecture25;

import java.util.Scanner;

public class Repetition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(rep(arr));
    }

    static int rep(int[] arr) {
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    continue;
//                } else {
//                    count = arr[i];
//                }
//            }
//        }
//        return count;


        int ans = 0;
        for (int n : arr) {
            ans ^= n;
        }
        return ans;
    }
}
