/* Imani Hollie 01/15/2026
   5-Minute Challenge: Write a program that takes user input for a name
   and the last 4 digits of a phone number from the keyboard,
   then prints them to the console.
   
   Sample Output:
   Name? Jane Doe
   Last 4-digit phone number? ****
   Your name: Jane Doe
   Last 4-digit phone number: ****
*/


import java.util.Scanner;                                // Import Scanner for keyboard input

public class J102_1 {                                    // J102_1 class
  public static void main(String[] args) {               // Program entry point (main method)
    Scanner input = new Scanner(System.in);              // Create Scanner object 'input'

    String name, phone;                                  // Variables for user's name and 4-digit phone
    int i;                                               // Loop index used to validate each character

    System.out.print("Name? ");                          // Prompt user for full name
    name = input.nextLine();                             // Read the entire line (allows spaces)

    while (true) {                                       // Keep asking until valid input is provided
      System.out.print("Last 4-digit phone number? ");   // Prompt user for phone number
      phone = input.nextLine().trim();                   // Read input and trim leading/trailing spaces

      if (phone.length() != 4) {                         // Must be exactly 4 characters
        System.out.println("ERROR: Invalid Input.");     // Inform user of invalid input
        continue;                                        // Ask again
      }

      for (i = 0; i < 4; i++) {                          // Validate each character
        char c = phone.charAt(i);                        // Get the i-th character
        if (c < '0' || c > '9') break;                   // Not a digit? stop and mark invalid
      }

      if (i == 4) break;                                 // All 4 characters were digits → exit loop
      System.out.println("ERROR: Invalid Input.");       // Otherwise, tell user and repeat
    }

    System.out.println("Your name: " + name);                   // Print the user's name
    System.out.println("Last 4-digit phone number: " + phone);  // Print the validated phone digits

    input.close();                                       // Close the scanner to release resources
  }
}
