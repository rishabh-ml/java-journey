package javafundamentals;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = -a; // Unary minus operator
        int c = +a; // Unary plus operator

        System.out.println("Value of a: " + a);
        System.out.println("Value of b (unary minus): " + b);
        System.out.println("Value of c (unary plus): " + c);

        boolean isTrue = true;
        boolean isFalse = !isTrue; // Unary NOT operator

        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse (unary NOT): " + isFalse);
    }
}
