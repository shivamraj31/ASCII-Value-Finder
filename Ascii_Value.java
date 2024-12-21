
/**
 * This Program on asks for a charater and gives the ascii value for it
 * @author Kroggieboy57 
 * @version 1
 */
import java.util.Scanner;//Importing utility Scanner

public class Ascii_Value {
    public static void main(String args[]) {
        System.out.print("Enter a character:");// This statement asks for a character
        Scanner sc = new Scanner(System.in);// initialising scanner
        char a = sc.next().charAt(0);// Taking in the character
        sc.close();// closes the scanner
        System.out.println("The Ascii Value of '" + a + "' is " + (int) a);// (int)a converts the char to a number which
                                                                           // is its Ascii value
    }
}
