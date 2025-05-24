package javafundamentals;

public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        String name = "Alice";

        System.out.println(greeting);
        System.out.println("Name: " + name);

        // Concatenation
        String message = greeting + " My name is " + name + ".";
        System.out.println(message);

        // Length of a string
        System.out.println("Length of greeting: " + greeting.length());

        // Accessing characters
        char firstChar = greeting.charAt(0);
        System.out.println("First character of greeting: " + firstChar);
    }
}
