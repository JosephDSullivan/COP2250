/**
 * Chapter 05, Assignment 01.
 * Write a program that prompts the user to enter an unspecified number of
 * integers. The program then determines how many positive and negative values
 * have been entered and computes the total and average of the input values
 * (not counting zeros). Your program ends when 0 is input. Display the
 * average as a floating-point number.
 * *** Look in the book for a sample run.
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-02-12
 */

package chapter05;

import java.util.Scanner;

/**
 * This code is for chapter 05, assignment 01.
 */
public class JSulli40_Chapter05_Assignment01 {
    /**
     * Get integer input from user until 0 is entered and report to user
     * counts (total, +, -), sum, and average.
     *
     * @param args Not processed.
     */
    public static void main(String[] args) {
        //  Initialize variables storing counters and sum.
        int count = 0;
        int countPositive = 0;
        int countNegative = 0;
        long sum = 0;

        //  Initialize variables storing user input.
        Scanner input = new Scanner(System.in);
        long inputInt = -1;

        //  Loop until input is 0.
        while (inputInt != 0) {
            //  Get input from user.
            System.out.print("Enter an integer (enter 0 to exit): ");
            inputInt = input.nextInt();
            //  If input is  0, break the while loop.
            if (inputInt == 0) {
                break;
            }
            //  Calculate counters and sum.
            count++;
            if (inputInt > 0) {
                countPositive++;
            } else {
                countNegative++;
            }
            sum += inputInt;
        }

        //  Close Scanner.
        input.close();

        //  Generate output.
        String output = "\n";
        output += "Count:            " + count + "\n";
        output += "Positive Numbers: " + countPositive + "\n";
        output += "Negative Numbers: " + countNegative + "\n";
        output += "Sum:              " + sum + "\n";
        output += "Average :         ";
        if (count > 0) {
            //  At least one number entered. Calculate average.
            output += (double) sum / count;
        } else {
            //  No number entered. Indicate this to user.
            output += "No number entered.";
        }

        //  Display output to user.
        System.out.println(output);
    }
}
