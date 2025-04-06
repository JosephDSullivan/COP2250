/**
 * Chapter 10, Assignment 01
 *
 * <p><strong>Triangle</strong> class - Create a class named
 * <strong>Triangle_YourInitials</strong> that extends the class
 * GeometricObject. The class contains:</p>
 * <ol>
 * <li>Three <strong>double</strong> data fields named <strong>side1</strong>,
 * <strong>side2</strong> and <strong>side3</strong> with default
 * values<strong>1.0</strong> to denote three side of a triangle.</li>
 * <li>A no-arg constructor that creates a default triangle.</li>
 * <li>A constructor that creates a triangle with the specified
 * <strong>side1</strong>, <strong>side2</strong> and
 * <strong>side3</strong>.</li>
 * <li>The accessor methods for all three data fields (3 sides).</li>
 * <li>A method named <strong>getPerimeter()</strong> that returns the
 * perimeter of this triangle.</li>
 * <li>A method named <strong>getArea()</strong> that returns 0 (needed to
 * inherit Geometric Object).</li>
 * <li>A method named <strong>toString()</strong> that returns a string
 * description for the triangle.</li>
 * </ol>
 * <p>The <strong>toString()</strong> method is implemented as follows:</p>
 * <p>return <bold>"Triangle: side1 = "</bold> + side1 +
 * <bold>" side2 = "</bold> + side2 + <bold>" side3 = "</bold> + side3;</p>
 * <p>Write a test program (<strong>Yourname_11_1</strong>) that that prompts
 * the user to enter three sides of a triangle and create a
 * <strong>Triangle_YourInitials</strong> object with these three sides. The
 * program should then prompt the user for a color and a Boolean value to
 * indicate whether the triangle is filled and set the <strong>color</strong>
 * and <strong>filled</strong> properties using the input. Then the program
 * should display the perimeter, color, true or false to indicate whether
 * filled or not and the triangle information (use toString for this).<p>
 * <p>GeometricObject.java - this is the GeometricObject class code. You will
 * need to copy this into your Eclipse src folder.</p>
 * <p>***These should be two separate classes in the same file with their own
 * set of braces. And please follow the naming standard we have done up to
 * now. Refer to the assignment checklist for this.</p>
 */

package chapter11;

import java.util.Scanner;

/**
 * Class to store triangle.
 */
class Triangle_JDS extends GeometricObject {
    //  Default side length of triangle.
    public static final double DEFAULT_SIDE_LENGTH = 1.0;

    //  This triangle's side lengths.
    private double side1;
    private double side2;
    private double side3;

    /**
     * No-argument constructor; all sides default to DEFAULT_SIDE_LENGTH.
     */
    Triangle_JDS() {
        this(DEFAULT_SIDE_LENGTH, DEFAULT_SIDE_LENGTH, DEFAULT_SIDE_LENGTH);
    }

    /**
     * Constructor with specific side lengths.
     *
     * @param side1 Length of side 1.
     * @param side2 Length of side 2.
     * @param side3 Length of side 3.
     */
    Triangle_JDS(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Return side 1.
     *
     * @return Length of side 1.
     */
    public double getSide1() {
        return side1;
    }

    /**
     * Return side 21.
     *
     * @return Length of side 2.
     */
    public double getSide2() {
        return side2;
    }

    /**
     * Return side 3.
     *
     * @return Length of side 3.
     */
    public double getSide3() {
        return side3;
    }

    /**
     * Return perimeter of triangle.
     *
     * @return Perimeter of triangle.
     */
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Return area of triangle.
     * Not implemented. Return 0 per instructions.
     *
     * @return Area of the triangle.
     */
    @Override
    public double getArea() {
        // Calculate area using heron's formula.
        //double semi = (side1 + side2 + side3) / 2.0;
        //double area = Math.sqrt(semi * (semi - side1) * (semi - side2) *
        //        (semi - side3));
        //return area;
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("\n");
        info.append(this.getClass().getName());
        info.append("\n");
        info.append("-".repeat(41));
        info.append("\n");
        info.append(String.format("%-30s %-10s\n", "Property", "Value"));
        info.append("-".repeat(41));
        info.append("\n");
        info.append(String.format("%-30s %-10.2f\n", "Side 1", getSide1()));
        info.append(String.format("%-30s %-10.2f\n", "Side 2", getSide2()));
        info.append(String.format("%-30s %-10.2f\n", "Side 3", getSide3()));
        info.append(String.format("%-30s %-10.2f\n", "Perimeter",
                getPerimeter()));
        info.append(String.format("%-30s %-10.2f\n", "Area",
                getArea()));
        info.append(String.format("%-30s %-10s\n", "Color", getColor()));
        info.append(String.format("%-30s %-10b\n", "Filled", isFilled()));
        info.append("-".repeat(41));
        info.append("\n");
        return info.toString();
    }
}

/**
 * Test class for Triangle_JDS.
 */
public class JSulli40_Chapter11_Assignment01 {
    /**
     * Main method.
     */
    public static void main(String[] args) {
        //  Create Scanner for input.
        Scanner input = new Scanner(System.in);

        //  Retrieve side lengths from user.
        System.out.printf("%-30s ", "Enter Side 1:");
        double inputSide1 = input.nextDouble();
        input.nextLine();

        System.out.printf("%-30s ", "Enter Side 2:");
        double inputSide2 = input.nextDouble();
        input.nextLine();

        System.out.printf("%-30s ", "Enter Side 3:");
        double inputSide3 = input.nextDouble();
        input.nextLine();

        //  Create triangle object.
        Triangle_JDS triangle = new Triangle_JDS(inputSide1, inputSide2,
                inputSide3);

        //  Retrieve and set triangle color.
        System.out.printf("%-30s ", "Enter Color:");
        String inputColor = input.nextLine();
        triangle.setColor(inputColor);

        //  Retrieve and set triangle isFilled.
        System.out.printf("%-30s ", "Is filled? (true/false):");
        boolean inputIsFilled = input.nextBoolean();
        triangle.setFilled(inputIsFilled);

        //  Close Scanner.
        input.close();

        //  Display results.
        System.out.println(triangle);
    }
}
