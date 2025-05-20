package javafundamentals;
/* Write a program to input principal, rate and time. Calculate and display the difference between Simple Interest (SI) and
Compound Interest (CI) by using function argument. */
public class Difference {
    public static void main(String[] args) {
        int p=8000, r=10, t=2;
        double si,ci=0, amt, diff=0;
        si = (p * r * t) / 100.0;
        amt = p * Math.pow((1 + r / 100.0), t);
        ci = amt - p;
        diff = ci - si;
        System.out.println("The Compound Interest =Rs."+(float)ci);
        System.out.println("The Simple Interest =Rs."+(float)si);
        System.out.println("The difference between Compound Interest and Simple Interest =Rs."+(float)diff);
    }
}
