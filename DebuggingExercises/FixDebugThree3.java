// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class FixDebugThree3
{
   public static void main(String[] args)
   {
      String name;
      name = getName();
      displayGreeting(name);           
   }
   public static String getName()      // this function ask for input and return it in the main function
                                       // there is no void as it will return the output (name)
   {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name: ");
      name = input.nextLine();
      return name;
   }
   public static void displayGreeting(String name)    // this function will display the name based on the input
   {
      System.out.println("Hello, " + name + "!");
   }
}
