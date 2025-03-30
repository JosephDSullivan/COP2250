/**
 * Chapter 10, Assignment 03
 *
 * <p>MyInteger class - Create a class named MyInteger_YourInitials. The class
 * contains:</p>
 * <ol>
 * <li>An int data field named value that stores the int value represented by
 * this object.</li>
 * <li>A getter method that returns the int value.</li>
 * <li>A constructor that creates a MyInteger_YourInitials object for the
 * specified int value.</li>
 * <li>The methods isEven() and isOdd() that return true if the value in this
 * object is even or odd, respectively.</li>
 * <li>The static methods isEven(int) and isOdd(int) that return true if the
 * value in this object is even or odd, respectively.</li>
 * <li>The static methods isEven(MyInteger_YourInitials) and
 * isOdd(MyInteger_YourInitials) that return true if the value in this object
 * is even or odd, respectively. (The parameters for these methods pass in an
 * instance of the MyInteger_YourInitials class).</li>
 * <li>The methods equals(int) and equals(MyInteger_YourInitials) that return
 * true if the value in this object is equal to the specified value.</li>
 * </ol>
 * <p>Write a test program (separate class) that tests all the methods in the
 * MyInteger class. You can prompt the user for numbers or you can hardcode
 * the numbers.</p>
 * <p>***These should be two separate classes in the same file with their own
 * set of braces. And please follow the naming standard we have done up to
 * now. Refer to the assignment checklist for this.</p>
 */

package chapter10;

/**
 * Class to store integer, determine even/odd, and determine equality.
 */
class MyInteger_JDS {
    /**
     * This integer value.
     */
    private int value;

    /**
     * Constructor which initializes this with a default value of zero.
     */
    public MyInteger_JDS() {
        value = 0;
    }

    /**
     * Constructor which initializes this with a specific value.
     *
     * @param value The specific value.
     */
    public MyInteger_JDS(int value) {
        this.value = value;
    }

    /**
     * Getter method for integer value.
     *
     * @return This integer value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Setter method for integer value.
     *
     * @param value New integer value to set this to.
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Checks whether this integer is even.
     *
     * @return true if even, false otherwise.
     */
    public boolean isEven() {
        return value % 2 == 0;
    }

    /**
     * Checks whether this integer is odd.
     *
     * @return true if odd, false otherwise.
     */
    public boolean isOdd() {
        return value % 2 != 0;
    }

    /**
     * Checks whether a specified integer is even.
     *
     * @param value The specific integer.
     * @return true if even, false otherwise.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * Checks whether a specified integer is odd.
     *
     * @param value Specified integer.
     * @return true if odd, false otherwise.
     */
    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    /**
     * Checks whether a myInteger_JDS integer is even.
     *
     * @param myInteger myInteger_JDS integer.
     * @return true if even, false otherwise.
     */
    public static boolean isEven(MyInteger_JDS myInteger) {
        return myInteger.getValue() % 2 == 0;
    }

    /**
     * Checks whether a myInteger_JDS integer is odd.
     *
     * @param myInteger myInteger_JDS integer.
     * @return true if odd, false otherwise.
     */
    public static boolean isOdd(MyInteger_JDS myInteger) {
        return myInteger.getValue() % 2 != 0;
    }

    /**
     * Checks whether this integer is equal to a specified integer.
     *
     * @param value Specified integer.
     * @return true if this integer is equal to specified integer. false
     * otherwise.
     */
    public boolean equals(int value) {
        return this.value == value;
    }

    /**
     * Checks whether this integer is equal to a myInteger_JDS integer.
     *
     * @param myInteger myInteger_JDS integer.
     * @return true if this integer is equal to myInteger_JDS integer. false
     * otherwise.
     */
    public boolean equals(MyInteger_JDS myInteger) {
        return this.value == myInteger.getValue();
    }
}

/**
 * Test MyInteger_JDS.
 */
public class JSulli40_Chapter10_Assignment03 {
    /**
     * Main method.
     */
    public static void main(String[] args) {
        //  Create int1 with default value.
        MyInteger_JDS int1 = new MyInteger_JDS();
        //  Create int2 with value of -10.
        MyInteger_JDS int2 = new MyInteger_JDS(-10);

        //  Change int2 to a value of 7.
        int2.setValue(7);

        //  Display results about int1.
        System.out.println("\nint1 - Expected value of 0");
        System.out.println("\tValue:\t\t\t" + int1.getValue());
        System.out.println("\tEven:\t\t\t" + int1.isEven());
        System.out.println("\tOdd:\t\t\t" + int1.isOdd());
        System.out.println("\t== int2:\t\t" + int1.equals(int2));
        System.out.println("\t== 7:\t\t\t" + int1.equals(7));

        //  Display results about int2.
        System.out.println("\nint2 - Expected value of 7");
        System.out.println("\tValue:\t\t\t" + int2.getValue());
        System.out.println("\tEven:\t\t\t" + int2.isEven());
        System.out.println("\tOdd:\t\t\t" + int2.isOdd());
        System.out.println("\t== int1:\t\t" + int2.equals(int1));
        System.out.println("\t== 7:\t\t\t" + int2.equals(7));

        //  Display other static method results.
        System.out.println("\nOther Static Methods");
        System.out.println("\tint1 is Even:\t" + MyInteger_JDS.isEven(int1));
        System.out.println("\t9 is Even:\t\t" +
                MyInteger_JDS.isEven(9));
        System.out.println("\tint1 is Odd:\t" + MyInteger_JDS.isOdd(int1));
        System.out.println("\t9 is Odd:\t\t" + MyInteger_JDS.isOdd(9));
    }
}
