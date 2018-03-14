public class CreatingVariables{
  public static void main(String[] args){

    int x, y, age, realAge;
    double seconds, e, checking, pi;
    String firstName, lastName, title, realFirstName, realLastName;

    x = 10;
    y = 400;
    age = 39;
    realAge = 28;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    pi = 3.14159265359;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    realFirstName = "Alex";
    realLastName = "Murphy";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("A more appropriate # for today is an approximation of pi: " + pi);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name is " + title + " " + firstName + lastName);
    System.out.println("But my nom de guerre is " + realFirstName + " " + realLastName + ".");
    System.out.println("Presently I am " + realAge + ", but in 11 years I will be " + age + ".");

  }
}
