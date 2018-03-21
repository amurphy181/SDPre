import java.util.Scanner;
import static java.lang.System.*;

public class ShapeArea{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    int choice;
    double area = 0;

    out.print("Shape Area Calculator version 0.1");
    out.println(" (c) 2018 LJtHW Sample Output, Inc.");

    do{
      out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-");
      out.println("1) Triangle");
      out.println("2) Circle");
      out.println("3) Rectangle");
      out.println("4) Square");
      out.println("5) Quit");
      out.print("> ");
      choice = input.nextInt();

      if(choice == 1){
        out.print("\nBase: ");
        int b = input.nextInt();
        out.print("Height: ");
        int h = input.nextInt();
        area = computeTriangleArea(b, h);
        out.println("The area is " + area);
      }
      else if(choice == 2){
        out.print("\nRadius: ");
        int radius = input.nextInt();
        area = computeCircleArea(radius);
        out.println("The area is " + area);
      }
      else if(choice == 3){
        out.print("\nLength: ");
        int q = input.nextInt();
        out.print("Width: ");
        int w = input.nextInt();
        out.println("The area is " + computeRectangleArea(q, w));
      }
      else if(choice == 4){
        out.print("\nSide: ");
        int s = input.nextInt();
        out.println("The area is " + computeSquareArea(s));
      }
      else if(choice != 5){
        out.println("ERROR.");
      }
    } while (choice != 5);

  }

  public static double computeTriangleArea(int base, int height){
    double A;
    A = 0.5 * base * height;
    return A;
  }

  public static double computeCircleArea(int radius){
    double A;
    A = Math.PI * radius * radius;
    return A;
  }

  public static int computeRectangleArea(int length, int width){
    return (length * width);
  }

  public static int computeSquareArea(int side){
    return (side * side);
  }

}
