
import java.util.Scanner;

public class Hw1_Pro3_150122056 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Erencan Acıoğlu 150122056
		
		/* This program is the Private Pension System,PPS for short,
		 * if you enter your monthly salary,
		 * percent of your salary to save
		 * monthly interest rate and 
		 * monthly government support rate
		 * it calculates your total profit.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your monthly salary, for example 3500 : ");
		double monthlySalary = input.nextDouble();
		System.out.print("Enter the percent of your salary to save, for example 10% : ");
		double save = input.nextDouble();
		System.out.print("Enter the monthly interest rate, for example 8.25% : ");
		double interestRate = input.nextDouble();
		System.out.print("Enter the monthly government support rate, for example 25% : ");
		double governmentSupport = input.nextDouble();
		double firstMonth = monthlySalary*(1+interestRate/100)*(1+governmentSupport/100)*(save/100);
		System.out.println("After the first month, the account value is : "+ (int)(firstMonth*100)/100.0 + " Tls ");
		double secondMonth = (firstMonth+monthlySalary*save/100*(1+governmentSupport/100))*(1+interestRate/100);
		System.out.println("After the second month, the account value is : "+ (int)(secondMonth*100)/100.0+ " Tls ");
		double thirdMonth = (secondMonth+monthlySalary*save/100*(1+governmentSupport/100))*(1+interestRate/100);
		System.out.println("After the third month, the account value is : "+ (int)(thirdMonth*100)/100.0 + " Tls ");
		double fourthMonth = (thirdMonth+monthlySalary*save/100*(1+governmentSupport/100))*(1+interestRate/100);
		System.out.println("After the fourth month, the account value is : "+ (int)(fourthMonth*100)/100.0 + " Tls ");
		double fifthMonth = (fourthMonth+monthlySalary*save/100*(1+governmentSupport/100))*(1+interestRate/100);		
		System.out.println("After the fifth month, the account value is : "+(int)(fifthMonth*100)/100.0 + " Tls ");
		double sixthMonth = (fifthMonth+monthlySalary*save/100*(1+governmentSupport/100))*(1+interestRate/100);
		System.out.println("After the sixth month, the account value is : "+ (int)(sixthMonth*100)/100.0 + " Tls ");
		double totalSave = monthlySalary*save/100*6;
		double totalProfit = sixthMonth-totalSave;
		System.out.println("In total, you saved : "+ totalSave + "TLs and your total profit is : "+ (int)(totalProfit*100)/100.0 );
		
		  input.close();
	}

}
