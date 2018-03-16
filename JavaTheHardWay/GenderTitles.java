import java.util.Scanner;
import static java.lang.System.*;

public class GenderTitles{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    String title;

    out.print("First name: ");
    String first = input.next();
    out.print("Last name: ");
    String last = input.next();
    out.print("Gender (M/F): ");
    String gender = input.next();
    out.print("Age: ");
    int age = input.nextInt();

    if (age < 20){
      title = first;
    } else {
      if(gender.equals("F") || gender.equals("f")){ // "or" statement to encompass upper and lower case
        out.print("Are you married, " + first + "? (Y/N): ");
        String married = input.next();
        if (married.equals("Y") || married.equals("y")){
          title = "Mrs.";
        } else {
          title = "Ms.";
        }
      } else {
        title = "Mr.";
      }
    }

    out.println("\n" + title + " " + last);
  }
}
