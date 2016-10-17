/*
 * Challenge:  3.  Body Max Index
 * Date:   	   10/16/16
 * Objective:  The program should display the Body Max Index (BMI) of a person.
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE:	To calculate the BMI of a person based on the numbers entered.
 * INPUT:	The person's height in inches and its weight in pounds.
 * PROCESS	Use the following formula BMI = Weight x 703/Height(squared).
 * OUTPUT:	A message specifying whether that person is overweight or not
 */
package chapter3;
import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		
		// VARIABLES
		double height,			// height of the person
			   weight,			// weight of the person
			   bmi;				// bmi of the person
		
		// INPUT
		height = getHeight();
		weight = getWeight();
		
		// CALCULATIONS
		bmi = calcBMI(height, weight);
		
		// OUTPUT
		displayResults(createMessage(bmi));
	}

	// INPUT 
	// TODO: why cant I close the Scanner object inside the function?
	public static double userInput(  String msg ){
		double output = 0.0;
		Scanner keyboard = new Scanner(System.in);
		System.out.print( msg );
		output = keyboard.nextDouble();
		return output;
	}
	
	public static double getHeight(){
		return userInput( "Enter the person's height in inches: ");
	}
	
	public static double getWeight(){
		return userInput("Enter the person's weight in pounds: ");
	}
	
	// CALCULATIONS
	public static double calcBMI( double height, double weight ){
		return weight * 703 / (Math.pow(height, 2)); 
	}
	
	// OUTPUT
	
	public static String createMessage( double bmi ){
		String output = "";
		if( bmi > 25 ){
			output = "You are way too fat.";
		}else if(bmi > 18.5){
			output = "Your weight is perfect.";
		}else{
			output ="Go eat some burgers.";
		}
		return output;
	}
	
	public static void displayResults( String msg ){
		System.out.println( msg );
	}
}
