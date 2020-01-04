/*
Name:   Carpet2.java
Desc:   This program will take three variables from user input and calculate the square footage of a room
        Then it will calculate the cost to carpet the room
Logic:  costPerSqFoot(length * width) = cost of square footage of the carpet
Author: Nygel Bennett
Date:   Oct 19 2019
*/

import java.util.Scanner;

public class Carpet2 {

    public static void main(String [] args) {

        double length;
        double width;
        double carpetCost; // this will be in dollars per square foot
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        length = input.nextDouble();
        System.out.println("You have entered " + length + " feet.");
        System.out.print("Enter the width of the room: ");
        width = input.nextDouble();
        System.out.println("You have entered " + width + " feet.");
        System.out.print("Enter the cost of the carpet in $/sqft: ");
        carpetCost = input.nextDouble();
        System.out.println("You have entered $" + carpetCost + " per square foot.");
        System.out.println();
        
        double sqFeet = length * width;
        double total = carpetCost * sqFeet;

        System.out.println("The floor space is " + sqFeet + " square feet." );
        System.out.println("At $" + carpetCost + " per square foot, the total cost to carpet your room is: $" + total );
    }
} 
