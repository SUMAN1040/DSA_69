package Assignments.Other;

import java.util.Scanner;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        guessingNumber();
    }

    public static void guessingNumber() {
        Scanner in = new Scanner(System.in);

        int number = 1 + (int) (100 * Math.random());

        int k = 5;
        System.out.println("A number is choose between 1 to 100.");
        System.out.println("You have " + k + " attempts to guess the correct number.");

        //Loop for K empty
        for (int i = 0; i < k; i++) {
            System.out.println("Enter your guess: ");
            int guess = in.nextInt();

            //Check conditions
            if (guess == number) {
                System.out.println("Congratulations! you guess the correct number.");
                in.close();
                //Exit the function if guess correctly
                return;
            } else if (guess < number) {
                System.out.println("The number is greater than " + guess);
            } else {
                System.out.println("The number is less than " + guess);
            }
        }

        //If the user run out of attempt
        System.out.println("You've exhausted all attempts. The correct number was: " + number);
        in.close();
    }
}
