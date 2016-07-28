package chapter2;
/*
 * StringManipulator.java
 * Ronny Rosabal
 * Programming Fundamentals I
 * COSC 1336 2003 6W2
 * 07.21.16
 * Write a program that asks the user to enter the name of his or her favorite city. Use a String variable to store the input
 * */

/*PROGRAM DESCRIPTION
 * 
 * PURPOSE: To manipulate an input String
 * INPUT:   User's favorite city
 * PROCESS: Receive input from user, store number of characters, city in lower case, city in upper case, and first char.
 * OUTPUT:  Display every stored manipulated string;
 */

import java.util.Scanner;
public class StringManipulator {

	public static void main(String[] args) {
		String input; 				 // holds the user's favorite city
		int cityLength;				 // holds the length of the city String
		String cityUpper, cityLower; // hold the city name in upper and lower case
		char cityFirst; 			 // holds the first character of the city
		Scanner keyboard;			 // holds the user key strokes
		
		
		//initialize the Scanner object
		keyboard = new Scanner(System.in);
		
		// get user's favorite city
		System.out.print("Enter your favorite city: ");
		input = keyboard.nextLine();
		
		// store length of city String
		cityLength = input.length();
		// store city in all upper case
		cityUpper = input.toUpperCase();
		// store city in all lower case
		cityLower = input.toLowerCase();
		// store first character of string
		cityFirst = input.charAt(0);
		
		// display the string manipulated;
		
		System.out.println("\nThe city you entered was: " + input);
		System.out.println("The length of the city String is: " + cityLength);
		System.out.println("The city name converted to upper case: " + cityUpper);
		System.out.println("The city name converted to lower case: " + cityLower);
		System.out.println("The first letter of the city: " + cityFirst);
		System.out.println("\nTA DA, program is done!");
		
		/**
		 * I'm just testing a documentation comment
		 * 
		 * @author Ronny Rosabal
		 */
		
		keyboard.close();
	}

}
