/*
 * Challenge: 6. Land Calculation
 * Date: 		 08.29.16
 */

package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LandCalculation {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);			// holds the input made from a keyboard
		final int ACRE = 43560;								// the size of one acre in square feet
		double landSize;									// total size in square feet
		double landAcre;									// total size in acres
		DecimalFormat sizeFormat;							// format for land size
		
		sizeFormat = new DecimalFormat("#,###.00");
		
		// get user input
		
		System.out.print("Enter the square footage of your land: ");
		landSize = Double.parseDouble( keyboard.nextLine() );
		landAcre = landSize / ACRE;
		
		// give user the results
		
		System.out.println("You have " + sizeFormat.format( landAcre ) + " acres of land.");
		
		keyboard.close();
	}

}
