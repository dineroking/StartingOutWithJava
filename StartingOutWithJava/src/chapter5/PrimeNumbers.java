/*
 * PrimeNumbers.java
 * Ronny Rosabal
 * Programming Fundamentals I
 * COSC 1336 2003 6W2
 * 08.11.16
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

	public static void main(String[] args) throws IOException{
		
		displayOptions();

	}
	
	
	///////////////////////////////
	// PRIME CALCULATIONS
	///////////////////////////////
	
	/**
	 * Calculates if a given number is prime.
	 * 
	 * @param number - number to be tested
	 * @return true if number is prime or false if the number is not prime
	 */
	public static boolean isPrime( int number ){
		int half = (int)(number / 2);							// holds half of number so that counter only goes half way
		boolean isPrime = true;									// assumes number is prime and if not the value is changed to false
		int counter = 2;										// starts at 2 because 1 is not a prime number
		
		while( counter <= half && isPrime ){
			if( number % counter == 0 ){
				isPrime = false;
				break;
			}
			counter++;
		}		
		
		return isPrime;
	}
	
	
	
	/**
	 * Checks the result of isPrime and returns the appropriate message
	 * 
	 * @param number - the number entered by the user that was tested
	 * @param result - the results from the isPrime test
	 * @return the appropriate message based on the results of the isPrime test
	 */
	public static String isPrimeMessage( int number, boolean result ){
		return (result) ? number + " is a prime number." : number + " is not a prime number.";
	}
	
	
	
	/**
	 * Finds and displays all the prime numbers from 2 up to and including a given number
	 * @param number - the number to find the range of prime numbers to
	 * @return a list of all the prime numbers from 2 to a given number
	 */
	public static String primeRange( int number ){
		String output = "Prime range for number " + number + ": ";	// holds the string that will be used for the list of primes
		
		for( int counter = 2; counter <= number; counter++ ){
			if( isPrime( counter ) ){
				output += (counter == 2) ? " " + counter: ", " + counter;
			}
		}
		
		return output;
	}
	
	
	
	/**
	 * Creates a file named Primes.txt and writes to it a list of 
	 * 
	 * @throws IOException
	 */
	public static void listPrime() throws IOException{
		int listRange = 100;
		PrintWriter output = new PrintWriter("Primes.txt");
		output.println( primeRange( listRange ) );
		output.close();
	}
	
	///////////////////////////////
	// MESSAGES AND OPTIONS
	///////////////////////////////
	
	/**
	 * Displays a dialog box with options for the user to choose from
	 * 
	 * @throws IOException
	 */
	public static void displayOptions() throws IOException{
		String message = "1. Check a prime number.\n" +								// holds the string with the options for the user
						 "2. Check prime numbers in range.\n" +
				         "3. Create list of prime numbers from 1 to 100.\n" +
						 "4. Quit";
		String userInput = JOptionPane.showInputDialog(null, message);
		int testNumber;
		String results;
		
		while( !userInput.equals("4")){
			switch( userInput ){
			case "1":
				testNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer to test."));
				results = isPrimeMessage( testNumber, isPrime( testNumber ) );
				displayMessage( results );
				break;
			case "2":
				testNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter integer for range."));
				results = primeRange( testNumber );
				displayMessage( results );
				break;
			case "3":
				listPrime();
				break;
			}
			userInput = JOptionPane.showInputDialog(null, message);
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
