/*
 * Challenge:  1. Roman Numerals
 * Date: 	   09.18.16
 * Objective:  Translate a number within a range entered by the user into
 * 			   Roman numeral.
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: To translate a number into a its Roman numeral equivalent.
 * INPUT:	The number to be translated
 * PROCESS:	Find the Roman numeral match for the number entered by the user
 * OUTPUT:	The number entered and its Roman numeral equivalent
 */
package chapter3;
import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {

		// VARIABLES
		int inputNumber;					// the number entered by the user
		String romanNumeral;				// the equivalent Roman numeral
		
		// USER INPUT
		inputNumber = input();
		
		// CALCULATIONS
		romanNumeral = findRoman( inputNumber );
		
		// USER OUTPUT
		displayResults( inputNumber, romanNumeral );
	}
	
	/**
	 * Gets the input from the user
	 * @return
	 */
	public static int input(){
		int output;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10: ");
		output = keyboard.nextInt();
		keyboard.nextLine();
		keyboard.close();
		return output;
	}
	
	/**
	 * Translates a number from 1 to 10 into a Roman numeral
	 * @param number - number to be translated
	 * @return equivalent Roman numeral
	 */
	public static String findRoman( int number ){
		String output = "";
		if( 1 <= number && number <= 10 ){
			switch( number ){
			case 1:
				output = "I";
				break;
			case 2:
				output = "II";
				break;
			case 3:
				output = "III";
				break;
			case 4:
				output = "IV";
				break;
			case 5:
				output = "V";
				break;
			case 6:
				output = "VI";
				break;
			case 7:
				output = "VII";
				break;
			case 8:
				output = "VIII";
				break;
			case 9:
				output = "IX";
				break;
			case 10:
				output = "X";
			}
		}else{
			output ="error";
		}
		return output;
	}
	
	/**
	 * Displays the result of the number translation
	 * @param number - number that the user input
	 * @param result - translated Roman numeral
	 */
	public static void displayResults( int number, String result ){
		if( result.equalsIgnoreCase("error")){
			System.out.println( "The number entered is not within the range." );
		}else{
			System.out.println( number + " == " + result );
		}
	}

}
