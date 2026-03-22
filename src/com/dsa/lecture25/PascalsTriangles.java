package com.dsa.lecture25;

import java.util.Scanner;

public class PascalsTriangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the row number: ");
        int n = in.nextInt();

        int sum = 1 << (n - 1);

        System.out.println(sum);
        in.close();
    }
}
