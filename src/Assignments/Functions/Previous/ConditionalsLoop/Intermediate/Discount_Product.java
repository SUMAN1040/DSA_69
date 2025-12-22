package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Discount_Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        float original_price = in.nextFloat();
        float sale_price = in.nextFloat();
        if (original_price > 0) {
            float Discount_Amount = ((original_price - sale_price) / original_price) * 100;
            System.out.println(Discount_Amount);
        } else {
            System.out.println("Original price must be greater than zero");
        }
    }
}
