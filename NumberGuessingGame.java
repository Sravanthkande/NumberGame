import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(max - min + 1) + min;
            int numberOfAttempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Guess a number between " + min + " and " + max + ":");

            while (!hasGuessedCorrectly) {
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again:");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again:");
                } else {
                    System.out.println("Correct! You've guessed the number in " + numberOfAttempts + " attempts.");
                    hasGuessedCorrectly = true;
                }
            }

            // Consume the newline character left by nextInt()
            scanner.nextLine();

            System.out.println("Do you want to play again? (Yes/No)");
            String response = scanner.nextLine();
            playAgain = response.equalsIgnoreCase("Yes");
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}
