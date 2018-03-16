import java.util.Scanner;

public class Objective4Lab3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int userNum;

    System.out.print("Please enter a number: "); // used "print" instead of "println" to keep on same line
    userNum = input.nextInt();

    if (userNum == 0){
      System.out.println("The number is 0.");
    } else if (userNum < 0){
      System.out.println("The number is negative.");
    } else {
      System.out.println("The number is positive.");
    }
    
  }
}
