//parkingfee.java
/* Prompts user to input the amount of hours they
   have been parked in a long term parking lot, 
   and displays the parking fee the individual will have to payr*/

import java.util.Scanner;

public class parkingfee {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter hours parked: "); // Prompt for user input
      int hours = input.nextInt();  // user input
            
      while (hours < 0){
          System.out.print("Please enter a valid time: ");
          hours = input.nextInt();
      }
      if (hours > 0 && hours <= 2){ //the following if statements will utilize the conditional AND operator to establish limits for each if statement
          System.out.println("Parking fee: $1");
      }
      
      if (hours > 2 && hours <= 4){
          System.out.println("Parking fee: $3");
      }
      
      if (hours > 4 && hours <= 6){
          System.out.println("Parking fee: $5");
      }
      
      if (hours > 6 && hours <= 24){
          System.out.println("Parking fee: $10");
      }
      else if (hours > 24) { //will execute the below if statements if hours entered is greater than 24
       if (hours % 24 == 0){
       System.out.printf("Parking fee: %s%d%n", "$", (hours/24)*10);
       }
   
       if (hours % 24 != 0){
       System.out.printf("Parking fee: %s%d%n", "$", (hours/24 + 1)*10);  
       }
      }
   } 
} 
