/*
 * Challenge:  14. Male and Female Percentages
 * Date: 	   09.05.16
 * Objective:  Calculates the percentage of males and females in a class
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE:	Calculates the percentage of males and females in a class
 * INPUT:	The number of males and the number of females in a class
 * PROCESS:	Divide the number of males by the total of students and divide the
 * 			total of females by the total of students
 * OUTPUT:	The total number of students in a class. The percentage of the class
 * 			that are male and the percentage of the class that are females.
 */
package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MaleAndFemale {

	public static void main(String[] args) {

		// VARIABLES
		int maleStudents,							// number of male students in the class
			femaleStudents,							// number of female students in the class
			totalStudents;							// total number of students in the class	
		double malePercentage,						// percentage of male students in the class
			   femalePercentage;					// percentage of female students in the class
		
		// USER INPUT
		maleStudents = getMales();
		femaleStudents = getFemales();
		
		// CALCULATE PERCENTAGES
		totalStudents = maleStudents + femaleStudents;
		malePercentage = calcPercent(maleStudents, totalStudents);
		femalePercentage = calcPercent(femaleStudents, totalStudents);
		
		// USER OUTPUT		
		displayResults(malePercentage, femalePercentage);
	}
	
	/**
	 * Asks user for input
	 * @param msg - the message to ask for input
	 * @return the user input as a string
	 */
	public static String input( String msg ){
		return JOptionPane.showInputDialog( null, msg );
	}
	
	/**
	 * Gets the number of male students in the class
	 * @return number of male students in the class
	 */
	public static int getMales(){
		return Integer.parseInt( input("Enter the number of male students.") );
	}
	
	/**
	 * Gets the number of female students in the class
	 * @return number of female students in the class
	 */
	public static int getFemales(){
		return Integer.parseInt( input("Enter the number of female students.") );
	}
	
	/**
	 * Calculates the percentage of two numbers
	 * @param numerator - the number above the fraction
	 * @param denominator - the number below the fraction
	 * @return the percentage between two numbers
	 */
	public static double calcPercent( int numerator, int denominator ){
		return ( (double)numerator / denominator);
	}
	
	/**
	 * Displays the percentage of male and female students
	 * @param malePercentage
	 * @param femalePercentage
	 */
	public static void displayResults( double malePercentage, double femalePercentage ){
		DecimalFormat percent = new DecimalFormat("#%");
		JOptionPane.showMessageDialog(null, "There are " + percent.format(malePercentage) +
				" of males and " + percent.format(femalePercentage) + " of females in the class.");
	}

}
