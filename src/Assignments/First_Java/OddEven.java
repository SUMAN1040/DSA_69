//Write a program to print whether a number is even or odd, also take input from the user.
package Assignments.First_Java;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number%2==0){
            System.out.println("This is an even number");
        }else{
            System.out.println("This is Odd Number");
        }
    }
}
