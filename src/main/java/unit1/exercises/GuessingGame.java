package unit1.exercises;

import java.util.Random;

/**
 * This is a simple game where you guess a number.
 * The rule is simple: the game generate a random number and accepts guesses from the user until the user guesses the number correctly
 * Spec: The game should pick a RANDOM number and prompt the user to guess it. Each time the user makes a guess,
 *      if the user guess it incorrectly, the game should prompt the user whether the actual number is higher/lower than
 *      the one user guessed. Otherwise, the game should show user how many times it took for he/she to guess the number
 *      and ask whether or not they want to play again. If the user enters 'yes', the game re-starts.
 *      Otherwise, the game ends.
 * Tips: 1) You can use any data structures you like
 *       2) You should use the Random object to get random number
 *       3) You should use a Scanner to get user input
 *       4) You can assume that the user will be well-behaved
 */
public class GuessingGame {
    // TODO: declare global variables here
//    private Random rand = new Random();
    public static void main(String[] args) {
        System.out.println("Welcome to the guessing game!");
    }
}
