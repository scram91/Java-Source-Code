import java.util.Scanner;

//Will prompt user for a positive integer (n) and will calculate the factorial of the numbers 1 through n.
//That is every number from 1 to the users input

public class Factorial{
    
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a positive integer: "); //Promts user to input a positive integer
    
    int num = input.nextInt();
    
    int n; //declares n to act as a counter
    double result = 1; //declares the result to be equal to the factorial of 1
                       //will be a double to calculate larger factroials
    for (n = 1; n <= num; n++){ //for loop will set n equal to 1, execute as long as n is less than or equal to user input, and add 1 to n each loop
        
        result *= n; //will calculate factorials starting with 1! and ending with user input
        System.out.printf("%d! = %.0f%n", n, result); //will display each factorial staring with 1! and ending with the factorial of user input
                                                      //%.0f to display floating point number with zero decimal places
    }
        
    }

}
