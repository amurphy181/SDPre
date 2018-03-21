import static java.lang.System.*;

public class YachtDice{
  public static void main(String[] args){

    int r1, r2, r3, r4, r5, r6, r7, r8, count = 1;
    boolean allSame;

    do{
      r1 = 1 + (int)(6 * Math.random());
      r2 = 1 + (int)(6 * Math.random());
      r3 = 1 + (int)(6 * Math.random());
      r4 = 1 + (int)(6 * Math.random());
      r5 = 1 + (int)(6 * Math.random());
      r6 = 1 + (int)(6 * Math.random());
      r7 = 1 + (int)(6 * Math.random());
      r8 = 1 + (int)(6 * Math.random());
      out.print("\nYou rolled: " + r1 + " " + r2 + " " + r3);
      out.println(" " + r4 + " " + r5 + " " + r6 + " " + r7 + " " + r8);
      showDice(r1);
      showDice(r2);
      showDice(r3);
      showDice(r4);
      showDice(r5);
      showDice(r6);
      showDice(r7);
      showDice(r8);
      allSame = (r1 == r2 && r2 == r3 && r3 == r4 && r4 == r5 && r5 == r6 && r6 == r7 && r7 == r8);
      count++;
    } while (! allSame);

    out.println("The Yacht! Number of attempts: " + count);
    // took up to 424,321 runs to match 8 dice. All sixes, if you were wondering.

  }

  public static void showDice(int roll){
    out.println("+---+");

    if(roll == 1){
      out.println("|   |");
      out.println("| o |");
      out.println("|   |");
    } else if (roll == 2){
      out.println("|o  |");
      out.println("|   |");
      out.println("|  o|");
    } else if (roll == 3){
      out.println("|o  |");
      out.println("| o |");
      out.println("|  o|");
    } else if (roll == 4){
      out.println("|o o|");
      out.println("|   |");
      out.println("|o o|");
    } else if (roll == 5){
      out.println("|o o|");
      out.println("| o |");
      out.println("|o o|");
    } else if (roll == 6){
      out.println("|o o|");
      out.println("|o o|");
      out.println("|o o|");
    }

    out.println("+---+");
  }
}
