import java.util.Scanner; 

public class FahrenheitToCelsius {

    public static void main(String [] args) {

      double tempFah;
      double tempCel;
      Scanner input = new Scanner(System.in);

      System.out.print("Enter temperature in Fahrenheit to convert to Celcius: ");
      tempFah = input.nextDouble(); 
      tempCel = (tempFah - 32) * (.56);
      System.out.println( tempFah + "°F = " + tempCel + "°C" );


    }
} 
