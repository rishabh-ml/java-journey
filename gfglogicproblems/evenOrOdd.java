// Java program to check whether a number is even or odd
package gfglogicproblems;

// Approach: By Finding the Remainder
public class evenOrOdd {
    public static boolean isEvenremain(int n) {
        return (n%2 == 0);
    }

    // Approach: Using Bitwise AND Operator
    public static boolean isEvenAND(int n) {
        if ((n & 1) == 0)
            return true;
        else
            return false;
    }

    // Approach: Using Bitwise Shift Operator
    public static boolean isEvenShift(int n) {
        if (n == (n >> 1) << 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 101;
        // Approach 1:
        if (isEvenremain(n) == true)
            System.out.println("True");
        else
            System.out.println("False");

        // Approach 2:
        if (isEvenAND(n)==true)
            System.out.println("True");
        else
            System.out.println("False");

        // Approach 3:
        if (isEvenShift(n)==true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}