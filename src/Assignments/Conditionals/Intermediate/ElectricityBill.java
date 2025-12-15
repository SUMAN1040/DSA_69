//Calculate Electricity Bill
package Assignments.Conditionals.Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int units = in.nextInt();
        double bill = 0;
        if (units <= 100) {
            bill = 1.5 * units;
        } else if (units <= 200) {
            bill = (100 * 1.5) + (units - 100) * 2.5;
        } else if (units <= 300) {
            bill = (100 * 1.5) + (100 * 2.5) + (units - 300) * 4.0;
        } else {
            bill = (100 * 1.5) + (2.5 * 100) + (100 * 4.0) + (units - 300) * 6.0;
        }
        System.out.println(bill);
        in.close();
    }
}
