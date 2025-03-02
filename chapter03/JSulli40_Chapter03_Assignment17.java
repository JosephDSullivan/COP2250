/**
 * Chapter 03, Assignment 17.
 * Write a program that plays the popular rock-paper-scissor game. (A scissor
 * can cut a paper, a rock can knock a scissor, and a paper can wrap a rock).
 * The program randomly generates a number 0, 1, or 2 representing scissor,
 * rock and paper. The program prompts the user to enter a number 0, 1, or 2
 * and displays a message indicating whether the user or the computer wins,
 * loses or draws.
 * ***Look in the book for a sample run.
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-01-31
 */
package chapter03;

import java.util.Scanner;

/**
 * This code is for chapter 03, assignment 17.
 */
public class JSulli40_Chapter03_Assignment17 {
    /**
     * Play rock, paper, scissors with the user for one round.
     *
     * @param args Not processed.
     */
    public static void main(String[] args) {
        //  Initialize Scanner input.
        Scanner input = new Scanner(System.in);
        //  Computer and user guess text (0=rock, 1=paper, 2=scissors) and
        //  result text.
        String compGuessTxt;
        String userGuessTxt;
        String result;

        //  Calculate computer guess.
        int compGuess = (int) (Math.random() * 3);

        //  Obtain user guess.
        System.out.println("\n(0=rock, 1=paper, 2=scissors)");
        System.out.print("Enter your choice: ");
        int userGuess = input.nextInt();

        //  Calculate results.
        switch (compGuess) {
            case 0:
                compGuessTxt = "rock";
                break;
            case 1:
                compGuessTxt = "paper";
                break;
            case 2:
                compGuessTxt = "scissors";
                break;
            default:
                compGuessTxt = "#ERROR#";
                break;
        }
        switch (userGuess) {
            case 0:
                userGuessTxt = "rock";
                break;
            case 1:
                userGuessTxt = "paper";
                break;
            case 2:
                userGuessTxt = "scissors";
                break;
            default:
                userGuessTxt = "#ERROR#";
                break;
        }
        if (userGuess == compGuess) {
            result = "It was a tie!";
        } else if (userGuess == 0 && compGuess == 1
                || userGuess == 1 && compGuess == 2
                || userGuess == 2 && compGuess == 0) {
            result = "I won.";
        } else if (userGuess == 0 && compGuess == 2
                || userGuess == 1 && compGuess == 0
                || userGuess == 2 && compGuess == 1) {
            result = "You won!";
        } else {
            result = "There was an error. Please try again.";
        }

        //  Display results.
        System.out.print("\nI guessed " + compGuessTxt + ". ");
        System.out.println("You guessed " + userGuessTxt + ".");
        System.out.println(result);
    }
}