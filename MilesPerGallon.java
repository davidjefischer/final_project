/* Miles Per Gallon
David Fischer
CS 110
Professor Horton
1/18/2015

this program will ask the user for number of miles driven
and the number of gallons of gas used and will calculate and
display the car's miles per gallon
herpa derpa derp test change
*/

import java.util.Scanner; //Scanner class

public class MilesPerGallon 
{

   public static void main(String[] args)
   {
      //variable declarations
      int miles, gallons = 0;
      double milesPerGallon = 0;
      Scanner s = new Scanner(System.in);
      
      System.out.print("How many miles did you drive? (Enter a whole number) ");
      miles = s.nextInt();
      
      System.out.print("How many gallons of gas did you use? (Whole number) ");
      gallons = s.nextInt();
      
      milesPerGallon = (double)miles / gallons;
      System.out.println("Your car travels at " + milesPerGallon +
                           " miles per gallon.");
                           
   }
}
