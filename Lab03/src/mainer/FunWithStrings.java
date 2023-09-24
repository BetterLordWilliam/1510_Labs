package mainer;

import java.util.Scanner;

/**
 * Class where we have fun with strings.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class FunWithStrings {

	/**
	 * Drives the program
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userIn;
		// String userIn1;
		
		// Getting the book title
		System.out.print("Enter the name of your favorite book: ");
		userIn = sc.nextLine(); 
		// userIn1 = sc.next(); Grabs the next token
		System.out.println("Your book: " + userIn);
		
		// How long is the users title
		System.out.println("The length of your book title is: " + userIn.length());
		
		// Does the user's books start with the word 'the'
		if (userIn.startsWith("The") || userIn.startsWith("the")) {
			System.out.println("Your book starts with the wored 'The'");
		} else {
			System.out.println("Your book does not start with the word 'The'");
		}
		
		// Will not change the string to uppercase, strings are immutable.
		userIn.toUpperCase();
	
		// Upper and lower case book names
		String upprCase = userIn.toUpperCase();
		String lwwrCase = userIn.toLowerCase();
		System.out.println("Upper case name: " + upprCase);
		System.out.println("Lower case name: " + lwwrCase);
		
		// Trim leading / following white space
		String trimmedUserIn = userIn.trim();
		System.out.println("Trimmed user input: " + trimmedUserIn);
		
		// Final print
		int stringLen = userIn.length();
		String firstString = (trimmedUserIn.substring(0, 1)).toUpperCase();
		String lastString = (trimmedUserIn.substring(stringLen-1, stringLen)).toUpperCase();
		String middle = (trimmedUserIn.substring(1, stringLen-1)).toLowerCase();
		System.out.println(firstString + middle + lastString);
		
		sc.close();
	}

}
