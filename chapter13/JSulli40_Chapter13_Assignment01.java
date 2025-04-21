/**
 * Chapter 13, Assignment 01
 *
 * <p>Rectangle class - Create a Rectangle_YourInitials class (build upon
 * Chapter 9 assignment) that extends the abstract GeometricObject_JDS class (you
 * should already have this from Chapter 11 assignment).</p>
 * <p>Circle class - use the Circle_YourInitials class (from the book) that
 * extends the abstract GeometricObject_JDS class.</p>
 * <p>Triangle class - use the Triangle_YourInitials class (from assignment
 * 10) and should extend the abstract GeometricObject_JDS class.</p>
 * <p>Write a test program that prompts the user to enter length and width of
 * the rectangle, a color and a Boolean value to indicate whether the
 * rectangle is filled. The program should create a new Rectangle_YourInitials
 * object with the length and width and set the color and filled properties
 * using the input. Do the same with a new Circle_YourInitials object and a
 * new Triangle_YourInitials object. The test program should display the area
 * (for rectangle and circle only), perimeter (for all 3 shapes), color and
 * true or false to indicate whether it is filled or not for the
 * Rectangle_YourInitials, Circle_YourInitials and Triangle_YourInitials.</p>
 * <p>The test program should also create three instances of the
 * GeometricObject_JDS class using the Rectangle_YourInitials, Circle_YourInitials
 * and Triangle_YourInitials and then create a method to compare the areas of
 * the rectangle and circle to see if equal (you will use the
 * GeometricObjects). And create a method to compare the perimeter of all 3
 * shapes (but only comparing two at a time). These methods comparing the area
 * and perimeter may have to be written outside your public static void
 * main{} - test this out to see. Remember public static void main is its own
 * method.</p>
 * <p>Lastly, use try/catch exceptions in your test program where needed.
 * Write good comments as to why you are using a try/catch (from Chapter
 * 12).</p>
 * <p>***These should be four separate classes in the same file with their own
 * set of braces. And please follow the naming standard we have done up to
 * now. Refer to the assignment checklist for this. Example:</p>
 * <p>public class Yourname_chapter#_assignment# (this has the main
 * method)</p>
 * <p>class rectangle_YourInitials</p>
 * <p>class circle_YourInitials</p>
 * <p>class triangle_YourInitials</p>
 * <p>Each of these should have their own set of braces and only the first one
 * can be public. Also, list them in this order in the file. It makes it
 * easier to read the code.</p>
 *
 * @author Joseph D Sullivan
 * @version 1.0
 * @since 2025-04-20
 */

package chapter13;

import java.util.Scanner;

/**
 * Abstract class to store geometric object.
 */
abstract class GeometricObject_JDS
        implements Comparable<GeometricObject_JDS> {
    //  This geometric object's color and filled properties.
    private String color = "white";
    private boolean filled = false;

    /**
     * Default construct.
     */
    protected GeometricObject_JDS() {
    }

    /**
     * Construct a geometric object.
     */
    protected GeometricObject_JDS(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter method for color.
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter method for color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter method for filled. Since filled is boolean, the get method name
     * is isFilled.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter method for filled.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Abstract method findArea.
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * Compare this geometric object with another by using area.
     *
     * @param other The other geometric object to compare with.
     * @return 1 if this object's area is greater, -1 if it is smaller, and 0
     * if equal.
     */
    @Override
    public int compareTo(GeometricObject_JDS other) {
        if (this.getArea() > other.getArea()) {
            return 1;  // This object has a larger area
        } else if (this.getArea() < other.getArea()) {
            return -1;  // This object has a smaller area
        } else {
            return 0;  // Areas are equal
        }
    }
}

/**
 * Class to store circle.
 */
class Circle_JDS extends GeometricObject_JDS {
    //  Default side length of circle.
    public static final double DEFAULT_RADIUS_LENGTH = 1.0;

    //  This circle's radius length.
    private double radius;

    /**
     * No-argument constructor; radius defaults to DEFAULT_RADIUS_LENGTH.
     */
    Circle_JDS() {
        this(DEFAULT_RADIUS_LENGTH);
    }

    /**
     * Constructor with specific side lengths.
     *
     * @param radius Length of radius.
     */
    Circle_JDS(double radius) {
        this.radius = radius;
    }

    /**
     * Return radius.
     *
     * @return Length of radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Return area of circle.
     *
     * @return Area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Return perimeter of circle.
     *
     * @return Perimeter of circle.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
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
        info.append(String.format("%-30s %-10.2f\n", "Radius", getRadius()));
        info.append(String.format("%-30s %-10.2f\n", "Area",
                getArea()));
        info.append(String.format("%-30s %-10.2f\n", "Perimeter",
                getPerimeter()));
        info.append(String.format("%-30s %-10s\n", "Color", getColor()));
        info.append(String.format("%-30s %-10b\n", "Filled", isFilled()));
        info.append("-".repeat(41));
        info.append("\n");
        return info.toString();
    }
}

/**
 * Class to store rectangle.
 */
class Rectangle_JDS extends GeometricObject_JDS {
    //  Default side length of rectangle.
    public static final double DEFAULT_SIDE_LENGTH = 1.0;

    //  This rectangle's sides (height and width) lengths.
    private double height;
    private double width;

    /**
     * No-argument constructor; all sides default to DEFAULT_SIDE_LENGTH.
     */
    Rectangle_JDS() {
        this(DEFAULT_SIDE_LENGTH, DEFAULT_SIDE_LENGTH);
    }

    /**
     * Constructor with specific side lengths.
     *
     * @param height Length of height.
     * @param width  Length of width.
     */
    Rectangle_JDS(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Return height.
     *
     * @return Length of height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Return width.
     *
     * @return Length of width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Return area of rectangle.
     *
     * @return Area of the rectangle.
     */
    @Override
    public double getArea() {
        return height * width;
    }

    /**
     * Return perimeter of rectangle.
     *
     * @return Perimeter of rectangle.
     */
    @Override
    public double getPerimeter() {
        return 2 * height + 2 * width;
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
        info.append(String.format("%-30s %-10.2f\n", "Height", getHeight()));
        info.append(String.format("%-30s %-10.2f\n", "Width", getWidth()));
        info.append(String.format("%-30s %-10.2f\n", "Area",
                getArea()));
        info.append(String.format("%-30s %-10.2f\n", "Perimeter",
                getPerimeter()));
        info.append(String.format("%-30s %-10s\n", "Color", getColor()));
        info.append(String.format("%-30s %-10b\n", "Filled", isFilled()));
        info.append("-".repeat(41));
        info.append("\n");
        return info.toString();
    }
}

/**
 * Class to store triangle.
 */
class Triangle_JDS extends GeometricObject_JDS {
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
     * Return side 2.
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
     * Return area of triangle.
     *
     * @return Area of the triangle.
     */
    @Override
    public double getArea() {
        // Calculate area using heron's formula.
        double semi = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(semi * (semi - side1) * (semi - side2) *
                (semi - side3));
        return area;
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
        info.append(String.format("%-30s %-10.2f\n", "Area",
                getArea()));
        info.append(String.format("%-30s %-10.2f\n", "Perimeter",
                getPerimeter()));
        info.append(String.format("%-30s %-10s\n", "Color", getColor()));
        info.append(String.format("%-30s %-10b\n", "Filled", isFilled()));
        info.append("-".repeat(41));
        info.append("\n");
        return info.toString();
    }
}

/**
 * Class to test geometric objects.
 */
public class JSulli40_Chapter13_Assignment01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Retrieve circle properties from user and create a new circle.
        GeometricObject_JDS circle = null;
        try {
            //  Retrieve properties from user.
            System.out.println("\nEnter circle properties:");
            System.out.printf("%-30s ", "Radius");
            double circleRadius = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("%-30s ", "Color");
            String circleColor = scanner.nextLine();
            System.out.printf("%-30s ", "Is Filled?");
            boolean circleIsFilled = scanner.nextBoolean();
            //  Create a new circle.
            circle = new Circle_JDS(circleRadius);
            //  Set color and filled properties.
            circle.setColor(circleColor);
            circle.setFilled(circleIsFilled);
        } catch (Exception excp) {
            System.out.println("Error: " + excp.getMessage());
        }

        //  Retrieve rectangle properties from user and create a new
        //  rectangle.
        GeometricObject_JDS rectangle = null;
        try {
            //  Retrieve properties from user.
            System.out.println("\nEnter rectangle properties:");
            System.out.printf("%-30s ", "Height");
            double rectangleHeight = scanner.nextDouble();
            System.out.printf("%-30s ", "Width");
            double rectangleWidth = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("%-30s ", "Color");
            String rectangleColor = scanner.nextLine();
            System.out.printf("%-30s ", "Is Filled?");
            boolean rectangleIsFilled = scanner.nextBoolean();
            //  Create a new rectangle.
            rectangle = new Rectangle_JDS(rectangleHeight,
                    rectangleWidth);
            //  Set color and filled properties.
            rectangle.setColor(rectangleColor);
            rectangle.setFilled(rectangleIsFilled);
        } catch (Exception excp) {
            System.out.println("Error: " + excp.getMessage());
        }

        //  Retrieve triangle properties from user and create a new triangle.
        GeometricObject_JDS triangle = null;
        try {
            //  Retrieve properties from user.
            System.out.println("\nEnter triangle properties:");
            System.out.printf("%-30s ", "Side 1");
            double triangleSide1 = scanner.nextDouble();
            System.out.printf("%-30s ", "Side 2");
            double triangleSide2 = scanner.nextDouble();
            System.out.printf("%-30s ", "Side 3");
            double triangleSide3 = scanner.nextDouble();
            scanner.nextLine();
            System.out.printf("%-30s ", "Color");
            String triangleColor = scanner.nextLine();
            System.out.printf("%-30s ", "Is Filled?");
            boolean triangleIsFilled = scanner.nextBoolean();
            //  Create a new triangle.
            triangle = new Triangle_JDS(triangleSide1,
                    triangleSide2, triangleSide3);
            //  Set color and filled properties.
            triangle.setColor(triangleColor);
            triangle.setFilled(triangleIsFilled);
        } catch (Exception excp) {
            System.out.println("Error: " + excp.getMessage());
        } finally {
            scanner.close();
        }

        //  Display results to user.
        System.out.println("\n" + circle);
        System.out.println("\n" + rectangle);
        System.out.println("\n" + triangle);

        System.out.println("\nCompare Circle with Rectangle");
        System.out.printf("\"%-30s %-10s\n", "Area",
                compareAreaText(circle, rectangle));
        System.out.printf("\"%-30s %-10s\n", "Perimeter",
                comparePerimeterText(circle, rectangle));

        System.out.println("\nCompare Rectangle with Triangle");
        System.out.printf("\"%-30s %-10s\n", "Area",
                compareAreaText(rectangle, triangle));
        System.out.printf("\"%-30s %-10s\n", "Perimeter",
                comparePerimeterText(rectangle, triangle));

        System.out.println("\nCompare Triangle with Circle");
        System.out.printf("\"%-30s %-10s\n", "Area",
                compareAreaText(triangle, circle));
        System.out.printf("\"%-30s %-10s\n", "Perimeter",
                comparePerimeterText(triangle, circle));
    }

    public static String compareAreaText(GeometricObject_JDS objectLeft,
                                         GeometricObject_JDS objectRight) {
        String text = "";
        if (objectLeft.compareTo(objectRight) > 0) {
            text = "greater than";
        } else if (objectLeft.compareTo(objectRight) < 0) {
            text = "less than";
        } else {
            text = "equal to";
        }
        return text;
    }

    public static String comparePerimeterText(GeometricObject_JDS objectLeft,
                                              GeometricObject_JDS objectRight) {
        String text = "";
        if (objectLeft.getPerimeter() > objectRight.getPerimeter()) {
            text = "greater than";
        } else if (objectLeft.getPerimeter() < objectRight.getPerimeter()) {
            text = "less than";
        } else {
            text = "equal to";
        }
        return text;
    }
}
