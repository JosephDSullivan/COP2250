/**
 * This is code for chapter 01, assignment 01:
 *      Write a program that displays the area and perimeter of a rectangle
 *      with a width of 4.5 and a height of 7.9 using the following formula:
 *      area = width x height
 *      perimeter = 2 x (width + height)
 *
 * @author  Joseph Sullivan
 * @version 1.0
 * @since   2025-01-16
 *
 */
package chapter01;

/**
 * This is a program for calculating and displaying the area and perimeter
 * of a rectangle with a width of 4.5 and a height of 7.9.
 */
public class JDSullivan_Chapter01_Assignment01 {
    /**
     * This is the main method.
     * @param args To be determined
     */
    public static void main(String[] args) {
        float width = 4.5f;
        float height = 7.9f;
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.println("Rectangle width:     " + width);
        System.out.println("Rectangle height:    " + height);
        System.out.println("Rectangle area:      " + area);
        System.out.println("Rectangle perimeter: " + perimeter);
    }
}