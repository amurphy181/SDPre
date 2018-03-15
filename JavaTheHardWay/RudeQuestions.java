import java.util.Scanner;

public class RudeQuestions{
  public static void main(String[] args){

    String name, lastName;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your first name? ");
    name = keyboard.next();

    System.out.print("And your last name? ");
    lastName = keyboard.next();

    System.out.print("Hi, " + name + " " + lastName + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefull that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    // Study Drill Comments
    /* 1. It does not blow up when putting an integer in where it expects a double.
          See previous comments on "ForgetfulMachine" regarding all integers are doubles,
          not all doubles are integers.
       2. Numeric values can be entered where a string is expected; however, no Math
          will be possible with this apparent number.
       3. Having any sort of space ("Alex Murphy" vs. "Alex", or "a lot" when asked
          about weight) will throw off the next line. However, something like "Alex 28"
          will run through the second question successfully. */

  }
}
