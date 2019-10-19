import java.util.Scanner;

public class Fees {
    public static void main(String [] args) {
    
        int creditHrs;
        int booksCost;
        int perCreditCost = 85;
        int athleticFee = 65;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your credit hours: ");
        creditHrs = input.nextInt();
        System.out.print("Please enter the total cost of your books: ");
        booksCost = input.nextInt();
        System.out.println( );

        int totalCreditCost = creditHrs * perCreditCost;
        int grandTotal = totalCreditCost + booksCost + athleticFee;

        System.out.println("At $85 per credit, your total credit cost is: $" + totalCreditCost );
        System.out.println("Your total book fees are $" + booksCost );
        System.out.println("Your athletic fee is $" + athleticFee );
        System.out.println("Your total fees for this semester are $" + grandTotal );




    }
} 
