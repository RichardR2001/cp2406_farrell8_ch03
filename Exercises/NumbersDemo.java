// NumberDemo.java
// Display number based on the function

public class NumbersDemo
{
    public static void main(String[] args)
    {
        int a = 2, b = 5;
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
