/*
 * Challenge:  19. Stock Transaction Program
 * Date:       09.15.16
 * Objective:  Calculate stock purchase including commission, stock sale including
 * 			   commission and profit made or loss.
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: Calculate stock purchase, sale, and profit after commissions
 * INPUT:	Number of shares, purchase price, sale price, commission rate
 * PROCESS: Multiply purchase price by number of share and add commission.
 * 			Multiple sale price by number of shares and add commission.
 * 			Subtract purchase amount from sale amount.
 * OUTPUT:	Total purchase amount before and after commission. The total sale
 * 			amount before and after commission and the profit amount.
 */
package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class StockTransactionProgram {

	public static void main(String[] args) {
		
		// VARIABLES
		final double commissionRate = 0.02;		// the rate of commission
		double shares,							// number of shares purchased
		       pPrice,							// purchase price per share
		       pAmount,							// purchase amount before commission
		       pCommission,						// purchase commission amount
		       pTotal,							// total purchase amount
		       sPrice,							// sale price per share
		       sAmount,							// sale amount before commission
		       sCommission,						// sale commission amount
		       sTotal,							// total sale amount
		       profit;							// total profit amount
		String output;							// string to be printed
		DecimalFormat money = new DecimalFormat("$#,###.00");
		
		// USER INPUT
		shares = getShares();
		pPrice = getPurchasePrice();
		sPrice = getSellPrice();
		
		// CALCULATIONS
		pAmount = calcAmount(pPrice, shares);
		pCommission = calcCommission(pAmount, commissionRate);
		pTotal = calcTotalAmount(pAmount, pCommission);
		sAmount = calcAmount(sPrice, shares);
		sCommission = calcCommission(sAmount, commissionRate);
		sTotal = calcTotalAmount(sAmount, sCommission);
		profit = calcProfit(sAmount - pAmount, pCommission + sCommission);
		
		// USER OUTPUT
		output = "Purchase:\t\t\t" + money.format(pAmount);
		output += "\nCommission:\t\t" + money.format(pCommission);
		output += "\nTotal Purchase:\t" + money.format(pTotal);
		output += "\n\nSale:\t\t\t\t" + money.format(sAmount);
		output += "\nCommission:\t\t" + money.format(sCommission);
		output += "\nTotal Sale:\t" + money.format(sTotal);
		output += "\n_____________________________";
		output += "\nProfit:\t\t\t\t\t\t" + money.format(profit);
		
		displayResults(output);

	}
	/**
	 * Gets user input
	 * @param msg - message to ask user
	 * @return user input
	 */
	public static String input( String msg ){
		return JOptionPane.showInputDialog(null, msg);
	}
	
	/**
	 * Gets the amount of shares purchased
	 * @return number of shares
	 */
	public static double getShares(){
		return Double.parseDouble( input("Enter number of shares.") );
	}
	
	/**
	 * Get purchase price per share
	 * @return purchase price per share
	 */
	public static double getPurchasePrice(){
		return Double.parseDouble( input("Enter the purchase price of shares.") );
	}
	
	/**
	 * Gets the sale price per share
	 * @return sale price per share
	 */
	public static double getSellPrice(){
		return Double.parseDouble( input("Enter the sell price of the shares.") );
	}
	
	/**
	 * Calculates the amount of the transaction
	 * @param price - price per share
	 * @param shares - number of shares
	 * @return amount of the transaction
	 */
	public static double calcAmount( double price, double shares ){
		return price * shares;
	}
	
	/**
	 * Calculates the commission amount
	 * @param amount - the amount of the transaction
	 * @param rate - commission rate
	 * @return amount of commission
	 */
	public static double calcCommission( double amount, double rate ){
		return amount * rate;
	}
	
	/**
	 * Calculates the total amount including commission
	 * @param amount - amount of the transaction
	 * @param commission - commission amount
	 * @return total amount including commission
	 */
	public static double calcTotalAmount( double amount, double commission ){
		return amount + commission;
	}
	
	/**
	 * Calculates the profit or losses made
	 * @param amount - difference of transaction amounts
	 * @param commission - sum of commission amounts
	 * @return profit amount
	 */
	public static double calcProfit( double amount, double commission ){
		return amount - commission;
	}
	
	/**
	 * Prints message to the user
	 * @param msg - message to be printed
	 */
	public static void displayResults( String msg ){
		JOptionPane.showMessageDialog( null, msg );
	}

}
