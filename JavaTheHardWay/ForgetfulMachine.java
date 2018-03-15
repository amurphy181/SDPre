import java.util.Scanner;

public class ForgetfulMachine{
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital of France?");
    keyboard.next();

    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();
    /* This can be successfully blown up in a couple of ways:
    First, having a space in the first answer (like "Old Paris") seems to throw off
    the scanner, making it think that "Paris" was the integer.
    This also occurs when writing out "forty two" instead of "42". */

    System.out.println("Enter a number between 0.0 and 1.0.");
    keyboard.nextDouble();
    /* Using a string here is a pretty solid way to stop the program in its tracks.
    It will accept an integer (all integers can be doubles, not all doubles can be
    integers) but no text. */

    System.out.println("Is there anything else you would like to say?");
    keyboard.next();

  }
}
