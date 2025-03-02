/**
 * Chapter 04, Assignment 13.
 * Write a program that prompts the user to enter a letter and check whether
 * the letter is a vowel or consonant. For a nonletter input, display invalid
 * input.
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-02-09
 */

package chapter04;

import java.util.Scanner;

/**
 * This code is for chapter 04, assignment 13.
 */
public class JSulli40_Chapter04_Assignment13 {
    /**
     * Get user input and determine if it is a vowel, consonant, or invalid.
     *
     * @param args Not processed.
     */
    public static void main(String[] args) {
        //  Get user input.
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();

        //  Convert user input to lower case.
        String inputStrLower = inputStr.toLowerCase();

        //  Store the first character of the input.
        char inputChar0 = inputStrLower.charAt(0);

        //  Initialize output text.
        String outputText = "";

        //  Determine if input is valid.
        if (inputStr.length() == 1 && Character.isLetter(inputChar0)) {
            //  Determine if input is a vowel or consonant.
            if ("aeiou".toLowerCase().indexOf(inputChar0) != -1) {
                //  Set output text to indicate that input is a vowel.
                outputText = "You entered a vowel.";
            } else {
                //  Set output text to indicate that input is a consonant.
                outputText = "You entered a consonant.";
            }
        } else {
            //  Set output text to indicate that input in invalid.
            outputText = "Your input is invalid. Please enter a single " +
                    "letter.";
        }

        //  Display output text.
        System.out.println(outputText);

        //  Close scanner.
        scanner.close();
    }
}
