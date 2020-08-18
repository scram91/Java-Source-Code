import java.util.Scanner;

public class Comparevalues {

//Program that will compare the values of two integers input by the user, x & y. 
//The program will output 1 if x > y, 0 if x = y, and -1 if x < y


   public static void main(String[] args) {
     
      Scanner input = new Scanner(System.in);

      System.out.print("Enter two integer values separated by a space: "); //Prompt user to input two integers to compare
      int x = input.nextInt(); //First user integer
      int y = input.nextInt(); //Second user integer
    
      
      int result = compare(x, y); //Calls the compare method to compare two integers. See the compare method below for additional notes

      System.out.println(result); //Will display the result (1, 0, or -1)
   } 

             
   public static int compare(int x, int y) {   
      int n; //Declacres a new variable n to act as the result for the comparison
                                                                  
          
      if (x > y) {
         n = 1;   //Will set n = 1 if x>y                                     
      }                                                           
                                                                  
              
      else if (x == y) {                                     
         n = 0;    //Will set n = 0 if x=y                           
      }
      else {
          n = -1;  //Will set n = -1 if x<y
      }
                                                                  
      return n;  //The method will return the value of n and assign that value to the variable result
   }                                                              
} 
