/*
   Imani Hollie 01/21/2026\
   Lesson 4 Lab: Write a program that prompts the user to enter
   two alphabet characters. The program will then generate a random
   sequence of five uppercase alphabet characters and compare the
   user's inputs as follows:
   - The first input will be compared to the first character of the sequence
   - The second input will be compared to the last character of the sequence
   Display whether each input is correct/incorrect and show the sequence for reference
   
   // Credit to @ElementalMagicksCardGame on Twitch

   Sample Output:
   ? JV
   Both are wrong
   Generated sequence: WDOKP // You should compare J with W, V with P
   ? AL
   The first one is correct
   Generated sequence: ADPBP // You should compare A with A, L with P
*/

import java.util.Scanner;   // Allows use of Scanner objects
import java.util.Random;    // Allows use of Random objects

public class J104_3 {      // J104_3 Class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create Scanner object 'input'
        Random rand = new Random();              // Create Random object 'rand'

        // Get user input
        System.out.print("? ");  // Outputs to console
        String guess = input.nextLine(); // Reads full line of text

        // Output ERROR Message IF input is NOT 2 uppercase characters
        if (!(guess.length() == 2 &&                // Validates length is 2
           Character.isLetter(guess.charAt(0)) &&   // Vallidates first character is letter
           Character.isLetter(guess.charAt(1)))) {  // Vallidates second character is letter
          // Output ERROR Message
          System.out.println("ERROR: Invalid Input");
          System.exit(1);
        };

        // Format input to uppercase letters
        guess.toUpperCase(); // Formats string w/uppercase letters

        int i = 0; // Initialize i
        
        do {
          // Generate 5 uppercase characters
          character letter = rand.nextInt(26) + 'A'; // 0 - 25 (26) as 'A' - 'Z'
          String generated += letter; // Imbeds new character w/in String
          i++; // Increment i
        } while (i < 4);
        
        // Compare guess to characters
          // If first true then output The first one is correct and try again
          Character.indexOf(guess.charAt(0))
          // If second true then output The second one is correct and try again
          // If neither true then output Both are wrong and try again
          // If both true then output Both are correct then exit program

        // Program logic
        input.close();  // Close 'input'
    }
}  // End of program
