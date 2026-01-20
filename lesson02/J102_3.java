/* Imani Hollie 01/20/2026
   Lesson 2 Lab: Write a code to produce a similar output to the sample output.
   Use the keywords: print, println, printf for sections A, B, and C.
   Use the following variable names:
   -  myName: User's name
   -  myMiddle: User's middle initial
   -  myAge: User's age
   -  pi = 3.141592

   Sample Output:
   A. print =====================
   My name is ***.
   I am *** years old.
   Pi is 3.141592

   B.  println ==================
   Name    : ***
   Initial : *
   Age     : ***
   Pi      : 3.141592

   C.  printf ===================
   My name is *** and I am *** years old.
   Pi : 3.141592
   Pi :  3.14159
   Pi :   3.1415
   Pi :    3.141
   Pi :     3.14
   Pi :      3.1
*/

public class J102_3 {  // Class name
  public static void main(String[] args) {  // Main method (Program execution starts here)
    // Define variables
    String myName = "Imani Hollie", myFirst = "Imani", myLast = "Hollie";
    char myMiddle = 'C';
    int myAge = 22;
    final double PI = 3.141592; // Pi is a constant
    
    // Section A: print (w/escape characters (\n is endl))
    System.out.print("A. print ====================\n");
    System.out.print("My name is " + myFirst + " " + myMiddle + ". " + myLast + ".\n");
    System.out.print("I am " + myAge + " years old.\n");
    System.out.println("Pi is " + PI + "\n");

    //Section B println
    System.out.println("B. println ==================");
    System.out.println("Name    : " + myName);
    System.out.println("Initial : " + myMiddle);
    System.out.println("Age     : " + myAge);
    System.out.println("Pi      : " + PI + "\n");
    
    //Section C printf
    System.out.println("C. printf ===================");
    System.out.printf("My name is %s %c. %s and I am %d years old.\n", myFirst, myMiddle, myLast, myAge);
    
    for (int i = 0; i <= 5; i++) { // For loop to print Pi w/ decreasing precision and increasing indentation
      // Width starts at 8 and increases to shift the decimal right
      // Precision starts at 6 addecreases down to 1
      System.out.printf("Pi : %" + (8 + i) + "." + (6 - i) + "f\n", PI); // Dynamic formatting
    }
  }
}  // Ends the program
