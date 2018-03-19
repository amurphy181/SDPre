public class RandomNumbers{
  public static void main(String[] args){

    int a, b, c, d;
    double r, rps;

    rps = Math.random();
    if (rps < 0.333333){
      System.out.println("Rock");
    } else if (rps < 0.666666) {
      System.out.println("Paper");
    } else {
      System.out.println("Scissors");
    }

    // four random integers, each between 1 and 10
    a = 1 + (int)(10 * Math.random());
    b = 1 + (int)(10 * Math.random());
    c = 1 + (int)(10 * Math.random());
    d = 1 + (int)(10 * Math.random());
    System.out.println("1-10:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    // four random integers, each between 1 and 6
    a = 1 + (int)(6 * Math.random());
    b = 1 + (int)(6 * Math.random());
    c = 1 + (int)(6 * Math.random());
    d = 1 + (int)(6 * Math.random());
    System.out.println("1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    // and now, a single random integer between 1 and 100
    a = 1 + (int)(100 * Math.random());
    System.out.println("1-100:\t" + a + "\t" + a + "\t" + a + "\t" + a);

    // four random integers between 1 and 100
    a = 1 + (int)(100 * Math.random());
    b = 1 + (int)(100 * Math.random());
    c = 1 + (int)(100 * Math.random());
    d = 1 + (int)(100 * Math.random());
    System.out.println("1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    // four random integers between 0 and 99
    a = (int)(100 * Math.random());
    b = (int)(100 * Math.random());
    c = (int)(100 * Math.random());
    d = (int)(100 * Math.random());
    System.out.println("0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    // four random integers between 10 and 20
    a = 10 + (int)(11 * Math.random()); // fence post problem - multiply by 11 to include 20
    b = 10 + (int)(11 * Math.random());
    c = 10 + (int)(11 * Math.random());
    d = 10 + (int)(11 * Math.random());
    System.out.println("10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d);

    // four random doubles between 0 and 1
    System.out.println("0-1:\t" + Math.random() + "\t" + Math.random());
    System.out.println("0-1:\t" + Math.random() + "\t" + Math.random());

    // random changed into an integers
    r = 10 * Math.random();
    System.out.println("0-9.99:\t" + r);
    System.out.println("0-9:\t" + (int)r);
    System.out.println("1-10:\t" + (1 + (int)r));

    /* Study drills! Adding code to pick three random ints from 1-3, print to screen.
       Add more to pick three random integers from 5 to 10 and display them. Run repeatedly to
       confirm. */

    a = 1 + (int)(3 * Math.random());
    b = 1 + (int)(3 * Math.random());
    c = 1 + (int)(3 * Math.random());
    System.out.println("1-3:\t" + a + "\t" + b + "\t" + c);

    a = 5 + (int)(6 * Math.random());
    b = 5 + (int)(6 * Math.random());
    c = 5 + (int)(6 * Math.random());
    System.out.println("5-10:\t" + a + "\t" + b + "\t" + c);

  }
}
