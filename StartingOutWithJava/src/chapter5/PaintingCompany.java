/*
 * PaintingCompany.java
 * Ronny Rosabal
 * Programming Fundamentals I
 * COSC 1336 2003 6W2
 * 08.09.16
 * To calculate and display the total cost of a paint job.
 * */


/*PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate and display total cost of a paint job.
 * INPUT:   Number of rooms, square feet for each room, price of paint per gallon.
 * PROCESS: Calculate the total square footage and add the paint costs to labor cost.
 * OUTPUT:  Display cost break down of the total costs of the job.
 */

package chapter5;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PaintingCompany {

	public static void main(String[] args) {
		
		DecimalFormat dollars = 
				new DecimalFormat("$#,##0.00");		// holds the format for the US currency
		final double LABOR_RATE = 20.00,			// holds the rate per hour for labor
				FEET_RATE =  100,					// holds the amount of feet to calculate costs
				LABOR_HOURS = 8;					// holds the hours per FEET_RATE to charge
		int rooms;									// holds the number of rooms
		double footage,								// holds the square footage of all the rooms
				paintCost,							// holds the cost of the paint
				laborCost,							// holds the cost of the labor
				totalCost,							// holds the total cost of labor
				gallonsPrice;						// holds the price per gallon
		
		
		// get the number of rooms and convert it to an integer 
		rooms = getRooms();
		// get the price per gallon of the paint
		gallonsPrice = getPaintPrice();
		// get the square footage for each room
		footage = calcFootage( rooms );
		// calculate the paint cost
		paintCost = paintCost(gallonsRequired(footage, FEET_RATE), gallonsPrice);
		// calculate the labor cost
		laborCost = laborCost(LABOR_RATE, laborRequired( footage, FEET_RATE, LABOR_HOURS));
		// calculate the total cost
		totalCost = totalCost( paintCost, laborCost );
		// display costs
		JOptionPane.showMessageDialog(null, displayCosts(paintCost, laborCost, totalCost, dollars));
		

	}
	
	///////////////////////////////////////
	// GET USER INPUT
	///////////////////////////////////////
	
	/**
	 * Gets the price per gallon of the paint
	 * 
	 * @return the price per gallon
	 */
	public static double getPaintPrice(){
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price of paint per gallons without the '$' symbol."));
	}
	
	/**
	 * Gets the number of rooms from the user
	 * 
	 * @return number of rooms to be calculated
	 */
	public static int getRooms(){
		return Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of rooms."));
	} 
	
	/**
	 * Gets the square footage for each room
	 * 
	 * @param room - the specific room
	 * @return the square footage of the specific room
	 */
	public static double getRoomSize( int room ){
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the square feet for room " + room));
	}
	
	///////////////////////////////////////
	// CALCULATE FEET
	///////////////////////////////////////
	
	/**
	 * Calculates the total square footage of all the rooms.
	 * 
	 * @param rooms - The number of rooms to be calculated
	 * @return total square footage of all the rooms
	 */
	public static double calcFootage( int rooms ){
		double squareFeet = 0;
		
		for( int i = 1; i <= rooms; i++ ){
			squareFeet += getRoomSize( i );
		}
		
		return squareFeet;
	}
	
	///////////////////////////////////////
	// CALCULATE PAINT
	///////////////////////////////////////
	
	/**
	 * Calculates and returns the total number of gallons required.
	 * 
	 * @param totalFeet - the total square footage of all the rooms
	 * @param feetRate - the rate at which gallons are calculated
	 * @return the total amount of gallons required for the paint job
	 */
	public static double gallonsRequired( double totalFeet, double feetRate ){
		return totalFeet / feetRate;
	}
	
	/**
	 * Calculates and returns the total cost of the paint.
	 * 
	 * @param totalGallons - the total number of paint required
	 * @param price - price of the paint per gallon
	 * @return the total paint cost
	 */
	public static double paintCost( double totalGallons, double price ){
		return totalGallons * price;
	}
	
	///////////////////////////////////////
	// CALCULATE LABOR
	///////////////////////////////////////
	
	/**
	 * Calculates and return the total numbers of labors hours required.
	 * 
	 * @param totalFeet - the total square footage of all the rooms
	 * @param feetRate - number of feet used to calculate labor
	 * @param laborHour - number of labor hours per feetRate
	 * @return the total number of labor hours
	 */
	public static double laborRequired( double totalFeet, double feetRate, double laborHour ){
		double totalLabor = 0;
		
		if( totalFeet >= feetRate ){
			totalLabor += (int)(totalFeet / feetRate) * laborHour;
		}
		
		if( totalFeet % feetRate != 0 ){
			totalLabor += (( totalFeet % feetRate ) / 100) * laborHour;
		}
		return totalLabor;
	}
	
	/**
	 * Calculates and returns the total cost of the labor.
	 * 
	 * @param payRate - price rate per labor hour
	 * @param laborHours - the total number of labor hours required
	 * @return the total labor cost
	 */
	public static double laborCost( double payRate, double laborHours ){
		return payRate * laborHours;
	}
	
	///////////////////////////////////////
	// CALCULATE TOTAL
	///////////////////////////////////////
	
	/**
	 * Calculates the total cost of the paint job.
	 * 
	 * @param paintCost - the total cost of the paint
	 * @param laborCost - the total cost of the labor
	 * @return
	 */
	public static double totalCost( double paintCost, double laborCost ){
		return paintCost + laborCost;
	}
	
	///////////////////////////////////////
	// DISPLAY RESULTS
	///////////////////////////////////////
	
	/**
	 * Displays a breakdown and total cost of the paint job
	 * @param paint - cost of the paint
	 * @param labor - cost of the labor
	 * @param total - cost of total job
	 * @param currency - the format for the currency
	 * @return formatted cost of the paint and labor
	 */
	public static String displayCosts( double paint, double labor, double total, DecimalFormat currency ){
		String paintFormat = currency.format(paint);
		String laborFormat = currency.format(labor);
		String totalFormat = currency.format(total);
		String output = "Labor\t\t" + laborFormat + "\n" +
						"Paint\t\t" + paintFormat + "\n" +
						"------------\n" + 
						"Total\t\t" + totalFormat;
		return output;
	}

}
