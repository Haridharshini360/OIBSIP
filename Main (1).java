import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too Low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too High! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + numberOfTries + " tries!");
            }
        }
        sc.close();
    }
}