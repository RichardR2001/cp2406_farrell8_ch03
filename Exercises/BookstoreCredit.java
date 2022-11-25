// BookstoreCredit.java
// Ask user for name and GPA, and return a sentence that shows the student's name and the gpa and the total
// bookstore credit


import java.util.Scanner;
public class BookstoreCredit
{
    public static void main (String[] args)
    {
        String name;
        // grade will be set as double as it contains decimal
        double grade;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        name = input.nextLine();
        System.out.print("Please enter your grade: ");
        grade = input.nextDouble();
        calculateCredit(name, grade);
    }
    public static void calculateCredit(String name, double grade)       // this function will display the amount
                                                                        // of credits available for the student
    {
        double credit;
        // FACTOR is used since it is a constant
        final double FACTOR = 10;
        credit = grade * FACTOR;
        System.out.println("Good day, " + name + ". Your Grade Point Average (GPA) is " + grade + " and the " +
                "total credits you receive is $" + credit);

    }
}

