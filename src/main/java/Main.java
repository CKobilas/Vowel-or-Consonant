import java.util.*;
public class Main {
  public static void main(String[] args) {

    // Prompt the user to enter a letter
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a letter: ");
    
    // Read the input letter as a string
    
    String s = input.nextLine();
    
    // Convert the string to a character
    
    char ch = s.charAt(0);

    // Check if the character is a letter
    // If it is a letter, then do the following:
     // a. Convert the character to uppercase
     // b. Use a switch statement with the uppercase character:
    
    if (Character.isLetter(ch))
        {
          switch(Character.toUpperCase(ch))
          {
            case 'A': 
            case 'E': 
            case 'I': 
            case '0': 
            case 'U': System.out.println(ch + " is a vowel"); break;
            default : System.out.println(ch + " is a consonant"); 
          }
        }
      // If the character is not a letter, then print that it's an invalid input
        else
          System.out.println(ch + " is an invalid input");
      }
    }