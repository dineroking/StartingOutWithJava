/*
 * Challenge:  5. Mass and Weight
 * Date:  	   10/16/16
 * Objective:  Calculate the weight in scientific format
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE:	To calculate the weight of an object based on its mass
 * INPUT:	The object's mass in kilograms.
 * PROCESS:	Use the formula Weight = Mass * 9.8
 * OUTPUT:	Message displaying whether the object is too light or too heavy.
 */

package chapter3;
import java.util.Scanner;

public class MassWeight {

	public static void main(String[] args) {

		// VARIABLES
		double mass,				// holds the mass of an object in kilograms
			   weight;				// holds the weight of an object
		Scanner keyboard;			// holds the scanner object
		
		keyboard = new Scanner(System.in);
		
		// INPUT
		mass = getMass( keyboard );
		
		// CALCULATIONS
		weight = calcWeight( mass );
		
		// OUTPUT
		displayResults( createMessage(weight));
		
		
		keyboard.close();
	}
	
	// INPUT
	public static double userInput( Scanner inputType, String msg ){
		double output = 0.0;
		System.out.print( msg );
		output = inputType.nextDouble();
		return output;
	}
	
	public static double getMass( Scanner inputType ){
		return userInput( inputType, "Enter the mass of the object in kilograms: ");
	}
	
	// CALCULATIONS
	public static double calcWeight( double mass ){
		return mass * 9.8;
	}
	
	// OUTPUT
	public static String createMessage( double weight ){
		String output = "";
		if( weight > 1000 ){
			output = "The object is too heavy.";
		}else if( weight < 10 ){
			output = "The object is too light.";
		}else{
			output = "The object's weight is perfect.";
		}
		return output;
	}
	
	public static void displayResults( String msg ){
		System.out.println( msg );
	}

}
