/**
 * Chapter 09, Assignment 01.
 *
 * <p>Rectangle class - Following the example of the Circle class in Section
 * 9.2, create a class named Rectangle_YourInitials (use your first and last
 * name initial - ex: Rectangle_SM) to represent a rectangle. The class
 * contains:
 * <ol>
 * <li>Two double data fields named width and height that specify the width
 * and height of a rectangle. The default values are 1 for both width and
 * height.</li>
 * <li>A no-arg constructor that creates a default rectangle.</li>
 * <li>A constructor that creates a rectangle with the specified width and
 * height.</li>
 * <li>A method named getArea() that returns the area of this rectangle.</li>
 * <li>A method named getPerimeter() that returns the perimeter.</li>
 * </ol>
 * <p>Write a test program (a separate class with main method) that creates
 * two Rectangle objects - one with width of 4 and height 40, and the other
 * with width 3.5 and height 35.9. Display the width, height, area and
 * perimeter of each rectangle in this order. This class should follow name
 * format of YourName_Chapter#_Assignment# (and also be name of the file).</p>
 * <p>Typically in Java you would only have one class per file, but to make
 * grading easier for me I am asking for more than one class in the file. Make
 * sure each class has its own set of braces. And only one class - your test
 * class - should be public. You can't have two public classes in the
 * file.</p>
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-03-22
 */

package chapter09;

class Rectangle_JDS {
    /**
     * The height and width of this rectangle.
     */
    double height;
    double width;

    /**
     * Constructs a default rectangle, with default height and default width.
     */
    Rectangle_JDS() {
        height = 1.0;
        width = 1.0;
    }

    /**
     * Constructs a rectangle with specified height and specified width.
     */
    Rectangle_JDS(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Returns the area of this rectangle.
     */
    double getArea() {
        return height * width;
    }

    /**
     * Returns the perimeter of this rectangle.
     */
    double getPerimeter() {
        return 2 * (height + width);
    }
}

public class JSulli40_Chapter09_Assignment01 {
    /**
     * Main method. Entry function for when code is invoked directly.
     *
     * <p>Create two Rectangles_JW, rectangle1 (40 x 4) and rectangle2
     * (35.9 x 3.5), and display information about both.</p>
     */
    public static void main(String[] args) {
        //  Create rectangle1 (40 x 4).
        Rectangle_JDS rectangle1 = new Rectangle_JDS(40, 4);
        //  Display information about rectangle1 to user.
        System.out.println("Rectangle 1 (40 x 4):");
        System.out.printf("%-10s %9.2f%n", "Height:", rectangle1.height);
        System.out.printf("%-10s %9.2f%n", "Width:", rectangle1.width);
        System.out.printf("%-10s %9.2f%n", "Area:", rectangle1.getArea());
        System.out.printf("%-10s %9.2f%n", "Perimeter:",
                rectangle1.getPerimeter());
        System.out.println();

        //  Create rectangle2 (35.9 x 3.5).
        Rectangle_JDS rectangle2 = new Rectangle_JDS(35.9, 3.5);
        //  Display information about rectangle2 to user.
        System.out.println("Rectangle 2 (35.9 x 3.5):");
        System.out.printf("%-10s %9.2f%n", "Height:", rectangle2.height);
        System.out.printf("%-10s %9.2f%n", "Width:", rectangle2.width);
        System.out.printf("%-10s %9.2f%n", "Area:", rectangle2.getArea());
        System.out.printf("%-10s %9.2f%n", "Perimeter:",
                rectangle2.getPerimeter());
        System.out.println();
    }
}
