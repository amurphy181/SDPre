import java.util.Scanner;

public class Objective3Lab5{
  public static void main(String[] args){

    double num1, num2, sum;

    Scanner input = new Scanner(System.in);

    // used "print" rather than "println" in order to tidy up the result and have them on one line each.
    System.out.print("Please enter a number: ");
    num1 = input.nextDouble();

    System.out.print("Please enter another number: ");
    num2 = input.nextDouble();

    input.close();

    sum = num1 + num2;

    System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);

  }
}
