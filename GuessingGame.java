import java.util.Random; // program uses class Random
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // randomNumbers object will produce random numbers
        Random randomNumbers = new Random();     
 
        // generate a random integer from 1 to 20    
        int number = 1 + randomNumbers.nextInt(20);
	
        System.out.println("A random number from 1 to 20 was chosen.");
        
       Scanner input = new Scanner(System.in);
       
       System.out.print("What is the number? ");
       int guess = input.nextInt();
       int x = 0;
       
       while (guess != number){
          if (guess > number){
            System.out.printf("%d is too high.%n", guess);
        }
        else if (guess < number){
            System.out.printf("%d is too low.%n", guess);
        }
        
           System.out.print("What is the number? ");
           guess = input.nextInt();
           x++;
           
    }
        if (guess == number) {
            System.out.printf("Bingo. %d is the correct answer.",guess);
            System.out.printf("%nTotal number of guesses: %d%n", x);
        }
    
    }
}
