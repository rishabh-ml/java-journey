package javafundamentals;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your Favourite Programming Language: ");
        String language = scan.nextLine();
        System.out.println(name + " loves " + language);
        scan.close();
    }
}
