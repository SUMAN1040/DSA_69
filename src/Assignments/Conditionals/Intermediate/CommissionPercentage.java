//Calculate Commission Percentage
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float commission_amount = in.nextFloat();
        float total_sales = in.nextFloat();
        if (total_sales == 0) {
            System.out.println("Total sales can't be zero: ");
            return;
        }
        double commission_percentage = (commission_amount / total_sales) * 100;

//        System.out.println(commission_percentage);
        System.out.printf("The commission percentage is: %.2f%%\n", commission_percentage);
    }
}
