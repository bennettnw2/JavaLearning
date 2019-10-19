import java.util.Scanner;

public class Recursion2 {
  public static void main(String [] args) {

    Scanner input = new Scanner(System.in);

    System.out.println( "Enter first number" );
    int x = input.nextInt();
    System.out.println( "Enter second number" );
    int y = input.nextInt();
    addTwoNumbers(x,y);

  }

  public static int addTwoNumbers(int x, int y) {
    System.out.println( "x is " + x + " and y is " + y);

    while (x != 0) {
      addTwoNumbers(x -= 1, y += 1);
      return x;
    }

    return x;
  }

}
