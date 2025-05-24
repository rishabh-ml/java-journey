package javafundamentals;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;

        System.out.println("The maximum number is: " + max);
    }
}
