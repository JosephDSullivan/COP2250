/**
 * Chapter 02, Assignment 01.
 * Write a program that prompts the user for a subtotal and gratuity rate,
 * then computes the gratuity and total. For example, if the user enters
 * $10.00 for the subtotal and 15% for the gratuity rate, the program
 * displays $1.50 as gratuity and $11.50 as total.
 * Look in the book for a sample run.
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-01-25
 */
package chapter02;

import java.util.Scanner;

/**
 * This code is for chapter 02, assignment 01.
 */
public class JDSullivan_Chapter02_Assignment01 {
    /**
     * Calculate gratuity amount and total based on user provided subtotal
     * gratuity percent and display to user.
     *
     * @param args Not processed.
     */
    public static void main(String[] args) {
        //  Create new Scanner.
        Scanner input = new Scanner(System.in);

        //  Obtain subtotal.
        System.out.print("Enter the subtotal of your check, e.g., 37.65: $");
        double subtotal = (int)(input.nextDouble() * 100) / 100.0;

        //  Obtain gratuity percent.
        System.out.print("Enter the gratuity as a percent, e.g., 18.5:    ");
        double gratuityPercent = input.nextDouble() / 100.0;

        //  Calculate gratuity amount.
        double gratuityAmount =
                (int)(subtotal * gratuityPercent * 100) / 100.0;

        //  Calculate total amount.
        double total = subtotal + gratuityAmount;

        //  Display results.
        System.out.println("\nGratuity (" + gratuityPercent * 100 + "%) = $" +
                gratuityAmount);
        System.out.print("TOTAL = $" + total);
    }
}
