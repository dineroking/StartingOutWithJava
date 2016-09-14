/*
 * Challenge:  17. Ingredient Adjuster
 * Date: 	   09.09.16
 * Objective:  Calculates right amount of ingredients based on desired output of cookies
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE:
 * INPUT:
 * PROCESS:
 * OUTPUT:
 */
package chapter2;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class IngredientAdjuster {

	public static void main(String[] args) {

		// VARIABLES
		final double SUGAR = 1.5,			// cups of sugar per 48 cookies
				     BUTTER = 1.0,			// cups of butter per 48 cookies
				     FLOUR = 2.75,			// cups of flour per 48 cookies
				     COOKIES = 48;			// cookies made from predetermined ingredients
		double ratio,						// ratio for new recipe
		       newSugar,					// amount of sugar for new recipe
		       newFlour,					// amount of flour for new recipe
		       newButter,					// amount of butter for new recipe
		       newCookies;					// amount of cookies in the new recipe
		
		// INPUT
		newCookies = getCookies();
		
		// CALCULATIONS
		ratio = calcCookieRatio(newCookies, COOKIES);
		newSugar = calcSugar(ratio, SUGAR);
		newFlour = calcFlour(ratio, FLOUR);
		newButter = calcButter(ratio, BUTTER);
		
		// OUTPUT
		displayResults(newCookies, newSugar, newButter, newFlour);
	}
	
	/**
	 * Gets from user number of cookies to be made
	 * @return number of cookies to be made
	 */
	public static double getCookies(){
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Enter number of cookies for recipe."));
	}
	
	/**
	 * Calculates the rate to be used for the ingredients
	 * @param cookies - amount of cookies to be made
	 * @param recipeCookies - amount of cookies in the original recipe
	 * @return the ratio to be used to find number of ingredients
	 */
	public static double calcCookieRatio( double cookies, double recipeCookies ){
		return cookies / recipeCookies;
	}
	
	/**
	 * Calculates the amount of sugar for the different amount of cookies
	 * @param rate - rate to be used for new ingredients
	 * @param sugar - sugar in the original recipe
	 * @return amount of sugar in the new recipe
	 */
	public static double calcSugar( double rate, double sugar ){
		return rate * sugar;
	}
	
	/**
	 * Calculates the amount of butter for the new recipe
	 * @param rate - rate to be used for new ingredients
	 * @param butter - butter in the original recipe
	 * @return amount of butter in the new recipe
	 */
	public static double calcButter( double rate, double butter ){
		return rate * butter;
	}
	
	/**
	 * Calculates the amount of flour for the new recipe
	 * @param rate - rate to be used for new ingredients
	 * @param flour - flour in the original recipe
	 * @return amount of flour in the new recipe
	 */
	public static double calcFlour( double rate, double flour ){
		return rate * flour;
	}
	
	/**
	 * Displays the ingredients needed for the new recipe
	 */
	public static void displayResults( double cookies, double sugar, double butter, double flour ){
		DecimalFormat recipe = new DecimalFormat("###.00");
		String output = "Cookies:\t\t" + recipe.format(cookies);
		output += "\nSugar:\t\t" + recipe.format(sugar);
		output += "\nButter:\t\t" + recipe.format(butter);
		output += "\nFlour:\t\t" + recipe.format(flour);
		JOptionPane.showMessageDialog(null, output);
	}

}
