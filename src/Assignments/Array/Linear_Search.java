//Given an array of integers and a target value, find the index of the target element in the array.
//If the element is not present, return -1.
package Assignments.Array;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 60};
        int target = 30;

        int result = linearSearch(arr, target);
        System.out.println(result);
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
