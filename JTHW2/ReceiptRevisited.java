import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReceiptRevisited{
  public static void main(String[] args) throws Exception{

    Scanner input = new Scanner(System.in);
    PrintWriter fileout;
    double gallons, total;

    try{
      fileout = new PrintWriter("receipt.txt");
    }
    catch(IOException err){
      System.out.println("Sorry, I can't open 'receipt.txt' for writing");
      System.out.println("Maybe the file exists and is read-only?");
      fileout = null;
      System.exit(1);
    }

    System.out.println("Gas is $2.859 per gallon.");
    System.out.print("How many gallons would you like to purchase? ");
    gallons = input.nextDouble();
    total = (gallons * 2.859);
    System.out.println("Total cost: " + total);
    System.out.println("\nWriting customized receipt to 'receipt.txt'...done.");

    fileout.println("|                         ");
    fileout.println("|       CORNER STORE      ");
    fileout.println("|                         ");
    fileout.println("|  2018-04-19    16:47    ");
    fileout.println("|                         ");
    fileout.println("|  Gallons:\t\t\t\t" + gallons);
    fileout.println("|  Price/gallon:\t2.859");
    fileout.println("|                         ");
    fileout.println("|  Fuel total:\t" + total);
    fileout.println("|                         ");
    fileout.close();

  }
}
