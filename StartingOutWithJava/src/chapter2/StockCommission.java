/*
 * Challenge:  15. Stock Commission
 * Date: 	   09.09.16
 * Objective:  Calculate the amount commission paid for a stock transaction
 * 			   and display the commission and total
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate the total amount for a stock purchase transaction including
 * 			the commission paid.
 * INPUT:	The number of shares bought and the price paid per share.
 * PROCESS:	Calculate the total amount of the transaction and multiply that
 * 			by the percentage of commission to be paid
 * OUTPUT:	The purchase amount, the commission and the total amount paid.
 */

package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class StockCommission {

	public static void main(String[] args) {

		// VARIABLES
		final double COMMISSION_RATE = .02;			// commission rate
		double shares,								// number of shares
		       price,								// price per shares
		       commission,							// commission amount
		       total;								// total amount before commission
		
		// USER INPUT
		shares = getShares();
		price = getPrice();
		
		// CALCULATE TOTALS
		total = calcTotal(shares, price);
		commission = calcCommission(total, COMMISSION_RATE);
		
		// USER OUTPUT
		displayResults(total, commission);
	}
	
	/**
	 * The input from the user
	 * @param msg - the message to ask the user
	 * @return the input from the user
	 */
	public static String input( String msg ){
		return JOptionPane.showInputDialog( null, msg );
	}
	
	/**
	 * Gets the number of shares bought
	 * @return number of shares
	 */
	public static double getShares(){
		return Double.parseDouble( input( "Enter number of shares bought." ) );
	}
	
	/**
	 * Gets the price per share
	 * @return price per share
	 */
	public static double getPrice(){
		return Double.parseDouble( input( "Enter price per share." ) );
	}
	
	/**
	 * Calculates the total before commission
	 * @param shares - total number of shares
	 * @param price - price per share
	 * @return total number of commission
	 */
	public static double calcTotal( double shares, double price ){
		return shares * price;
	}
	
	/**
	 * Calculates the amount of commission
	 * @param total - total before commission 
	 * @param rate - rate of commission
	 * @return the amount of commission
	 */
	public static double calcCommission( double total, double rate ){ 
		return total * rate;
	}
	
	/**
	 * Displays the total before commission, commission amount and total
	 * @param total - total before commission
	 * @param commission - commission
	 */
	public static void displayResults( double total, double commission ){
		DecimalFormat money = new DecimalFormat("$#,###.00");
		String output = "";
		output += "Purchase:\t\t\t" + money.format(total);
		output += "\nCommission:\t\t" + money.format(commission);
		output += "\nTotal:\t\t\t\t\t\t" + money.format( total + commission );
		JOptionPane.showMessageDialog( null, output );
	}

}
