package javafundamentals;

public class StaticVariables {
    static int staticVar = 10; // Static variable

    public static void main(String[] args) {
        System.out.println("Static Variable: " + staticVar);

        // Accessing static variable from another method
        displayStaticVar();
    }

    public static void displayStaticVar() {
        System.out.println("Accessing Static Variable in Method: " + staticVar);
    }
}
