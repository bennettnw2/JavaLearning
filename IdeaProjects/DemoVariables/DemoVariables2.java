import java.util.Scanner; 

public class DemoVariables2 {

  public static void main(String [] args) {

    System.out.println( "Hello Borld!" );
    System.out.println( "************" );
    int entry;
    Scanner keyBoard = new Scanner(System.in); 
    System.out.print("Enter an integer: " );
    entry = keyBoard.nextInt();
    System.out.println( entry );

  }

} 
