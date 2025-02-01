package chapter02;

import java.util.Scanner;

public class ComputerAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;  //  Declare a constant.

        //  Create a Scanner object.
        Scanner input = new Scanner(System.in);

        //  Prompt the user to enter a radius.
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        //  Compute area.
        double area = radius * radius * PI;

        //  Display the result.
        System.out.println("The are for the circle of radius " + radius +
                " is " + area);
    }
}