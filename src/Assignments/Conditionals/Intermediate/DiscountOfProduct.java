//Calculate Discount Of Product
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float original_price = in.nextFloat();
        float sale_price = in.nextFloat();
        if (original_price > 0) {
            float Discount_Amount = ((original_price - sale_price) / original_price) * 100;
            System.out.println(Discount_Amount);
        } else {
            System.out.println("Original price must be greater than zero");
        }

        in.close();
    }
}
