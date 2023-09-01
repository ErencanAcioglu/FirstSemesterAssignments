
import java.util.Scanner;

public class Hw3_Pro3_150122056 {


	public static void main(String[] args) {
		// Erencan Acıoğlu 150122056
		/*In this program, you enter a string.
		 *After that program prints the pattern until you enter "QUIT".
		 *If you enter QUIT, program terminates.
		 */
		    Scanner input = new Scanner(System.in);
	        String inputString = "" ;
        for(int x = 0; !inputString.equals("QUIT"); x++) {   //This loop makes the program continue until you type "QUIT"   
		     System.out.print("Enter an input string: ");
	         inputString = input.next();
	         int stringLength = inputString.length()-1;
		 if(inputString.equals("QUIT")) {
			 System.out.println("OK. Good bye :-)");
		 break;
		 }
		  else {
		       for(int i=stringLength; i>=0; i--) {	   //upper half
	               for(int j=0; j<=i; j++) {
	                   System.out.print(inputString.charAt(j));  //upper left
	           }           int upperSpace = 2*(stringLength-i);
	               for(int j=1; j<= upperSpace; j++) {
	                   System.out.print(" ");
	           }
	               for(int j=stringLength-i; j<=stringLength; j++) { 
	                   System.out.print(inputString.charAt(j));  //upper right
	           }
	           System.out.println("");
	           }
               for(int i=0; i<=stringLength; i++) {    //lower half
	               for(int j=0; j<=i; j++) {
	                   System.out.print(inputString.charAt(j));   //lower left
	           }           int lowerSpace = 2*(stringLength-i);
	               for(int j=1; j<=lowerSpace; j++) {       
	                   System.out.print(" ");
	           }
	 
	               for(int j=stringLength-i; j<=stringLength; j++) {
	                   System.out.print(inputString.charAt(j));  //lower right
	           }
	           System.out.println("");
               }
	       }
		 }input.close();
	}
}
