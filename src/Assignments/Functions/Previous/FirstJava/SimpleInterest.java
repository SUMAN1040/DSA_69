package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float principle = in.nextFloat();
        float rate = in.nextFloat();
        float time = in.nextFloat();
        interest(principle, rate, time);
        in.close();
    }

    static void interest(float p, float r, float t) {
        double Simple_Interest = (p * r * t) / 100;
        System.out.println("The simple interest is " + Simple_Interest);
    }
}