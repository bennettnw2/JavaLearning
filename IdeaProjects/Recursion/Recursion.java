/*  So this is a recursive counter?
    It will just define a method that calls itself it will check with an if
    and then call itself if it does not meet the base case.
    
    if

*/

import java.util.Scanner;

public class Recursion {
  
  public static void main(String [] args) {

    Scanner input = new Scanner(System.in);
    System.out.print( "enter a number: " );
    int num = input.nextInt();

    countUp(num);

  }

  public static void countUp(int n) {
    int check = n;
    int start = 1;
    while (start <= n) {
      System.out.print( start + ", ");
      start += 1; 
    }

    System.out.println( );

  } 
}
