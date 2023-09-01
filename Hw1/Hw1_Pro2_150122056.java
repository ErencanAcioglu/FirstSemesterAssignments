
import java.util.Scanner;

public class Hw1_Pro2_150122056 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Erencan Acıoğlu 150122056
		
		/*In this program, you enter your total number of eggs and it calculates
		 * how many gross, dozen and left over eggs you have.
		 */
		System.out.println("Please enter your total number of eggs : ");
	    Scanner input = new Scanner(System.in);
	    int totalEggs = input.nextInt();
	    int grossEggs = totalEggs / 144;
	    int x = totalEggs %144;
	    int dozenEggs =  x / 12;
	    int leftOverEggs = x % 12;
	    System.out.println("Your number of eggs is : " + grossEggs + " gross, " + dozenEggs + " dozen, " + leftOverEggs + "." );
	       
	       input.close(); 
	}

}
