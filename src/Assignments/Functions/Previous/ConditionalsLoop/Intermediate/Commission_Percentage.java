//Calculate Commission Percentage
package Assignments.Functions.Previous.ConditionalsLoop.Intermediate;

import java.util.Scanner;

public class Commission_Percentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        calculate(in);
        in.close();
    }

    static void calculate(Scanner in) {
        System.out.println("Enter the commission amount: ");
        float commission_amount = in.nextFloat();
        System.out.println("Enter the total sales: ");
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
