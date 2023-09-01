
import java.util.Scanner;

public class Hw3_Pro1_150122056 {

	public static void main(String[] args) {
		// Erencan Acıoğlu 150122056
		/*In this program, you enter a string with numbers and
		 * s,b,n letters. "s" for star,"b" for blank, "n" for new line.
		 * number of before characters,
		 * represents how many times the character should be printed;
		 * if the number is missing, the character should be printed only once. 
		 */
		System.out.println("Welcome to image printer program.");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your sequence:");
        String yourSequence = input.next();
        int lengthOfYourSequence = yourSequence.length()-1;
        char forWord = 0;
        char forNum = 0;
        for(int i = 0; i <= lengthOfYourSequence; i++) {
        	forWord = yourSequence.charAt(i);
        	if(Character.isDigit(forWord)) {
        		forNum = yourSequence.charAt(i+1);
        		if(forNum == 's') {
        			for(int j = 0; j < forWord-49; j++ ) {
        				System.out.print("*");
        			}
        		}}else if(forWord == 's') {
        			System.out.print("*");
         	}if(Character.isDigit(forWord)) {
        		forNum = yourSequence.charAt(i+1);
        		if(forNum == 'b') {
        			for(int j = 0; j < forWord-49; j++ ) {
        				System.out.print(" ");
        			}
        		}}else if(forWord == 'b') {
        			System.out.print(" ");
        		}if(Character.isDigit(forWord)) {
            		forNum = yourSequence.charAt(i+1);
            		if(forNum == 'n') {
            			for(int j = 0; j < forWord-49; j++ ) {
            				System.out.println();
            			}
            		}}else if(forWord == 'n') {
            			System.out.println();
            		}
        }input.close();
	}

}


        	
        

