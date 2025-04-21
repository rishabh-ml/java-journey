package javafundamentals;

import java.util.Scanner;

public class SumofTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstInteger = sc.nextInt();
        System.out.print("Enter second integer: ");
        int secondInteger = sc.nextInt();
        int sum = firstInteger + secondInteger;
        System.out.println("\nSum of " + firstInteger + " and " + secondInteger + " is: " + sum);
        sc.close();
    }
}
