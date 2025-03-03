/**
 * Chapter 07, Assignment 01.
 * Write a program that prompts the user to enter student scores, gets the
 * best score and then assigns grades based on the following scheme:
 *      Grade is A if score >= best - 10;
 *      Grade is B if score >= best - 20;
 *      Grade is C if score >= best - 30;
 *      Grade is D if score >= best -40;
 *      Grade is F otherwise.
 * The program prompts the user to enter the total number of students, then
 * prompts the user to enter all of the scores and concludes by displaying the
 * grades of each student.
 * ***Look in the book for a sample run.
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-03-02
 */

package chapter07;

import java.util.Scanner;

/**
 * This code is for chapter 07, assignment 01.
 */
public class JSulli40_Chapter07_Assignment01 {
    /**
     * Main method.
     * Prompts the user for student count, then prompts user for score for
     * each student. Program tracks maximum score and will return the result
     * of getGrade for each score and displays results to user.
     */
    public static void main(String[] args) {
        //  Instantiate Scanner to retrieve user input.
        Scanner scanner = new Scanner(System.in);

        //  Retrieve number of students to enter scores for.
        int countStudent = getValidInteger(scanner,
                "Enter the total number of students: ");

        //  Initialize scores and max score.
        double[] scores = new double[countStudent];
        double maxScore = 0;

        //  Retrieved scores for each student.
        for (int student = 0; student < countStudent; student++) {
            double score = getValidDouble(scanner,
                    "Enter score for student " + (student + 1) +
                            ": ");
            scores[student] = score;
            if (score > maxScore) {
                maxScore = score;
            }
        }

        //  Close scanner.
        scanner.close();

        //  Display grades
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < countStudent; i++) {
            char grade = getGrade(scores[i], maxScore);
            System.out.println("Student " + (i + 1) + " - Score: " +
                    scores[i] + " - Grade: " + grade);
        }
    }

    /**
     * Repeatedly prompts the user until a valid integer is entered. Invalid
     * input is discarded.
     *
     * @param scanner  Scanner to retrieve user input.
     * @param msgInput Message to display to the user when prompting for
     *                 input.
     * @return         Validated double.
     */
    public static int getValidInteger(Scanner scanner,
                                      String msgInput) {
        //  Assume input in invalid.
        boolean isValid = false;
        //  Number from user input.
        int inputNumber = 0;
        //  Message to display when there is invalid input.
        String msgInvalid = "Invalid input. Please enter a valid number.";

        //  Repeat until input is flagged as valid.
        while (!isValid) {
            //  Display input message.
            System.out.print(msgInput);
            //  Test to see if user input is double.
            if (scanner.hasNextInt()) {
                //  User input is valid.
                inputNumber = scanner.nextInt();
                scanner.nextLine();
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
     * Repeatedly prompts the user until a valid double is entered. Invalid
     * input is discarded.
     *
     * @param scanner  Scanner to retrieve user input.
     * @param msgInput Message to display to the user when prompting for
     *                 input.
     * @return         Validated double.
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
                scanner.nextLine();
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
     * Determines the grade based on the given score and best score.
     *
     * @param score    The student's score.
     * @param maxScore The highest score among all students.
     * @return         The grade as a character (A, B, C, D, or F).
     */
    private static char getGrade(double score, double maxScore) {
        if (score >= maxScore - 10) {
            return 'A';
        } else if (score >= maxScore - 20) {
            return 'B';
        } else if (score >= maxScore - 30) {
            return 'C';
        } else if (score >= maxScore - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
