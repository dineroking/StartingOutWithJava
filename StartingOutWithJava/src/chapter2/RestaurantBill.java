/*
 * Challenge:  13. Restaurant Bill
 * Date:   	   09.04.16
 * Objective:  Calculates the tax, tip and total amount of a meal
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: Calculates the tax, tip and total amount of a meal.
 * INPUT:	The price of the meal, and the tip percentage.
 * PROCESS: Calculate the tax amount of the meal afterwards calculate the tip amount and 
 * 			find the total amount.
 * OUTPUT:	The price of the meal, tax amount with tax rate, tip amount with tip rate and
 * 			the total amount for the meal.
 */
package chapter2;

import javax.swing.JOptionPane;

public class RestaurantBill {

	public static void main(String[] args) {
		
		// VARIABLES 
		double price,					// meal price
			   tax,						// tax amount
			   tip,						// tip amount
			   taxRate = .065,			// tax rate
			   tipRate;					// tip rate
		
		// USER INPUT
		price = getMealPrice();
		tipRate = getTipRate();
		
		// CALCULATE TOTALS
		tax = calcTax(price, taxRate);
		tip = calcTip(price, taxRate, tipRate);
		
		// USER OUTPUT
		displayMessage(price, tax, tip);

	}
	
	/**
	 * Gets the input from the user
	 * @param message - the message to ask the user for input
	 * @return - user input
	 */
	public static double input( String message ){
		double input;
		input = Double.parseDouble( JOptionPane.showInputDialog( message ) );
		return input;
	}
	
	/**
	 * Gets the meal price from the user
	 * @return the meal price
	 */
	public static double getMealPrice(){
		return input( "Enter meal price: " );
	}
	
	/**
	 * Gets the tip rate paid for the meal
	 * @return tip rate
	 */
	public static double getTipRate(){
		return input( "Enter tip rate: ");
	}
	
	/**
	 * Calculates the tip to be added to the meal
	 * @param mealPrice
	 * @param tipRate
	 * @return
	 */
	public static double calcTip( double mealPrice, double taxRate, double tipRate ){
		return (mealPrice + calcTax( mealPrice, taxRate )) * ( tipRate / 100 );
	}
	
	/**
	 * Calculates the tax amount of the meal.
	 * @param mealPrice - the price of the meal
	 * @param taxRate - the tax rate
	 * @return the tax amount
	 */
	public static double calcTax( double mealPrice, double taxRate ){
		return mealPrice * taxRate;
	}
	
	/**
	 * Calculates the total amount to be paid.
	 * @param meal - the price of the meal
	 * @param tax - the tax amount
	 * @param tip - the tip amount
	 * @return the total amount for the meal
	 */
	public static double calcTotal( double meal, double tax, double tip ){
		return meal + tax + tip;
	}
	
	/**
	 * Displays the meal, tax, tip and total amount.
	 * @param meal - the price of the meal
	 * @param tax - the amount of tax
	 * @param tip - the amount of tip
	 */
	public static void displayMessage( double meal, double tax, double tip ){
		System.out.printf("Meal $%5.2f", meal );
		System.out.printf("\nTax $%5.2f", tax );
		System.out.printf("\nTip $%5.2f", tip );
		System.out.printf("\nTotal $%5.2f", calcTotal(meal, tax, tip));
	}
	

}
