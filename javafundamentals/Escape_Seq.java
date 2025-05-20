package javafundamentals;

public class Escape_Seq {
    public static void main(String[] args) {
        System.out.println("Different Ways of using backslash n:");
        System.out.println("1. The use backslash n along with the message");
        System.out.println("Name: Akash Mittal\n"+"Age: 16 yrs\n"+"Class: X");
        int a=14, b=26;
        System.out.println("2. The use of backslash n seprated by '+'");
        System.out.println("First number ="+a+"\nSecond number ="+b+"\n"+"Sum ="+(a+b));
        System.out.println("Different ways of using backslash t:");
        System.out.println("1. The use of backslash t along with the message");
        System.out.println("Name:\tAkash Mittal\tAge:\t16 yrs\tClass:\tX");
        System.out.println("2. The use of backslash t seprated by '+' and within double qoutes");
        System.out.println("Name: Akash Mittal"+"\t"+"Age:\t"+" 16\t"+"years");
    }
}
