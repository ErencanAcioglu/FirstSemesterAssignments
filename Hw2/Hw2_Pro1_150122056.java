
import java.util.Scanner;

public class Hw2_Pro1_150122056 {


	public static void main(String[] args) {
	   //Erencan Acıoğlu 150122056
	   /*In this program, you enter which number base you want and 
	    * which operation you want to calculate.
	    * And this program calculates it.*/
	   //First enter a number between 2 and 10, then choose the operation you want to do.
	   /*How it works : this program converts your base to 10 then calculates it with your operation
	    * after that converts the result to your base again.
	    */
		

		        Scanner input = new Scanner(System.in);
		        System.out.println("The base of the number system (min:2, max:10) \nEnter the base of the number system: ");
		        int numberBase = input.nextInt();

		        if (numberBase >= 2 && numberBase <= 10) {
		            System.out.println("The type of the operation ('a' for addition, 's' for subtraction, 'm' for\n"
		                    + "multiplication, and 'd' for division) \nEnter the type of the operation:  ");
		            String operation = input.next();
		            System.out.println("Enter 2 input numbers: ");
		            String inputNumber1 = input.next();
		            String inputNumber2 = input.next();
		            int number1sLength = inputNumber1.length();
		            int number2sLength = inputNumber2.length();
		            int value1 = 0;
		            int value2 = 0;
		            int exponent = 0;

		            while (number1sLength != 0) {
		                value1 += Math.pow(numberBase, exponent) * (inputNumber1.charAt(number1sLength - 1) - '0');
		                number1sLength--;
		                exponent++;
		            }
		            exponent = 0;

		            while (number2sLength != 0) {
		                value2 += Math.pow(numberBase, exponent) * (inputNumber2.charAt(number2sLength - 1) - '0');
		                number2sLength--;
		                exponent++;
		            }

		            int operationResult = 0;
		            if (operation.equals("a")) {
		                operationResult = value1 + value2;
		            } else if (operation.equals("s")) {
		                operationResult = value1 - value2;
		            } else if (operation.equals("m")) {
		                operationResult = value1 * value2;
		            } else if (operation.equals("d")) {
		                operationResult = value1 / value2;
		            } else {
		                System.out.println("Wrong operation, please start the program again.");
		                input.close();
		                return;
		            }

		            String calculationResult = "";
		            while (operationResult >= numberBase) {
		                calculationResult += (operationResult % numberBase) + "";
		                operationResult /= numberBase;
		            }
		            calculationResult += operationResult;

		            System.out.print("Output: ");
		            for (int x = (calculationResult.length() - 1); x >= 0; x--) {
		                System.out.print(calculationResult.charAt(x));
		            }
		        } else {
		            System.out.println("Wrong number base, please start the program again.");
		        }

		        input.close();
		    }
		}

