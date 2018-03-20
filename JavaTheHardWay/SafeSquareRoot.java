import java.util.Scanner;

public class SafeSquareRoot{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    double x, y;
    String areYou, ayeAye = "aye aye, captain!";
    String butAreYou, ayeAye2 = "AYE AYE, CAPTAIN!";

    System.out.println("\nAre ya ready, kids?!?");
    areYou = input.nextLine();
    areYou = areYou.toLowerCase();

    while (! areYou.equals(ayeAye)){
      System.out.println("I said, are ya ready, kids?!?");
      areYou = input.nextLine();
    }

    System.out.println("\nI CAN'T HEEEAAARRR YOUUU!!");
    butAreYou = input.nextLine();

    while (! butAreYou.equals(ayeAye2)){
      System.out.println("I CAN'T HEEEAAARRR YOUUU!!");
      areYou = input.nextLine();
    }

    System.out.print("\nGive me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please.) ");
    x = input.nextDouble();

    while (x < 0){
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = input.nextDouble();
    }

    input.close();

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);

  }
}
