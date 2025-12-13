package Assignments.First_Java;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int inr = in.nextInt();

        float usd = (float)(inr*0.011);
        System.out.println(usd);
    }
}
