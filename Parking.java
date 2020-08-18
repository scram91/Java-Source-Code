//parking.jave
/* Prompts user to input the amount 
   of hours they have been parked
   in a long term parking lot, and
   display the amount of days the 
   parking lot will charge them for*/

import java.util.Scanner;

public class Parking {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
        System.out.print("Enter hours parked: "); // Prompt for user input
      int hours = input.nextInt();  // user input
      
/* The following if statements will display the amount of days the user has been parked.
   The first staement will execute if the user inputs a number divisible by 24,
   returning a remainder of 0. This statement will only apply if the user has been
   parked exactly 1,2,3, etc days.*/
       if (hours % 24 == 0){
        System.out.printf("Days parked: %d%n", hours/24); 
       }
       
/* The second if statement will execute if the user inputs a number that is not divisible by 24
   which will return a remainder that is not 0. This statement will then execute the equation 
   hours/24+1, which will "round up" to the next day. For example if the user has been parked for
   18 hours the equation will be as follows. 18/24 + 1; 18/24=0; 0+1=1.*/
   
       if (hours % 24 != 0){
        System.out.printf("Days parked: %d%n", hours/24 + 1);  
       }
       
   } 
} 
