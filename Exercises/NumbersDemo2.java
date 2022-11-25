// NumbersDemo2.java
// Ask user for integers and display the result according to the respective functions.

import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first integer: ");
        a = kb.nextInt();
        System.out.print("Enter second integer: ");
        b = kb.nextInt();
        displayTwiceTheNumber(a);
        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }
    public static void displayTwiceTheNumber(int n)
    {
        final int FACTOR = 2;
        System.out.println("Twice the number of " + n + " is " + (n*FACTOR));
    }

    public static void displayNumberPlusFive(int n)
    {
        final int FACTOR = 5;
        System.out.println("the number of " + n + " plus 5 is " + (n + FACTOR));
    }
    public static void displayNumberSquared(int n)
    {
        System.out.println("the number of " + n + " squared is " + (n*n));
    }
}
