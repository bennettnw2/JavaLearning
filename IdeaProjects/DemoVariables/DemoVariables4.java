import java.util.Scanner; 

public class DemoVariables4 {

  public static void main(String [] args) {

    System.out.println(                );
    System.out.println( "************" );
    System.out.println( "Hello Borld!" );
    System.out.println( "************" );

    int entry;
    int anotherEntry;
    Scanner keyBoard = new Scanner(System.in); 

    System.out.print("Enter an integer: " );
    entry = keyBoard.nextInt();
    System.out.print("Enter another integer: ");
    anotherEntry = keyBoard.nextInt();

    System.out.print("The entry is: ");
    System.out.println( entry );
    System.out.print("The other entry is: ");
    System.out.println( anotherEntry );

    System.out.println( entry + " plus " + anotherEntry + " equals " +
                       entry + anotherEntry );
    System.out.println( entry + " minus " + anotherEntry + " equals " +
                      ( entry - anotherEntry ));
    System.out.println( entry + " times " + anotherEntry + " equals " +
                      ( entry * anotherEntry ));
    System.out.println( entry + " divided by " + anotherEntry + " equals " +
                      ( entry / anotherEntry ));
    System.out.println( entry + " modulo " + anotherEntry + " equals " +
                      ( entry % anotherEntry ));

  }

} 
