package javafundamentals;

public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        int andResult = a & b; // 0001 in binary, which is 1 in decimal
        System.out.println("Bitwise AND: " + andResult);

        // Bitwise OR
        int orResult = a | b; // 0111 in binary, which is 7 in decimal
        System.out.println("Bitwise OR: " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b; // 0110 in binary, which is 6 in decimal
        System.out.println("Bitwise XOR: " + xorResult);

        // Bitwise NOT
        int notResult = ~a; // Inverts bits of a, resulting in -6 (in two's complement)
        System.out.println("Bitwise NOT: " + notResult);
    }
}
