package com.dsa.lecture8;

import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the temperature:");
        float tempC = input.nextFloat();
        float tempF = tempC*(9/5)+32;
        System.out.println(tempF);
    }

}
