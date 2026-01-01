package Assignments.Other;

import java.util.Scanner;

public class Number_Guessing_Game_Ul {
    public static void main(String[] args) {
        guessingNumber();
    }

    public static void guessingNumber() {
        Scanner in = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());

        int attempt = 0;

        int k = 5;

        boolean guessedCorrectly = false;

        System.out.println("A number is choose between 1 to 100: ");
        System.out.println("You have " + k + " attempts per round to guess the correct number: ");

        while (!guessedCorrectly) {
            for (int i = 0; i < k; i++) {
                System.out.println("Enter your guess: ");
                int guess = in.nextInt();
                attempt++;

                if (guess == number) {
                    System.out.println("Congratulation! you passed the correct number in " + attempt + " attempts");
                    guessedCorrectly = true;
                    break;
                } else if (guess < number) {
                    System.out.println("Guess the bigger number than " + guess);
                } else {
                    System.out.println("This is less than " + guess);
                }
            }
            if (!guessedCorrectly) {
                System.out.println("You have used all " + k + " attempts");
                System.out.println("Do you want to continue guessing? (yes/no): ");
                String response = in.next();

                if (!response.equalsIgnoreCase("Yes")) {
                    System.out.println("Game over! The correct number was: " + number);
                    break;
                }
            }
        }
        in.close();
    }
}
