package javafundamentals;

public class InstanceOfOperator {
    public static void main(String[] args) {
        String obj = "Hello, World!";

        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println("The object is a String: " + str);
        } else {
            System.out.println("The object is not a String.");
        }
    }
}
