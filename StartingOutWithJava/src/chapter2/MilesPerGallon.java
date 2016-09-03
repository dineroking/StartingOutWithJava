/*
 * Challenge:  9. Miles per Gallon
 * Date:	   09.03.16
 * Objective:  Calculates the miles per gallon of a car
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate the miles per gallon usage of a car
 * INPUT:	The miles driven and gallons used
 * PROCESS: Divide the miles driven by the gallons used
 * OUTPUT: 	The miles per gallon
 */
package chapter2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MilesPerGallon {

	public static void main(String[] args) {
		
		// VARIABLES
		
		double miles,					// the miles driven
			   gallons,					// gallons used
			   mileage;					// miles per gallon
		
		// USER INPUT
		
		miles = getMiles();
		gallons = getGallons();
		
		// CALCULATE MILEAGE
		
		mileage = calcMileage( miles, gallons );
		
		// USER OUTPUT
		
		displayResults( mileage );
		
		System.exit(0);

	}
	
	/**
	 * Gets the number of miles driven
	 * @return the number of miles driven
	 */
	public static double getMiles(){
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Enter miles driven."));
	}
	
	/**
	 * Gets the gallons used 
	 * @return the gallons used 
	 */
	public static double getGallons(){
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Enter gallons used."));
	}
	
	/**
	 * Calculates the miles per gallon
	 * @param milesDriven - number of miles driven
	 * @param gallonsUsed - number of gallons used
	 * @return miles per gallon
	 */
	public static double calcMileage( double milesDriven, double gallonsUsed ){
		return milesDriven / gallonsUsed;
	}
	
	/**
	 * Displays the miles per gallon
	 * @param mileage - miles per gallon
	 */
	public static void displayResults( double mileage ){
		DecimalFormat gFormat = new DecimalFormat("##.00");
		JOptionPane.showMessageDialog(null, "Your car does " + gFormat.format(mileage) 
		+ " miles per gallon.");
	}

}
