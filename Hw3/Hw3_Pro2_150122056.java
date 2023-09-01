
import java.util.Scanner;

public class Hw3_Pro2_150122056 {


	public static void main(String[] args) {
		// Erencan Acıoğlu 150122056
		/* In this program there is a sequence
		 * which is Ax = (4 × Ax-1 ) - Ax-2
		 * The first two numbers in the sequence are 0 and 1.
		 * You type an integer number and this program prints the value in that sequence
		 */
		Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int positionNum = input.nextInt();
        int firstNum = 0;
        int secondNum = 1;
        int positionValue = 0;
        if(positionNum <= 0) {
        	System.out.println("Invalid position number, please try again later.");
        }else if(positionNum == 2) {
        	System.out.println("In position 2, the value is 1.");
        }else  {
        for(int i = 0; i<positionNum - 2; i++) { 
        	positionValue = (4*secondNum)-firstNum;
        	firstNum = secondNum;
        	secondNum = positionValue;
        }System.out.println("In position " + positionNum + ", the value is "
        		+ "" + positionValue + ".");
        
        
	}input.close();
	}
}
