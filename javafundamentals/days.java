package javafundamentals;
/* Write a program in Java to accept the number of days and display the result after converting it into number of years,
number of months and the remaining number of days.
 */
public class days {
    public static void main(String[] args) {
        int a=500, b, y, m, d;
        y=a/365;
        b=a%365;
        m=b/30;
        d=b%30;
        System.out.println("The number of years ="+y);
        System.out.println("The number of months ="+m);
        System.out.println("The number of days ="+d);
    }
}
