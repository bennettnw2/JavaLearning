import java.util.Scanner; 

public class IfElse {

    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        System.out.println("Your number is " + N);
        int isOdd = (N % 2);

        if (isOdd == 1)
            System.out.println("Weird");
        else
          if ((N >= 2) && (N <= 5))
            System.out.println("Not Weird");
        else
          if ((N >= 6) && (N <= 20))
            System.out.println("Weird");
        else
          System.out.println("Not Weird");
    }
} 
