package javafundamentals;

public class AllVariableScope {
    // Instance Variable (belongs to each object)
    private int instanceVar = 10;

    // Static Variable (shared among all instances)
    static int staticVar = 100;

    // Constructor demonstrating parameter scope
    public AllVariableScope(int instanceVar) {

        // Parameter Scope
        // using 'this' to refer to instance variable
        this.instanceVar = instanceVar;
    }

    // Method to demonstrate local, parameter, and block scope
    public void showScopes(int paramVar) {

        // Local Variable
        // only accessible in this method
        int localVar = 20;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Method Parameter: " + paramVar);
        System.out.println("Local Variable: " + localVar);

        // Block Scope (variable only accessible inside this block)
        if (localVar > 10) {
            int blockVar = 5;
            System.out.println("Block Variable: " + blockVar);
        }

        // Uncommenting below line would cause an error: blockVar out of scope
        // System.out.println(blockVar);
    }

    public static void main(String[] args) {
        AllVariableScope obj = new AllVariableScope(50);
        obj.showScopes(30);
    }
}
