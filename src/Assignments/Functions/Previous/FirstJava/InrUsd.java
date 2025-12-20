//Input currency in rupees and output in USD.
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class InrUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float amount = in.nextFloat();
        transfer(amount);
        in.close();
    }

    static void transfer(float rupes) {
        float usd = (float) ((float) rupes * 0.011);
        System.out.println("The change money is " + usd);
    }
}
