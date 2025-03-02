/**
 * Chapter 06, Assignment 05.
 * Write a method with the following header that will sort three numbers and
 * display the three numbers in increasing order:
 * public static void displaySortedNumbers(double num1, double num2, double
 * num3)
 * Write a separate main method that prompts the user to enter three numbers
 * and invokes (calls) the method displaySortedNumbers to display them in
 * increasing order.
 * The class name should still follow the format needed with your name,
 * chapter# and assignment#.
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-02-23
 */

package chapter06;

import java.util.Scanner;

/**
 * This code is for chapter 06, assignment 05.
 */
public class JSulli40_Chapter06_Assignment05 {
    /**
     * Main method.
     * Prompts the user for three numbers and displays them in
     * ascending order.
     */
    public static void main(String[] args) {
        //  Instantiate Scanner to retrieve user input.
        Scanner scanner = new Scanner(System.in);

        //  Retrieve three numbers using getValidDouble().
        double num1 = getValidDouble(scanner, "Please enter the " +
                "first number:\t");
        double num2 = getValidDouble(scanner, "Please enter the " +
                "second number:\t");
        double num3 = getValidDouble(scanner, "Please enter the " +
                "third number:\t");

        //  Display sorted results.
        displaySortedNumbers(num1, num2, num3);

        //  Close Scanner.
        scanner.close();
    }

    /**
     * Repeatedly prompts the user until a valid double is entered. Invalid
     * input is discarded.
     *
     * @param scanner  Scanner to retrieve user input.
     * @param msgInput Message to display to the user when prompting for input.
     * @return Validated double.
     */
    public static double getValidDouble(Scanner scanner,
                                        String msgInput) {
        //  Assume input in invalid.
        boolean isValid = false;
        //  Number from user input.
        double inputNumber = 0.0;
        //  Message to display when there is invalid input.
        String msgInvalid = "Invalid input. Please enter a valid number.";

        //  Repeat until input is flagged as valid.
        while (!isValid) {
            //  Display input message.
            System.out.print(msgInput);
            //  Test to see if user input is double.
            if (scanner.hasNextDouble()) {
                //  User input is valid.
                inputNumber = scanner.nextDouble();
                isValid = true;
            } else {
                //  User input is invalid.
                System.out.println(msgInvalid);
                scanner.nextLine();
            }
        }

        //  Return validated double.
        return inputNumber;
    }

    /**
     * Display three numbers sorted in ascending order.
     *
     * @param num1 First number.
     * @param num2 Second number.
     * @param num3 Third number.
     */
    public static void displaySortedNumbers(double num1,
                                            double num2,
                                            double num3) {
        //  Variables to hold ordered numbers.
        double largest;
        double medium;
        double smallest;

        //  Sorted parameters into largest, medium, and smallest.
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
            if (num2 >= num3) {
                medium = num2;
                smallest = num3;
            } else {
                medium = num3;
                smallest = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
            if (num1 >= num3) {
                medium = num1;
                smallest = num3;
            } else {
                medium = num3;
                smallest = num1;
            }
        } else {
            largest = num3;
            if (num1 >= num2) {
                medium = num1;
                smallest = num2;
            } else {
                medium = num2;
                smallest = num1;
            }
        }

        //  Display sorted numbers to user in ascending order.
        System.out.printf("The smallest number is:\t%6.4f%n", smallest);
        System.out.printf("The middle number is:\t%6.4f%n", medium);
        System.out.printf("The largest number is:\t%6.4f%n", largest);
    }
}
