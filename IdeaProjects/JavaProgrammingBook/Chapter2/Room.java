/*
Name:   Room.java: this program will take two variables and calculate the square footage of a room
Logic:  length * width = sqare footage
Author: Nygel Bennett
Date:   Oct 19 2019
*/

import java.util.Scanner;

public class Room {

    public static void main(String [] args) {

        double length;
        double width;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the room: ");
        length = input.nextDouble();
        System.out.println("You have entered " + length + " feet.");
        System.out.print("Enter the width of the room: ");
        width = input.nextDouble();
        System.out.println("You have entered " + width + " feet.");
        
        double sqFeet = length * width;

        System.out.println("The floor space is " + sqFeet + " square feet." );
    }
} 
