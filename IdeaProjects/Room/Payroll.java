import java.util.Scanner;

public class Payroll {
  
    public static void main(String [] args) {

       double hrlyRate;
       double numHrs;
       final double TAX_RATE = .15;
       Scanner input = new Scanner(System.in);

       System.out.print("Please enter hourly rate: $");
       hrlyRate = input.nextDouble();
       System.out.print("Please enter amount of hours worked: ");
       numHrs = input.nextDouble();

       double grossPay = hrlyRate * numHrs;
       double taxAmt = grossPay * TAX_RATE;
       double netPay = grossPay - taxAmt;

       System.out.println("Your total gross pay is $" + grossPay );
       System.out.println("You will be taxed $" + taxAmt );
       System.out.println("Your resulting net pay is $" + netPay );

    }
} 
