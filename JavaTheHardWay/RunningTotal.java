import java.util.Scanner;

public class RunningTotal{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int current, total = 0;
    // boolean begin = true;

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero.");

    /*
    while(begin){
      System.out.print("Value: ");
      current = input.nextInt();

      if(current == 0){
        begin = false;
      } else {
        total += current;
        System.out.println("The total so far is: " + total);
      }
    } */

    do{
      System.out.print("Value: ");
      current = input.nextInt();
      total += current;
      if(current != 0){
        System.out.println("The total so far is: " + total);
      } else {
        System.out.println("The final total is: " + total);
      }

    } while (current != 0);

    // System.out.println("The final total is: " + total);
    // removed this in order to tidy up the loop structure and remove redundancy
  }
}
