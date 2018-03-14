public class MathOperations{
  public static void main(String[] args){
    // An exercise to run mathematical operations.

    int a, b, c, d, e, f, g, h;
    double w, x, y, z;
    String one, two, both;

    a = 10;
    b = 27;
    System.out.println("\na is " + a + ", b is " + b);

    c = a + b;
    System.out.println("a + b is " + c);
    d = a - b;
    System.out.println("a - b is " + d);
    e = a + b * 3;
    System.out.println("a + b * 3 is " + e);
    f = b / 2;
    System.out.println("b / 2 is " + f);
    g = b % 10;
    System.out.println("b % 10 is " + g);
    h = (b * 6) - f;
    System.out.println("b * 6 - f is " + h);

    w = 22d / 7d; // added the "d" because it was treating the two as integers
    System.out.println("\n22 / 7 is " + w);
    x = 1.1;
    System.out.println("x is " + x);
    y = x * x;
    System.out.println("x * x is " + y);
    z = b / 2;
    System.out.println("b / 2 is " + z);
    System.out.println();

    one = "dog";
    two = "house";
    both = one + two;
    System.out.println(both + "\n");
  }
}
