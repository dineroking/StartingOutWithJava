/*
 * Challenge:  8. Cookie Calories
 * Date: 	   09.03.16
 * Objective:  Calculates the amount of cookie calories consumed
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate the amount of cookies calories consumed 
 * INPUT:   The number of cookies consumed
 * PROCESS: Find cookies per serving. Find calories per serving. Calculate serving size
 *  		consumed and multiply it by the calories per serving.
 * OUTPUT:	The number of calories consumed and the amount of calories.
 */
package chapter2;

import javax.swing.JOptionPane;

public class CookieCalories {

	public static void main(String[] args) {
		
		// VARIABLES
		final double caloriesPerServing = 300,			// Number of calories per serving
				     cookiesPerServing = 4;				// Number of calories per serving
		double cookies,									// Cookies consumed
			   calories;								// Calories consumed
		
		// USER INPUT
		
		cookies = getCookies();
		
		// CALCULATE CALORIES
		
		calories = calcCalories( calcCookieSize( cookiesPerServing, cookies ), caloriesPerServing );
		
		// USER OUTPUT
		
		displayResults(cookies, calories);
		
		System.exit(0);

	}
	
	/**
	 * Gets the number of cookies eaten by the user
	 * @return number of cookies eaten
	 */
	public static double getCookies(){
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number of cookies eaten."));
	}
	
	/**
	 * Calculates the amount of cookie servings consumed
	 * @param cookiesPerServing - cookies per serving
	 * @param cookiesConsumed - number of cookies consumed
	 * @return cookie servings consumed
	 */
	public static double calcCookieSize( double cookiesPerServing, double cookiesConsumed ){
		return cookiesConsumed / cookiesPerServing;
	}
	
	/**
	 * Calculates the amount of calories consumed
	 * @param cookieServings - The amount of cookie servings consumed
	 * @param caloriesPerServing - The amount of calories per serving
	 * @return calories consumed
	 */
	public static double calcCalories( double cookieServings, double caloriesPerServing ){
		return cookieServings * caloriesPerServing;
	}

	/**
	 * Displays the number of calories consumed by the user
	 * @param cookieAmt - Number of cookies consumed
	 * @param caloriesConsumed - Number of calories consumed
	 */
	public static void displayResults( double cookieAmt, double caloriesConsumed ){
		JOptionPane.showMessageDialog(null, cookieAmt + " cookies are " + caloriesConsumed + " calories.");
	}
}
