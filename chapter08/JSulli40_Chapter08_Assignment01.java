/**
 * Chapter 08, Assignment 01.
 * Write a method that returns the sum of all the elements in a specified
 * column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and displays the sum of
 * each column.
 * ***Look in the book for a sample run.
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-03-16
 */

package chapter08;

/**
 * This code is for chapter 07, assignment 01.
 */
public class JSulli40_Chapter08_Assignment01 {
    /**
     * Main method.
     * Tests out getColumnSums() and sumColumn() using a test matrix.
     *
     * @param args Not implemented.
     */
    public static void main(String[] args) {
        //  Define and initialize matrix.
        double[][] matrixTest = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        //  Display matrix to user.
        System.out.println("\nMatrix to Test");
        for (double[] row : matrixTest) {
            for (double value : row) {
                System.out.printf("%7.2f\t", value);
            }
            System.out.println();
        }

        //  Get column sums of matrix.
        double[] columnSums = getColumnSums(matrixTest);

        //  Display results to user.
        System.out.println("\nColumn Sums");
        for (int column = 0; column < columnSums.length; column++) {
            System.out.printf("%7.2f\t", columnSums[column]);
        }
        System.out.println();
    }

    /**
     * Computes the sum of each column in a given 2D array.
     *
     * @param matrix The array to calculate sums for.
     * @return An array containing the sum of each column.
     */
    public static double[] getColumnSums(double[][] matrix) {
        //  Calculate maximum column count of matrix.
        int numColumns = 0;
        for (double[] row : matrix) {
            if (row.length > numColumns) {
                numColumns = row.length;
            }
        }

        //  Define and initialize column sums.
        double[] columnSums = new double[numColumns];

        //  Calculate column sums.
        for (int column = 0; column < numColumns; column++) {
            columnSums[column] = sumColumn(matrix, column);
        }

        return columnSums;
    }

    /**
     * Computes the sum of a given column in a given 2D array.
     *
     * @param m           The array to calculate sums for.
     * @param columnIndex The index of the column to calculate sums for.
     * @return The sum of all elements in the specified columns.
     */
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;

        for (double[] row : m) {
            if (columnIndex < row.length) {
                sum += row[columnIndex];
            }
        }
        return sum;
    }
}
