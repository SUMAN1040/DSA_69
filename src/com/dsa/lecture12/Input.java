package com.dsa.lecture12;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 34;
        arr[2] = 334;
        arr[3] = 3454;
        arr[4] = 3455;
//        [23, 34, 334, 3454, 3455]
        System.out.println(arr[3]);


        //input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for(int num: arr){   //for every element in array, print the element
//            System.out.print(num); //here num represent the element of this array
//        }

        //Array in objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));


        //modify
        str[1] = "Suman";
        System.out.println(Arrays.toString(str));
    }
}
