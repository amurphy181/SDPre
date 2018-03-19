import java.util.Scanner;

public class EnterPIN{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int pin, entry, countPW, countPIN;
    String password, pwAttempt;

    pin = 12345;
    entry = 0;
    password = "crossroads";
    countPW = 0;
    countPIN = 0;

    System.out.println("WELCOME TO THE BANK OF JAVA.");

    System.out.print("ENTER YOUR PASSWORD: ");
    pwAttempt = input.next();

    while (! pwAttempt.equals(password)){
      if (countPW == 4){ // counting to 4 here makes it so that it ends on "1 ATTEMPT REMAINING"
        System.out.println("TOO MANY INCORRECT ATTEMPTS.");
        break;
      } else {
          System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
          countPW++;
          System.out.println((5 - countPW) + " ATTEMPTS REMAINING.");
          System.out.print("ENTER YOUR PASSWORD: ");
          pwAttempt = input.next();
      }
    }

    if (pwAttempt.equals(password)){
      System.out.print("ENTER YOUR PIN: ");
      entry = input.nextInt();
    }

    while ((entry != pin) && pwAttempt.equals(password)){
      if (countPIN == 4){
        System.out.println("TOO MANY INCORRECT PIN ATTEMPTS.");
        break;
      } else {
          System.out.println("\nINCORRECT PIN. TRY AGAIN.");
          countPIN++;
          System.out.println((5 - countPIN) + " ATTEMPTS REMAINING.");
          System.out.print("ENTER YOUR PIN: ");
          entry = input.nextInt();
      }
    }

    if (entry == pin && pwAttempt.equals(password)){
      System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17\n");
    }

  }
}
