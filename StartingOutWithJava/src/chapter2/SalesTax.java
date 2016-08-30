/*
 * Challenge: 7. Sales Tax
 * Date: 		 08.29.16
 * Objective: 	 To calculate the sales tax of a purchase
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE:	Calculate and display the sales tax and total price of a purchase.
 * INPUT: 	The purchase amount, the state tax rate and county tax rate.
 * PROCESS: Multiply the purchase amount by the state tax and county tax and then add the
 * 			results to the purchase amount
 * OUTPUT:	The original purchase amount, the state tax currency amount, the county tax 
 * 			currency amount and the total price amount.
 */

package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SalesTax {

	public static void main(String[] args) {
		
		// VARIABLES 
		
		double purchase = 0.0;					// the purchase amount before taxes
		double stateTaxRate = 0.0;				// the state sales tax rate
		double stateTaxAmt = 0.0; 				// state tax dollar amount 
		double countyTaxRate = 0.0;				// the county sales tax rate
		double countyTaxAmt = 0.0;				// county tax dollar amount
		double totalPrice = 0.0;				// the total price after taxes
		String input = "";						// the user input
		String output = "";						// the user output
		DecimalFormat currency;					// the format for currency
		
		currency = new DecimalFormat("$#,###.00");
		
		// USER INPUT
		
		input = JOptionPane.showInputDialog(null, "Enter purchase price.");
		purchase = Double.parseDouble( input );
		input = JOptionPane.showInputDialog(null, "Enter state tax rate.");
		stateTaxRate = Double.parseDouble( input ) / 100;
		input = JOptionPane.showInputDialog( null, "Enter county tax rate." );
		countyTaxRate = Double.parseDouble( input ) / 100;
		
		// CALCULATE TAX
		
		stateTaxAmt = purchase * stateTaxRate;
		countyTaxAmt = purchase * countyTaxRate;
		totalPrice = purchase + stateTaxAmt + countyTaxAmt;
		
		// USER OUTPUT
		
		output += "Purchase price:\t\t" + currency.format( purchase );
		output += "\nState Tax:\t\t" +  currency.format( stateTaxAmt );
		output += "\nCounty Tax:\t\t" + currency.format( countyTaxAmt );
		output += "\nTotal Price:\t\t" + currency.format( totalPrice );
		
		System.out.println( output );
		
		
		
		System.exit(0);

	}

}
