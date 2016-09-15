/*
 * Challenge:  18. Word Game
 * Date: 	   09.15.15
 * Objective:  Get information from the user and plug in the input into a predefined 
 * 			   paragraph.
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: Use the information provided by the user to plug into a predefined 
 * 			paragraph.
 * INPUT:	User's name, age, city, college's name, profession, type of animal,
 * 			pet's name.
 * PROCESS: Store all the input from the user and plug the right information into
 * 			the specified place.
 * OUTPUT:	A predefined paragraph with information dynamically placed into it
 */
package chapter2;
import javax.swing.JOptionPane;

public class WordGames {

	public static void main(String[] args) {
		
		// VARIABLES
		String userName,				// the name of the user
		       userAge,					// the age of the user
		       userCity,				// the city of the user
		       userCollege,				// the college's name of the user
		       userProfession,			// the profession of the user
		       animalType,				// the type of animal the user owns
		       petsName,				// the user's pet's name
		       output;					// the string to be printed
		
		// USER INPUT
		userName = getUserName();
		userAge = getUserAge();
		userCity = getUserCity();
		userCollege = getCollegeName();
		userProfession = getUserProfession();
		animalType = getAnimalType();
		petsName = getPetsName();
		
		// STRING CONSTRUCTION
		output = "There once was a person named " + userName;
		output += " who lived in " + userCity + ". At the age of " + userAge;
		output += ",\n " + userName + " went to college at " + userCollege;
		output += ". " + userName + " graduated and went to work as a ";
		output += "\n" + userProfession + ". Then, " + userName + " adopted a(n) ";
		output += animalType + " named " + petsName + ". They both lived happily ";
		output += "ever after!";
		
		// USER OUTPUT
		displayResults( output );

	}
	
	/**
	 * Gets user input.
	 * @param msg - The question to ask user for input
	 * @return the user input
	 */
	public static String userInput( String msg ){
		return JOptionPane.showInputDialog(null, msg);
	}
	
	/**
	 * Gets the user's name
	 * @return user's name
	 */
	public static String getUserName(){
		return userInput("Enter your name.");
	}
	
	/**
	 * Gets the user's age
	 * @return user's age
	 */
	public static String getUserAge(){
		return userInput("Enter your age.");
	}
	
	/**
	 * Gets the user's city
	 * @return user's city
	 */
	public static String getUserCity(){
		return userInput("Enter your city.");
	}
	
	/**
	 * Gets the user's college's name
	 * @return user's college's name
	 */
	public static String getCollegeName(){
		return userInput("Enter your college's name.");
	}
	
	/**
	 * Gets the user's profession
	 * @return user's profession
	 */
	public static String getUserProfession(){
		return userInput("Enter your profession.");
	}
	
	/**
	 * Gets the user's animal's type
	 * @return user's animal's type
	 */
	public static String getAnimalType(){
		return userInput("Enter type of animal.");
	}
	
	/**
	 * Gets the user's pet's name
	 * @return user's pet's name
	 */
	public static String getPetsName(){
		return userInput("What is your pets name.");
	}
	
	/**
	 * Displays a string to the user
	 * @param msg - message to be displayed
	 */
	public static void displayResults( String msg ){
		System.out.println(msg);
	}

}
