
import java.util.Scanner;

public class Hw4_Pro1_150122056 {

	
	//Erencan Acıoğlu 150122056
	/*In this program we have a menu which is:
	 * Menu:
        1. Change Case:Returns a new string in which the upper case letters are changed to lower case and
			lower case letters are changed to upper case.
        
        2. Count occurrences:Takes a String array to represent a sentence and an input String word,
            and returns an integer which counts the number of occurrences of given word in the given
			sentence in a case insensitive way.
  		
  		3. Encryption: Takes an input string, convert it into upper case and the prints the encrypted zigzag pattern.
  		
  		4. Statistics: Takes an input string, calculates how many words and alphabetic letters with using
  			updateWordCount and updateLetterCount methods.
  		
  		5. Exit: If you enter 5, program ends.
	 */
	
	
	public static String changeCase(String stringInput) {
		String charSum = "";
		for(int i = 0; i <= stringInput.length()-1; i++) {
			char chr = stringInput.charAt(i);
			if (Character.isUpperCase(chr)) {
	            charSum += Character.toLowerCase(chr);
	        } else if (Character.isLowerCase(chr)) {
	            charSum += Character.toUpperCase(chr);
	        } else {
	            charSum += chr;
	        }
			
		}
		return charSum;
	}
	public static int countOccurrences(String[] sentence, String word) { //This method finds the same word count.
		 int count = 0;
		    for (int i = 0; i < sentence.length; i++) {
		        if (sentence[i].equalsIgnoreCase(word)) {
		            count++;
		        }
		    }
		    return count;
		}

		
	public static int updateWordCount(int count, String sentenceInput2) { 
		int countWord = 1;
		String sentenceInputTrim = sentenceInput2.trim(); //Trim for delete the spaces in the beginning and end because program counts word with space count.
		for(int i = 0; i < sentenceInputTrim.length()-1; i++) {
			if(sentenceInputTrim.charAt(i) == ' ') {
                countWord++;
            }
		}
		return countWord;
	}
	public static int updateLetterCount(int count, String sentenceInput2) {
		int countLetter = 0;
		for (int i = 0; i < sentenceInput2.length(); i++) {
			char ch = sentenceInput2.charAt(i);
			if (Character.isLetter(ch)) {
				countLetter++;
			}
		}
		return countLetter;
		
	}
	public static void printStat(int wordCount, int countLetter) {//In this method we combine updateLetterCount and updateWordCount methods.
	    System.out.println("Word count: " + wordCount);
	    System.out.println("Letter count: " + countLetter);
	}
	public static String encryption (String str, int pattern) {
		char zigzag[][]= new char[pattern][str.length()];
		 int row = 0;
		    boolean columnDown = true;               //This boolean is for move the zigzag up or down.
		    for (int i = 0; i < str.length(); i++) { //This code block is for zigzag pattern.
		      zigzag[row][i] = str.charAt(i);
		      if (columnDown) {
		        row++;
		      } else {
		        row--;
		      }
		      if (row == pattern - 1) {
		    	  columnDown = false;
		      } else if (row == 0) {
		    	  columnDown = true;
		      }
		    }
		    String encryptedZigZag = "";
		    for (int i = 0; i < pattern; i++) {
		      for (int j = 0; j < str.length(); j++) {
		        if (zigzag[i][j] != ' ') {
		        	encryptedZigZag += zigzag[i][j];
		        }
		      }
		    }

		    return encryptedZigZag;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		int choiceNum;
		for(;;) {
			  System.out.println("Menu: \n 1. Change Case \n 2. Count occurrences \n 3. Encryption \n 4. Statistics \n 5. Exit");
			  System.out.println("Please select an option: ");
			  choiceNum = input.nextInt();
			  
			  if(choiceNum == 1) {
				 Scanner scan = new Scanner(System.in);
				 System.out.println("Please enter an input String: ");
				 String stringInput = scan.nextLine();
				 System.out.println(changeCase(stringInput));
	  
			     
				 
			  }else if(choiceNum == 2) {
				  Scanner scan = new Scanner(System.in);
			      System.out.println("Enter a sentence: ");
			      String sentence = scan.nextLine();
			      int wordCount = 0;
			      for (int i = 0; i < sentence.length(); i++) { //This loop calculates how many words the sentence contains.
			          if (sentence.charAt(i) == ' ') {
			              wordCount++;
			          }
			      }
			      String sentenceArray[] = new String[wordCount +1];
			      int wordInSentence = 0;
			      int beginningWord = 0;
			      for (int i = 0; i < sentence.length(); i++) { //This loop splits the sentence.
			          if (sentence.charAt(i) == ' ') {
			              sentenceArray[wordInSentence] = sentence.substring(beginningWord, i);
			              beginningWord = i + 1;
			              wordInSentence++;
			          }
			      }
			      sentenceArray[wordInSentence] = sentence.substring(beginningWord);
		          System.out.println("Enter a word: ");
	              String word = scan.nextLine();
			      int count = countOccurrences(sentenceArray, word);
			      System.out.println( word + " appears " + count + " time(s) in the sentence.");
				  
				  		
			      
			  }else if(choiceNum == 3) { 
				  Scanner scan = new Scanner(System.in);
				  System.out.println("Please enter an input String: ");
				  String sentenceInput = scan.nextLine();
				  sentenceInput = sentenceInput.toUpperCase();
				  String finalWord = ""; 
				  int firstWord = 0;
				  for (int i = 0; i < sentenceInput.length(); i++) { //This part is for delete the spaces and write all the words side by side.
				    	if (sentenceInput.charAt(i) != ' ') {
				            finalWord += sentenceInput.charAt(i);
				          }
				        }
				   System.out.println("Enter an integer pattern: "); 
				   int pattern = scan.nextInt();
				   System.out.println("Source: " + sentenceInput);
				   String encryptedZigZag = encryption(finalWord, pattern);
				   System.out.println("Encrypted: " + encryptedZigZag);
				  			
				 	
				   
			  }else if(choiceNum == 4) {
				  Scanner scan = new Scanner(System.in);
				  System.out.println("Please enter an sentence: ");
				  String sentenceInput2 = scan.nextLine();
				  int count = 0;
				  int wordCount = updateWordCount(count, sentenceInput2);			 
				  int countLetter = updateLetterCount(count, sentenceInput2);
				  printStat(wordCount, countLetter);
				 
				
				 				  
			  }else if(choiceNum == 5) {				 
				  System.out.println("Program ends. Bye :)");
				  break;	       
				  
			  }else {
				  System.out.println("Invalid input, please try again later.");
			  }
			  
		}
		
		
	}

}
