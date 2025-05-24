package javafundamentals;

public class LogicalOperator {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean hasUmbrella = false;

        // Using logical AND operator
        if (isRaining && hasUmbrella) {
            System.out.println("You can go outside without getting wet.");
        } else {
            System.out.println("You might get wet if you go outside.");
        }

        // Using logical OR operator
        if (isRaining || hasUmbrella) {
            System.out.println("Either it's raining or you have an umbrella.");
        } else {
            System.out.println("It's neither raining nor do you have an umbrella.");
        }

        // Using logical NOT operator
        if (!hasUmbrella) {
            System.out.println("You need to get an umbrella.");
        }
    }
}
