import java.util.Scanner;

public class Objective6Lab5{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int selection;

    while(true){
      System.out.println("\n_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List my favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = input.nextInt();
      System.out.println();

      if(selection == 1){
        System.out.println("Hello Human");
      } else if (selection == 2){
        System.out.println("Apples, Bananas, Coconuts");
      } else if (selection == 3){
        System.out.println("Goodbye\n");
        break;
      }
    }

    input.close();

  }
}
