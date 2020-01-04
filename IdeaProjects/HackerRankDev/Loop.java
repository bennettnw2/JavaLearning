import java.util.Scanner; 

public class Loop {
    public static void main(String [] args) {

          System.out.println( "Hello Borld!" );
          Scanner input = new Scanner(System.in);

          System.out.print( "Enter integer between 2 and 20: ");
          int N = input.nextInt();

          for(int i = 1; i <= 10; i++) {
              int ans = N * i;
              System.out.println( N + " x " + i + " = " + ans);
          }
    }
} 
