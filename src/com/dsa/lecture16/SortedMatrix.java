package com.dsa.lecture16;

public class SortedMatrix {
    public static void main(String[] args) {

    }



    //Search in the row provided between the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){

        while (cStart <= cEnd) {
            int mid = (cEnd + cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }if (matrix[row][mid] < target){
                cStart = mid - 1;
            }else{
                 cEnd = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;  // Be cautious, matrix may be empty

        if(row == 1){
            return binarySearch(arr, 0, 0, col-1, target);
        }

        int rStart = 0;
        int rEnd = 0;
        int cMid = col / 2;
        // Run the loop till 2 rows are remaining
        while(rStart < rEnd - 1){
            int mid = rStart + (rEnd - rStart) / 2;

            if(arr[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(arr[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        //Now we have two rows
        //check whether the target is in the column of 2 rows
        if(arr[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(arr[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }


        //Search in 1st half
        //Search in 2nd half
        //Search in 3rd half
        //Search in 4th half

    }
}
