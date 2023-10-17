package main;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author blink
 *
 */
public class BaseballStats {
	
    /*
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     */
    public static void main (String[] args) throws FileNotFoundException {
        // Important Declarations
    	Scanner fileScan;
        Scanner lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);

        // Get the filename from the user
        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File("src/mainer/" + fileName));
        
        // Outer loop ==> Loops over the lines in the files one at a time
        while (fileScan.hasNextLine()) {
        	lineScan = new Scanner(fileScan.nextLine());
        	lineScan.useDelimiter(",");
        	String name = lineScan.next();
        	System.out.print(name + " (");
        	
        	int hCount = 0;
        	int oCount = 0;
        	int wCount = 0;
        	int sCount = 0;
        	
        	// Inner loop ==> Loops over the tokens delimited by commas
        	while (lineScan.hasNext()) {
        		String token = lineScan.next();
        		System.out.print(token);
        		if (token.equals("h"))
        			hCount++;
        		if (token.equals("o"))
        			oCount++;
        		if (token.equals("w"))
        			wCount++;
        		if (token.equals("s"))
        			sCount++;
        	}
        	
        	System.out.print(")");
        	
        	// Calculate average and display results
        	double average = (double) hCount / (hCount + oCount);
        	
        	System.out.println();
        	System.out.print(" average: " + average + ", hits: " + hCount + ", outs: " 
        			+ oCount + ", walks: " + wCount + ", sacrafices: " + sCount);
        	System.out.println();
        }
        
        scan.close();
    }
}
