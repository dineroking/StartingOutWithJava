/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.2.16
 * Runs and executes the Rock Paper Scissors game by using the RockPaperScissors class
 */

package rockPaperScissors;

import javax.swing.JOptionPane;
public class RockPaperScissorsGame {

	public static void main(String[] args) {

		// VARIABLES
		String userInput,									// the user's input
			   userMessage;									// the message the user sees with game option
		int userSelection;									// the userInput converted into an integer
		RockPaperScissors game = new RockPaperScissors();	// holds the RockPaperScissors object
		
		// USER INPUT
		
		// build the message that the user should see
		userMessage = "Rock, Paper, Scissors game.\n\n";
		userMessage += "Enter one of the following options:\n";
		userMessage += "1 for Rock\n";
		userMessage += "2 for Paper\n";
		userMessage += "3 for Scissors\n";
		userMessage += "0 for Quiting the game.";
		
		// get the user input and convert it to an integer
		userInput = JOptionPane.showInputDialog(null, userMessage);
		userSelection = Integer.parseInt(userInput);
		
		// check that the user entered a number within the range given
		while( userSelection < 0 || userSelection > 3 ){
			JOptionPane.showMessageDialog(null, "Your selection is out of range.");
			userInput = JOptionPane.showInputDialog(null, userMessage);
			userSelection = Integer.parseInt(userInput);
		}
		
		// OUTPUT
		
		/*
		 * While the user doesn't quit the game, the user input should be set, a winner is
		 * generated and the results displayed.
		 */
		while( userSelection != 0 ){
			game.setUserInput(userSelection);
			game.findWinner();
			game.displayResults();
			userInput = JOptionPane.showInputDialog(null, userMessage);
			userSelection = Integer.parseInt(userInput);
		}
		System.exit(0);
	}

}
