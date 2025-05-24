package javafundamentals;

public class InstanceVariables {
    // Instance variables
    int instanceVar1 = 10;
    String instanceVar2 = "Hello";

    // Method to display instance variables
    public void displayInstanceVariables() {
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        obj.displayInstanceVariables();
    }
}
