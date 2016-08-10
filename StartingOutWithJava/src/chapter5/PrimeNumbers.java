/*
 * PrimeNumbers.java
 * Ronny Rosabal
 * Programming Fundamentals I
 * COSC 1336 2003 6W2
 * 08.10.16
 * To calculate and display if a number is a prime number and a range of prime numbers.
 * */


/*PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate and display if a number is a prime number and a range of prime numbers.
 * INPUT:   Type of calculation, number to be tested or for range.
 * PROCESS: Tests the number to see if it is a prime number or for its range.
 * OUTPUT:  Display the results of the tested number.
 */

package chapter5;

import javax.swing.JOptionPane;
import java.io.*;

public class PrimeNumbers {

	public static void main(String[] args){
		
		displayOptions();

	}
	
	
	/**
	 * Calculates if a given number is prime.
	 * 
	 * @param number - number to be tested
	 * @return true if number is prime or false if the number is not prime
	 */
	public static boolean isPrime( int number ){
		// find half of number and store it as an integer in variable half 
		int half = (int)(number / 2);
		// assume number is prime so assign true to boolean isPrime
		boolean isPrime = true;
		// start a counter at 2
		int counter = 2;
		
		// while counter is less than or equal to half and a factor has not been found
		while( counter <= half && isPrime ){
			// if number divided by counter doesn't have a remainder
			if( number % counter == 0 ){
				// change isPrime to true
				isPrime = false;
				// break out of loop
				break;
			}
			// increment counter by 1
			counter++;
		}		
		//return isPrime
		return isPrime;
	}
	
	/**
	 * Checks the result of isPrime and returns the appropriate message
	 * 
	 * @param number - the number entered by the user that was tested
	 * @param result - the results from the isPrime test
	 * @return the appropriate message based on the results of the test
	 */
	public static String isPrimeMessage( int number, boolean result ){
		return (result) ? number + " is a prime number." : number + " is not a prime number.";
	}
	
	//TODO: finish the primeRange method
	public static String primeRange(){
		return "";
	}
	
	//TODO: finish the listPrime method
	public static String listPrime(){
		return "";
	}
	
	
	//TODO: finish option 2 and 3
	public static void displayOptions(){
		// create a message to display
		String message = "1. Check a prime number.\n" +
						 "2. Check prime numbers in range.\n" +
				         "3. Create list of prime numbers from 1 to 100.\n" +
						 "4. Quit";
		// display dialog box to user with the calculation options
		String userInput = JOptionPane.showInputDialog(null, message);
		int testNumber;
		String results;
		// store the selected option in userInput
		
		// while userInput is not 4
		while( userInput != "4"){
			// if user selects 1
			switch( userInput ){
			case "1":
				// display dialog to get number to test and store it in testNumber
				testNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer to test."));
				// pass user selection to the method isPrime
				// pass number and isPrime as an arguments to isPrimeMessage
				// store results in results 
				results = isPrimeMessage( testNumber, isPrime( testNumber ) );
				// pass results to displayMessage
				displayMessage( results );
				break;
			}
			
		}
			
	}
	
	/**
	 * Displays the message passed as the argument
	 * @param message
	 */
	public static void displayMessage( String message ){
		JOptionPane.showMessageDialog(null, message);
	}

}
