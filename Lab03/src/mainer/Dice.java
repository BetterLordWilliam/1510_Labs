package mainer;

import java.util.Random;
import java.util.Scanner;

/**
 * Dice Simulator.
 * 
 * @author Will Otterbein
 * @version 2023-1
 * 
 */
public class Dice {

	/**
	 * Drives the Program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		final int startNum = 1;
		final int accMod = 1;
		
		final int d4 = 4;
		final int d6 = 6;
		final int d10 = 10;
		final int d12 = 12;
		final int d20 = 20;
		
		int cont = 1;
		
		// Calculate Dice Rolls
		while (cont == 1) {
			System.out.println("d4 roll: " + rand.nextInt(startNum, (d4 + accMod)));
			System.out.println("d6 roll: " + rand.nextInt(startNum, (d6 + accMod)));
			System.out.println("d10 roll: " + rand.nextInt(startNum, (d10 + accMod)));
			System.out.println("d12 roll: " + rand.nextInt(startNum, (d12 + accMod)));
			System.out.println("d20 roll: " + rand.nextInt(startNum, (d20 + accMod)));
			System.out.print("Enter 1 to continue: ");
			cont = sc.nextInt();
		}
		sc.close();
	}

}
