/*
 * Challenge:  16. Energy Drink Consumption
 * Date: 	   09.09.16
 * Objective:  Calculates the number of people that like to drink energy drinks
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate the number of of people from a survey that like to drink
 * 			energy drinks and the number of those that like the citrus flavor.
 * INPUT:	The survey sample size.
 * PROCESS:	Multiply sample size by the percentage of energy drinkers and multiply 
 * 			results by the percentage of citrus drinkers
 * OUTPUT:	The number of energy drink customers and the ones that like the citrus flavor
 */
package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EnergyDrinkConsumption {

	public static void main(String[] args) {
		
		// VARIABLES
		final double ENERGY_DRINKERS_RATE = .14,		// The rate of people that like energy drinks
				     CITRUS_DRINKERS_RATE = .64;		// The rate of energy drinkers that like citrus flavor
		int sampleSize;									// The total number of people surveyed
		double energyDrinkers,							// The number of people that like energy drinks
			   citrusDrinkers;							// The number of energy drinkers that like citrus
		
		// USER INPUT
		sampleSize = getSampleSize();

		// CALCULATIONS
		energyDrinkers = calcEnergyDrinkers(sampleSize, ENERGY_DRINKERS_RATE);
		citrusDrinkers = calcCitrusDrinkers(energyDrinkers, CITRUS_DRINKERS_RATE);
		
		// USER OUTPUT
		displayResults( sampleSize, energyDrinkers, citrusDrinkers);

	}
	
	/**
	 * Gets the total number of people surveyed 
	 * @return number of people surveyed
	 */
	public static int getSampleSize(){
		return Integer.parseInt( JOptionPane.showInputDialog(null, "Enter number of surveyed people."));
	}
	
	/**
	 * Calculates the number of energy drinkers in a given sample
	 * @param sampleSize - The total number of people surveyed
	 * @param rate - The rate of people that like energy drinks
	 * @return the number of people that like energy drinks
	 */
	public static double calcEnergyDrinkers( int sampleSize, double rate ){
		return sampleSize * rate;
	}
	
	/**
	 * Calculates the number of energy drinkers that like the citrus flavor
	 * @param drinkers - Number of energy drinkers.
	 * @param rate - The rate of energy drinkers that like citrus
	 * @return number of energy drinkers that like citrus flavor
	 */
	public static double calcCitrusDrinkers( double drinkers, double rate ){
		return drinkers * rate;
	}
	
	/**
	 * Displays the number of energy drinkers and the number that like citrus flavor
	 * @param size - the total number of people surveyed
	 * @param energy - number of energy drink drinkers
	 * @param citrus - number of energy drinkers that like citrus flavor
	 */
	public static void displayResults( int size, double energy, double citrus ){
		String output = "Out of " + size + " people. ";
			   output +=  "Approximately " + (int)energy + " drink energy drinks, ";
			   output += "and " + (int)citrus + " like the citrus-flavored drinks.";
			   
		System.out.println( output );
	}

}
