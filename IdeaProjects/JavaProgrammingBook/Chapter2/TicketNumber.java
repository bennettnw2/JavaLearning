/*
Name: TicketNumber.java
Desc: Travel Tickets Company sells tickets for airlines, tours, and other travel-related services. 
      Because ticket agents frequently mistype long ticket numbers, Travel Tickets has asked you to 
      write an application that indicates invalid ticket number entries. The class prompts a ticket 
      agent to enter a six-digit ticket number. Ticket numbers are designed so that if you drop the 
      last digit of the number, then divide the number by 7, the remainder of the division will 
      be identical to the last dropped digit.
Author: Nygel Bennett
Date: Oct 19 2019
*/

import java.util.Scanner;

public class TicketNumber {

    public static void main(String [] args) {

        int ticketNum;
        int chkNum;
        int lastDigit;
        int remainder;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter 6 digit ticket number: ");
        ticketNum = input.nextInt(); 

        // this removes of the last number by dividing the ticket number by 10;
        // dividing by 10 will give us the number to the 10s place
        chkNum = ticketNum / 10;

        // this give us just the last digit by subtracting the `chkNum` variable
        // multiplied by 10; thereby removing all the digits up to the 10s place
        lastDigit = ticketNum - (chkNum * 10);

        System.out.println( chkNum );
        System.out.println( lastDigit );
        remainder = chkNum % 7;
        System.out.println( remainder );

        // checks to see if the lastDigit and the remainder are the same
        boolean isValidTicket = (lastDigit == remainder);
        System.out.println( isValidTicket );

    }
} 
