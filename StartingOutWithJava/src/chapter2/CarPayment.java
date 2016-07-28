/*
 * CarPayment.java
 * Ronny Rosabal
 * Programming Fundamentals I
 * COSC 1336 2003 6W2
 * 07.16.16
 * A small company want you to develop a small application to keep customers informed when trying to purchase a new car.
 * */


/*PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate the monthly payment of a car
 * INPUT:   Number of financed months, rate of loan, price of car
 * PROCESS: price (rate/12)/ (1 - (1 + (rate/12))^-months)
 * OUTPUT:  Display a dialog box that displays the monthly payment
 */

package chapter2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CarPayment {

	public static void main(String[] args) {
		int months;
		double rate, loan, payment;
		
		//get input from user for loan length in months, interest rate, and loan amount
		//and assign it to its corresponding variable after converting it to a number.
		
		months = Integer.parseInt(JOptionPane.showInputDialog("Enter length of loan in months."));
		rate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate. i.e. 7% = 7"));
		loan = Double.parseDouble(JOptionPane.showInputDialog("Enter total loan amount without $ sign."));
		
		//convert the interest rate into a decimal
		
		rate = rate / 100;
		
		//use payment formula to find out monthly payment formula by plugging in input values
		//and assign it to the payment variable
		
		payment = loan * (rate / 12) / (1 - Math.pow((1 + (rate / 12)), -1 * months));
		
		//round the value in payment to two decimal places and reassign it back to payment variable
		
		DecimalFormat df = new DecimalFormat("#.##");
		payment = Double.parseDouble(df.format(payment));
		
		//show user a dialog with the calculated monthly payment amount
		
		JOptionPane.showMessageDialog(null, "Your monthly car payment is $" + payment + ".");
		
		System.exit(0);
	}

}
