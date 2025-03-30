package chapter09;

public class AlternativeCircle {
    /**
     * Main method.
     */
    public static void main(String[] args) {
        //  Create a circle with radius 1.
        AlternativeCircle Circle1 = new AlternativeCircle();
        System.out.println("The area of the circle of radius " +
                Circle1.radius + " is " + Circle1.getArea());

        //  Create a circle with radius 25.
        AlternativeCircle Circle2 = new AlternativeCircle(25);
        System.out.println("The area of the circle of radius " +
                Circle2.radius + " is " + Circle2.getArea());

        //  Create a circle with radius 125.
        AlternativeCircle Circle3 = new AlternativeCircle(125);
        System.out.println("The area of the circle of radius " +
                Circle3.radius + " is " + Circle3.getArea());

        //  Modify circle radius.
        Circle2.radius = 100;
        System.out.println("The area of the circle of radius " +
                Circle2.radius + " is " + Circle2.getArea());
    }

    double radius;

    /**
     * Construct a circle with radius 1.
     */
    AlternativeCircle() {
        radius = 1;
    }

    /**
     * Construct a circle with a specified radius.
     */
    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    /**
     * Return the area of this circle.
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return the perimeter of this circle.
     */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Set a new radius for this circle.
     */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
