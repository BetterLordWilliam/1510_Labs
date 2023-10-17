package main;

import java.util.Scanner;

/**
 * Program to calculate factorials.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class Factorial {
	
	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int start1 = 1;
		final int start2 = 2;
		
		Scanner sc = new Scanner(System.in);
		
		int limit = validateInt(sc);
		int toFactorial = start1;
		int otherInt = start2;
		
		while (otherInt <= limit) {
			toFactorial = otherInt * toFactorial;
			otherInt++;
		}
		
		System.out.println("Factorial number: " + toFactorial);
		
		sc.close();
		
	}
	
	/**
	 * Determines if the integer is non-negative.
	 * 
	 * @param sc Scanner
	 * @return n int
	 */
	public static int validateInt(Scanner sc) {
		int n = readInt(sc);
		boolean isValid = false;
		while (!isValid) {
			if (n > 0) {
				isValid = true;
			} else {
				System.out.println("Number must be greater than 0.");
				n = readInt(sc);
			}
		}
		
		return n;
	}
	
	/**
	 * Determines if the input is an int.
	 * 
	 * @param sc Scanner
	 * @return returnInt int
	 */
	public static int readInt(Scanner sc) {
		int roReturn = 0;
		
		boolean hasNum = false;
		while (!hasNum) {
			System.out.println("Enter a number: ");
			if (sc.hasNextInt()) {
				roReturn = sc.nextInt();
				hasNum = true;
			} else {
				System.out.println("Number must actually be a number.");
				hasNum = false;
				sc.nextLine();
			}
		}
		
		return roReturn;
		
	}
}
