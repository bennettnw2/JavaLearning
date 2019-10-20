/*
Name: Guess.java
Desc: This is a guessing game where the computer will pick a number and you guess
      the number and the computer will let you know if you are too high or too low
      with your guess until you get it correct!
Author: Harmony & Nygel
Date: Oct 19 2019
*/

import java.util.Scanner;

public class Guess {

    public static void main(String [] args) {

          int pickNum = 0 + (int)(Math.random() * 100);
          int guessNum;
          Scanner input = new Scanner(System.in);
          
          System.out.println( "****************************************" );
          System.out.println( "Welcome to Harmony Star's Guessing Game!" );
          System.out.println( "****************************************" );

          System.out.println( "I, the computer have picked a number between 1-100." );
          System.out.println( "It is your task to guess the number I have picked!" );
          head();
          System.out.println( );
          System.out.print( "Enter your first guess, please. ");
          guessNum = input.nextInt();
          System.out.println( "Your guess is: " + guessNum );

          while (guessNum != pickNum) {
              if (guessNum > pickNum) {
                  System.out.println( "You need to pick a lower number!" );
                  head();
                  System.out.print( "What is your next guess? " );
                  guessNum = input.nextInt();
              } else {
                  System.out.println( "You need to pick a higher number!" );
                  head();
                  System.out.print( "What is your next guess? " );
                  guessNum = input.nextInt();
              }
          }
          System.out.println( "You picked the correct number!  You are somehting else!");
          headEnd();

    }

    public static void head() {
        System.out.println( "  _//////      /" );
        System.out.println( " // o o \\     /" );
        System.out.println( " (   7   ) __/" );
        System.out.println( "  \\ '=' /" );
        System.out.println( "   '---'" );
    }
    public static void headEnd() {
        System.out.println( "  _//////      /" );
        System.out.println( " // O O \\     /" );
        System.out.println( " (   7   ) __/" );
        System.out.println( "  \\ 'O' /" );
        System.out.println( "   '---'" );
    }
} 
