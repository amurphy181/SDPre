import java.util.Scanner;

public class Objective7Lab3{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      selection = input.nextInt();

      if(selection == 1){
        System.out.println("Hello Human\n");
      } else if(selection == 2){
        System.out.println("Apples, Bananas, Coconuts\n");
      } else if(selection == 3){
        System.out.println("Goodbye\n");
        break;
      } else {
        System.out.println("Unrecognized input\n");

      }
    }

  }

  public static void printMenu(){

    System.out.println("____Menu____");
    System.out.println("1: Say Hello");
    System.out.println("2: List my favorite foods");
    System.out.println("3: Exit");
    System.out.println();

  }
}
