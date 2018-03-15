import java.util.Scanner;

public class Objective3Lab3{
  public static void main(String[] args){

    int birthYear, age, currentYear;
    String birthday;

    Scanner input = new Scanner(System.in);

    birthYear = 0;
    currentYear = 2018;

    System.out.println("How old are you?");
    age = input.nextInt();

    System.out.println("Have you had a birthday this year?");
    birthday = input.next();

    input.close();

    /* Tried this next bit originally with "if (birthday == "yes")" etc., but found that
       it did not work! Went on stack overflow where someone had helpfully cleared up the way
       to test for string matches. */
       
    if (birthday.equals("Yes") || birthday.equals("yes") || birthday.equals("Y") || birthday.equals("y")){
      birthYear = currentYear - age;
      System.out.println("You were born in " + birthYear);
    } else if (birthday.equals("No") || birthday.equals("no") || birthday.equals("N") || birthday.equals("n")){
      birthYear = currentYear - age - 1;
      System.out.println("You were born in " + birthYear);
    } else {
      System.out.println("So you don't have birthdays?");
    }

  }
}
