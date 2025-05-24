package javafundamentals;

public class LocalVariables {
    public static void main(String[] args) {
        // Local variable declaration
        int number = 10;
        String message = "Hello, World!";

        // Using local variables
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);

        // Modifying local variables
        number += 5;
        message = "Updated Message";

        System.out.println("Updated Number: " + number);
        System.out.println("Updated Message: " + message);
    }
}
