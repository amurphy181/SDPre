import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    double ft, inches, finalInches, m, lbs, kg, bmi;

    System.out.print("Your height (feet only): ");
    ft = keyboard.nextDouble();
    System.out.print("And how many inches: ");
    inches = keyboard.nextDouble();
    finalInches = inches + (ft * 12); // total number of inches
    m = finalInches * 0.0254; // conversion to metric system

    System.out.print("Your weight in pounds: ");
    lbs = keyboard.nextDouble();
    kg = lbs * 0.453592; // second conversion to metric system

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);
    
  }
}
