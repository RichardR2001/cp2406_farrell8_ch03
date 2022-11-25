// BookstoreCredit.java
// Ask user for name and GPA, and return a sentence that shows the student's name and the gpa and the total
// bookstore credit


import java.util.Scanner;
public class BookstoreCredit
{
    public static void main (String[] args)
    {
        String name;
        double grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        name = input.nextLine();
        System.out.print("Please enter your grade: ");
        grade = input.nextDouble();
        calculateCredit(name, grade);
    }
    public static void calculateCredit(String name, double grade)
    {
        double credit;
        final double FACTOR = 10;
        credit = grade * FACTOR;
        System.out.println("Good day, " + name + ". Your Grade Point Average (GPA) is " + grade + " and the " +
                "total credits you receive is $" + credit);

    }
}

