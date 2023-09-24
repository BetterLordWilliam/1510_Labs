package mainer;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("#.##");
		 
		int x1;
		int y1;
		int x2;
		int y2;
		
		// Obtain the points
		System.out.println("Enter first coodrinate pair: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter second coodrinate pair: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		// Calculate distance
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) 
				+ Math.pow((y2 - y1), 2));
		
		// Display the distance to the user
		System.out.println("The distance between these two points is: " + distance);
		
		// Refining the Results
		System.out.println("Formatted: " + dc.format(distance));
		
		sc.close();
	}
}
