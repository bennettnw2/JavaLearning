/*
Name:   Time.java
Desc:   This will take minutes and convert them into hours and minutes
Logic:  Divide(modulo) the whole number by 60 and then what is left over will be minutes
Author: Nygel Bennett
Date:   Oct 19 2019
*/

import java.util.Scanner; 

public class Time {
  
    public static void main(String [] args) {
        
        int initialMins;
        final int HOUR = 60;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total number of minutes worked: ");
        initialMins = input.nextInt();
        int hours = initialMins / HOUR;
        int convMins = initialMins % HOUR;

        System.out.println( initialMins + " minutes equals " + hours + " hours and " + convMins + " minutes.");



        
    }
} 
