/*
 * Challenge:  11. Circuit Board Profit
 * Date: 	   09.04.16
 * Objective:  Calculate the profit of a product
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate the profit amount of a product based on its selling price
 * INPUT:	Product price.
 * PROCESS: Multiply the product selling price by the predetermined profit margin.
 * OUTPUT: 	The product's selling price and the profit made.
 */

package chapter2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircuitBoardProfit {

	public static void main(String[] args) {
		
		// VARIABLES
		double productPrice,					// The price of the product
			   profitMargin = .4,				// The profit margin of the product
			   profit;							// The profit of the product
		
		// USER INPUT
		productPrice = getPrice();
		
		// CALCULATE PROFIT
		profit = calcMargin(productPrice, profitMargin);
		
		// USER OUTPUT
		displayResults( productPrice,  profit );

	}
	
	/**
	 * Gets the price of the product.
	 * @return the price of the product
	 */
	public static double getPrice(){
		double input;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the price of the product: ");
		input = keyboard.nextDouble();
		keyboard.close();
		return input;
	}
	
	/**
	 * Calculates the profit of a product
	 * @param price - the price of the product
	 * @param margin - the profit margin of the product
	 * @return the profit of the product
	 */
	public static double calcMargin( double price, double margin ){
		return price * margin;
	}
	
	/**
	 * Displays the price and profit of the product
	 * @param price - the price of the product
	 * @param profit - the profit of the product
	 */
	public static void displayResults( double price, double profit ){
		DecimalFormat money = new DecimalFormat("$#,###.00");
		String output = "The price is:\t\t" + money.format(price);
		output += "\nThe profit is:\t\t" + money.format(profit);
		System.out.println(output);
	}

}
