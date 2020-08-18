//TemperatureConversion.jave
/*Prompts user for input in Fahrenheit,
  converts that input into Celcius, 
  and returns the converted temperature to the user*/

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String args[]) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter temperature in Fahrenheit: "); // prompt for user input
      int fahrenheit = input.nextInt(); // user input
      
      int celcius = (fahrenheit-32)*5/9; // conversion of F to C
      
      System.out.printf("The temperature in Celcius is %d%n", celcius); // presents converted temperature to user
    }
}
