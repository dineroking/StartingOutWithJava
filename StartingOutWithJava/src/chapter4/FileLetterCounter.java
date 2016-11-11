package chapter4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileLetterCounter {

	public static void main(String[] args) throws IOException {

		// VARIABLES
		String fileName;	 						// user's file name
		char userChar;								// user specified character
		int count = 0;								// character counter
		String input,
			   message;
		Scanner keyboard = new Scanner(System.in);	// keyboard input
		
		
		
		// USER INPUT
		
		//Get the user's file name
		System.out.print("Enter file name: ");
		fileName = "src/" + keyboard.nextLine();
		
		//Get character to search for and convert it to upper case
		System.out.print("Enter the character to search for: ");
		input = keyboard.nextLine();
		input = input.toUpperCase();
		userChar = input.charAt(0);
		
		//Open the file
		FileReader fr = new FileReader(fileName);
		BufferedReader inFile = new BufferedReader(fr);
		
		//Read the first line
		input = inFile.readLine();
		
		while( input != null ){
			
			//turn line into upper case
			input = input.toUpperCase();
			
			for(int i = 0; i < input.length(); i++){
				if( input.charAt(i) == userChar ){
					count++;
				}
			}
			
			//Read the next line
			input = inFile.readLine();
		}
		inFile.close();
		
		message = String.format("The letter %s appears %d times." , userChar, count);
		
		System.out.println(message);
	}

}
