import java.util.Scanner;

public class HighLow{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int secret, guess, count;

    // count starting at 1 rather than 0 - this allows it to be at 1 after first guess, before loop
    count = 1;

    secret = 1 + (int)(100 * Math.random());

    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("Try to guess it!");
    System.out.print("> ");
    guess = input.nextInt();

    while (secret != guess){
      if (guess < secret){
        System.out.print("Sorry, your guess is too low.");
      }
      if (guess > secret){
        System.out.print("Sorry, your guess is too high. ");
      }
      count++;
      System.out.print("Try again. \n> ");
      guess = input.nextInt();
    }

    System.out.println("You guessed it in " + count + " tries! What are the odds of that?!?");

  }
}
