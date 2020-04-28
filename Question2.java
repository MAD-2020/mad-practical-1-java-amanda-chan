import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    
    Scanner in = new Scanner(System.in);
    System.out.print("Enter height (m): ");
    double height = in.nextDouble();
    System.out.println("Height: " + height + " m");
    Scanner w = new Scanner(System.in);
    System.out.print("Enter weight (kg): ");
    double weight = w.nextDouble();
    System.out.println("Weight: " + weight + " kg");
    double bmi = (weight / Math.pow(height, 2));
    double Finalbmi = Math.round(bmi*100.0)/100.0;
    System.out.println("Your BMI is: " + Finalbmi);
  }
}
