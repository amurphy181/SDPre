import java.util.Scanner;

public class BMICategories{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    double bmi, ft, inches, finalInches, m, lbs, kg;

    System.out.print("Enter your height (feet only): ");
    ft = input.nextDouble();
    System.out.print("Enter your height (remaining inches): ");
    inches = input.nextDouble();
    finalInches = (ft * 12) + inches;
    m = finalInches * 0.0254;

    System.out.print("Enter your weight in pounds: ");
    lbs = input.nextDouble();
    kg = lbs * 0.453592;

    bmi = kg / (m*m);

    System.out.print("BMI Category: ");

    if (bmi < 15.0){
      System.out.println("very severely underweight");
    } else if (bmi <= 16.0){
      System.out.println("severely underweight");
    } else if (bmi < 18.5){
      System.out.println("underweight");
    } else if (bmi < 25.0){
      System.out.println("normal weight");
    } else if (bmi < 30.0){
      System.out.println("overweight");
    } else if (bmi < 35.0){
      System.out.println("moderately obese");
    } else if (bmi < 40.0){
      System.out.println("severely obese");
    } else {
      System.out.println("very severely/\"morbidly\" obese");
    }

  }
}
