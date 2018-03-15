import java.util.Scanner;

public class Objective3Lab4{
  public static void main(String[] args){

    String firstName, lastName;
    int age;

    Scanner input = new Scanner(System.in);

    System.out.println("What is your first name?");
    firstName = input.next();

    System.out.println("What is your last name?");
    lastName = input.next();

    System.out.println("What is your age?");
    age = input.nextInt();

    input.close();

    System.out.println("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);

  }
  
}
