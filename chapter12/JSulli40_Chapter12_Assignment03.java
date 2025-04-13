/**
 * Chapter 12, Assignment 03
 *
 * <p>Write a program that meets the following requirements:</p>
 * <ol><li>Creates an array with 100 randomly chosen integers.</li> *
 * <li>Prompts the user to enter the index of the array, then displays the
 * corresponding element value. If the specified index is out of bounds, use a
 * try/catch to display the message "Out of Bounds."</li></ol>
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-04-13
 */
package chapter12;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JSulli40_Chapter12_Assignment03 {
    //  Size of array to create.
    private static final int ARRAY_SIZE = 100;
    //  Bounds of value populating into array.
    private static final int VAL_LBOUND = 0;
    private static final int VAL_UBOUND = 1000;

    public static void main(String[] args) {
        int[] numbers = new int[ARRAY_SIZE];

        // Fill the array with random integers
        populateArray(numbers);

        // Get user input and attempt to display the element at that index
        displayElement(numbers);
    }

    /**
     * Populates the specified array with random integers between VAL_LBOUND
     * (inclusive) and VAL_UBOUND (exclusive).
     *
     * @param array The array to populate.
     */
    private static void populateArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(VAL_UBOUND - VAL_LBOUND) +
                    VAL_LBOUND;
        }
    }

    /**
     * Prompts the user to enter an index and displays the specified array
     * element. If index is out of bounds, display Out of Bounds.
     *
     * @param array The specified array to retrieve the element from.
     * @throws InputMismatchException         User did not enter an integer.
     * @throws ArrayIndexOutOfBoundsException User entered invalid position.
     */
    private static void displayElement(int[] array)
            throws InputMismatchException, ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an index between 0 and " +
                (array.length - 1) + ": ");

        try {
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + ": " +
                    array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }
}
