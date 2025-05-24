package javafundamentals;

public class ShiftOperator {
    public static void main(String[] args) {
        int a = 8; // 0000 1000 in binary
        int b = 2; // 0000 0010 in binary

        // Left shift operator
        int leftShiftResult = a << b; // 0010 0000 in binary, which is 32 in decimal
        System.out.println("Left Shift Result: " + leftShiftResult);

        // Right shift operator
        int rightShiftResult = a >> b; // 0000 0010 in binary, which is 2 in decimal
        System.out.println("Right Shift Result: " + rightShiftResult);
    }
}
