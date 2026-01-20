/* Imani Hollie 01/20/2026
   Lesson 2 Lab: Analyze and explain the code line by line to determine its purpose.
   
   Sample Program:
   // This program is ***
   public class Test1 {
     public static voide main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter ***: ");
       double aaa = input.nextDouble();
       double bbb = (5.0 / 9) * (aaa - 32);
       System.out.println("aaa " + aaa + " is " + bbb + " in bbb");
   }
*/

// This program is converting Fahrenheit to Celcius

import java.util.Scanner;  // Allows use of Scanner objects

public class J102_2 {  // Class name
  public static void main(String[] args) {  // Main method (Program execution starts here)

    // Create Scanner object
    Scanner input = new Scanner(System.in);
    
    // Get temperature
    System.out.print("Enter temperature: "); // Prompt asking for the temperature
    double fahrenheit = input.nextDouble();  // Declare variable and read user input

    // Declare variable and calculate conversion
    double celsius = (5.0 / 9) * (fahrenheit - 32); // Vairable to store celsius

    // Output temperature conversion
    System.out.println("fahrenheit " + fahrenheit + " is " + celsius + " in celsius")
  }
}  // Ends the program
