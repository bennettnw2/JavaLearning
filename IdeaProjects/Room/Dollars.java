
import java.util.Scanner; 

public class Dollars {

    public static void main(String [] args) {

        int dollarAmt;
        int denomAmt;
        final int DENOM100 = 100;
        final int DENOM20 = 20;
        final int DENOM10 = 10;
        final int DENOM5 = 5;
        final int DENOM1 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a dollar amount: $");
        dollarAmt = input.nextInt();

        denomAmt = dollarAmt / DENOM100;
        dollarAmt = dollarAmt - (DENOM100 * denomAmt);
        System.out.println("You will have " + denomAmt + " $100s");

        denomAmt = dollarAmt / DENOM20;
        dollarAmt = dollarAmt - (DENOM20 * denomAmt);
        System.out.println("You will have " + denomAmt + " $20s");

        denomAmt = dollarAmt / DENOM10;
        dollarAmt = dollarAmt - (DENOM10 * denomAmt);
        System.out.println("You will have " + denomAmt + " $10s");

        denomAmt = dollarAmt / DENOM5;
        dollarAmt = dollarAmt - (DENOM5 * denomAmt);
        System.out.println("You will have " + denomAmt + " $5s");

        denomAmt = dollarAmt / DENOM1;
        dollarAmt = dollarAmt - (DENOM1 * denomAmt);
        System.out.println("You will have " + denomAmt + " $1s");
    }
} 

/* NOTES

   I just wanted to leave a note for myself on how this logic works.

   So you start with the highest denomination find out how many you can get.
   
   Then you subtract the product of the denomination and the amount of the 
   denomination from the total amount of monies.

   In this manner, we are subtrating what we calculated from the total amount
   and what we have left over is what we will use for the next lowest denomination.

   In the program we reuse the variable `dollarAmt` to start each calcuation and to
   keep track of what we have left over after we figure the denominations that we
   can fill in each category.

   We also reuse the same variable `denomAmt` to calucalte the number of denominations
   we are able to use.

*/
