
import java.util.Scanner;

public class Hw5_Pro1_150122056 {

	
	
	
	/* Erencan Acıoğlu 150122056
	 * 
	 * In this program user enters a string.
	 * This string should contain a set of numbers separated by dashes (-),
	 * and each number is used for a binary representation of a row.
	 *  
	 * First program writes the grid that user entered.
	 * After that converts the table as many times as the user wants.
	 * 
	 * The rules to give a value to a cell listed below:
	 * 
	 * If a cell contains the value of ‘1’ in the first array, there are three rules to update its
		value in the second array:
	 *	
	 * If a cell has fewer than two ‘1’ neighbor cells, it is converted to ‘0’.
	 * If a cell has more than three ‘1’ neighbor cells, it is converted to ‘0’.
	 * If a cell has exactly two or three ‘1’ neighbor cells, it remains as ‘1’.
	 * 
	 * 
	 * If a cell contains the value of ‘0’ in the first array,the following rule applies to update its value in the second array:
	 * 
	 * If a cell has exactly three ‘1’ neighbor cells, it is converted to ‘1’.
	 * Otherwise, it remains as ‘0’.
	 */
	
	
	
	
	
	
	//This method parses the numbers in the string entered by the user.
	public static int[] getNumFromString(String input) {
   	    
   	    int count = 0;
   	    int beginning = 0;
   	    
   	    for (int i = 0; i < input.length(); i++) {
   	      if (input.charAt(i) == '-') {
   	        count++;
   	      }
   	    }
   	    
   	    int[] findIntInArr = new int[count + 1];
   	    count = 0;
   	    beginning = 0;
   	    for (int i = 0; i < input.length(); i++) {
   	      if (input.charAt(i) == '-') {
   	    	findIntInArr[count++] = Integer.parseInt(input.substring(beginning, i));
   	        beginning = i + 1;
   	      }
   	    }
   	    findIntInArr[count] = Integer.parseInt(input.substring(beginning));

   	    return findIntInArr;
   	}
	
	//This method converts decimal to binary then puts it inside the 2D array.
	public static int[][] convertDectoB(int[] ints) {
		   
	    int maxBinaryLength = 0;
	    
	   
	    for (int i = 0; i < ints.length; i++) {
	      int number = ints[i];
	      String binary = "";
	      while (number > 0) {
	        int remainder = number % 2;
	        binary = remainder + binary;
	        number = number / 2; 
	      }
	      if (binary.length() > maxBinaryLength) {
	        maxBinaryLength = binary.length();
	      }
	    }
	    
	    int[][] convertDectoBArr = new int[ints.length][maxBinaryLength];
	    
	    for (int i = 0; i < ints.length; i++) {
	      int number = ints[i];
	      String binary = "";
	      while (number > 0) {
	        int remainder = number % 2;
	        binary = remainder + binary;
	        number = number / 2;  
	      }
	     
	      for (int j = binary.length(); j < maxBinaryLength; j++) {
	        binary = "0" + binary;
	      }
	     
	      for (int j = 0; j < maxBinaryLength; j++) {
	            if (j < binary.length()) {
	                convertDectoBArr[i][maxBinaryLength - j - 1] = binary.charAt(j) - '0';
	            } else {
	                convertDectoBArr[i][maxBinaryLength - j - 1] = 0;  // Pad with zeros
	            }
	        }
	    }

	    return convertDectoBArr;
	}

	
	 //This method count neighbor blocks for the calculate how many 1 there is.
	 public static int countNeighbors(int[][] array, int i, int j) {
		 
		  int countNeighbors = 0;
		  
		  //Checks upper left corner.
		  if (i > 0 && j > 0 && array[i - 1][j - 1] == 1) {
			  countNeighbors++;
		  }
		  
		  //Checks upper right corner.
		  if (i > 0 && j < array[i].length - 1 && array[i - 1][j + 1] == 1) {
			  countNeighbors++;
		  }
		  
		  //Checks lower left corner.
		  if (i < array.length - 1 && j > 0 && array[i + 1][j - 1] == 1) {
			  countNeighbors++;
		  }
		  
		  
		  //Checks lower right corner.
		  if (i < array.length - 1 && j < array[i].length - 1 && array[i + 1][j + 1] == 1) {
			  countNeighbors++;
		  }
		  
		  
		  		  
		  //Checks the top.
		  if (i > 0 && array[i - 1][j] == 1) {
			  countNeighbors++;
		  }
		  
		
		  
		  //Checks the left.
		  if (j > 0 && array[i][j - 1] == 1) {
			  countNeighbors++;
		  }
		  
		  //Checks the right.
		  if (j < array[i].length - 1 && array[i][j + 1] == 1) {
			  countNeighbors++;
		  }
		  
		
		  
		  //Checks lower.
		  if (i < array.length - 1 && array[i + 1][j] == 1) {
			  countNeighbors++;
		  }
		  
		
		  return countNeighbors;
		}
	  
	 	//This method converts binary to decimal in the last updated table.
		public static void convertDecimal(int[][] array) {
		   	  int[] decimalArr = new int[array.length];
		   	  
		   	  for (int i = 0; i < array.length; i++) {
		   	    int decimalInt = 0;
		   	    for (int j = 0; j < array[i].length; j++) {
		   	    	decimalInt += array[i][j] * Math.pow(2, array[i].length - 1 - j);
		   	    }
		   	 decimalArr[i] = decimalInt;
		   	  }
		   	  System.out.print("The decimal value of the final updated array: ");
		   	  for (int i = 0; i < decimalArr.length; i++) {
		   	    System.out.print(decimalArr[i]);
		   	    if (i < decimalArr.length - 1) {
		   	      System.out.print("-");
		   	    }
		   	  }
		   	  System.out.println();
		   	}
		
		
		//This code block prints the first table with the numbers that the user enters.
		public static void firstTableWithInputNums(int[][] array) {
			  
			  for (int j = 0; j < array[0].length; j++) {
			    System.out.print("----");
			  }
			  System.out.println("-");
			  
			  for (int i = 0; i < array.length; i++) {
			    for (int j = array[i].length - 1; j >= 0; j--) {
			      System.out.print("| " + array[i][j] + " ");
			    }
			    System.out.println("|");
			    
			    for (int j = 0; j < array[i].length; j++) {
			      System.out.print("----");
			    }
			    System.out.println("-");
			  }
			}
	 	 
	

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Welcome to our program.");
		 System.out.print("Enter a string: ");
		 String stringInput = input.nextLine();
		 System.out.print("Enter number of steps: ");
		 int numSteps = input.nextInt();
		 
		 
		 int[] ints = getNumFromString(stringInput);
		 
		 int[][] array = convertDectoB(ints);
		 
		
		 firstTableWithInputNums(array);
		 

		    	for (int step = 1; step <= numSteps; step++) {
		    		
		    	  int[][] updatedArray = new int[array.length][array[0].length];
		    	  
		    	  for (int i = 0; i < array.length; i++) {
		    	    for (int j = 0; j < array[i].length; j++) {
		    	      
		    	      //Checks the neighbor values.
		    	      int value = array[i][j];
		    	      int numNeighbors = countNeighbors(array, i, j);
		    	      if (value == 1) {
		    	    	  //For value 1.
		    	    	  if (numNeighbors < 2 || numNeighbors > 3) {
		    	    	    updatedArray[i][j] = 0;
		    	    	  } else {
		    	    	    updatedArray[i][j] = 1;
		    	    	  }
		    	    	} else {
		    	    	 
		    	    	  //For value 0.
		    	    	  if (numNeighbors == 3) {
		    	    	    updatedArray[i][j] = 1;
		    	    	  } else if (numNeighbors == 3) {
		    	    	    updatedArray[i][j] = 1;
		    	    	  } else {
		    	    	    updatedArray[i][j] = 0;
		    	    	  }
		    	    	}
		    	    }
		    	    
		    	  }

		    	  //Prints the converted table.
		    	  System.out.println("It is converted to the following table after " + step + ". step:");
		    	  
		    	  for (int i = 0; i < updatedArray.length; i++) {
		    		  
		    	    for (int j = 0; j < updatedArray[i].length; j++) {
		    	      System.out.print("----");
		    	    }
		    	    System.out.println("-");
		    	    for (int j = updatedArray[i].length - 1; j >= 0; j--) {
		    	      System.out.print("| " + updatedArray[i][j] + " ");
		    	    }
		    	    
		    	    System.out.println("|");
		    	  }
		    	  for (int j = 0; j < updatedArray[0].length; j++) {
		    	    System.out.print("----");
		    	  }
		    	  
		    	  System.out.println("-");

		    	  
		    	  array = updatedArray;
		    	  
		    	  
		    	}
		    	
		    	
		    	convertDecimal(array);
		    	
		    	
		    	
		    	input.close();
		  }

	    
	}

