package com.dsa.lecture15;

public class SplitArray {
    public static void main(String[] args) {

    }

//    public int splitArray(int[] nums, int k) {
//        int start = 0;
//        int end = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//            start = Math.max(start, nums[i]);  //in the end of the loop this contain max item
//            end += nums[i];
//        }
//
//        //Binary search
//        while (start < end) {
//            //Try for the middle
//            int mid = start + (end - start) / 2;
//
//            //Calculate how many pieces you can divide this in with this max sum
//            int sum = 0;
//            int pieces = 1;
//
//            for (int num: nums){
//                if(sum + num > mid){
//                    //you can not add this in this subarray, make new one
//                    //Say you add this num in new subarray, then sum = num
//                    sum = num;
//                    pieces++;
//                }else{
//                    sum += num;
//                }
//            }
//
//            if(pieces > k){
//                start = mid + 1;
//            }else{
//                end = mid;
//            }
//        }
//
//        return end;
//    }


    // Optimize Solution
    private boolean canBeSplitted(int[] nums, int guess, int k) {
        int student = 1;
        int pages = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pages + nums[i] <= guess) {
                pages = pages + nums[i];
            } else {
                student++;
                pages = nums[i];

                if (student > k) {
                    return false;
                }
            }
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0, high = 0;
        int ans = -1;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }

        while (low <= high) {
            int guess = low + (high - low) / 2;

            if (canBeSplitted(nums, guess, k)) {
                ans = guess;
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }
        return ans;
    }
}
