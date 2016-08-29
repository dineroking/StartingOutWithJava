/*
 * Challenge: 4. Star Pattern
 * Date: 08.27.16
 */

package chapter2;

public class StarPattern {

	public static void main(String[] args) {

		char symbol = '*';								// the symbol that forms the shape						// the space for in front of the symbol
		String print = "";								// the final string to be printed
		final int MAX_STAR = 13;
		int spaceCounter = MAX_STAR / 2;
		int starCounter = 1;
		boolean beginning = true;
		
		/*
		 * Prints a diamond of the specified symbol. First it checks for the beginning
		 * of the diamond. If it still, it reduces spaces and adds symbols until the symbols 
		 * reach the maximum amount specified of symbols at which point another set of
		 * spaces and symbols are added to the string before the counters are reverse. It 
		 * starts to add spaces and reduce the symbols until the symbols are back at 1, at
		 * which point it exits the loop and the entire string is printed.
		 */
		for( int i = 0; i < MAX_STAR; i++ ){
			if( beginning ){
				if( starCounter == MAX_STAR ){
					beginning = false;
					print += getSpaces( spaceCounter );
					print += getSymbols( starCounter, symbol );
				}else{
					print += getSpaces( spaceCounter );
					print += getSymbols( starCounter, symbol );
					spaceCounter--;
					starCounter += 2;
				}
			}else{
				spaceCounter++;
				starCounter -= 2;
				print += getSpaces( spaceCounter );
				print += getSymbols( starCounter, symbol );
				if( starCounter == 1 ){
					break;
				}
			}
		}
		
		System.out.println( print );
	}
	
	
	/**
	 * Creates a string of symbols
	 * @param max - the maximum number of symbols in the string
	 * @param symbol - the symbol to be used 
	 * @return a string of symbols 
	 */
	public static String getSymbols( int max, char symbol ){
		String output = "";
		for( int i = 0; i < max; i++){
			output += "" + symbol;
		}
		output += "\n";
		return output;
	}
	
	/**
	 * @param max - maximum number of spaces
	 * @return a string with composed of spaces
	 */
	public static String getSpaces( int max ){
		String output = "";
		for( int i = 0; i < max; i++ ){
			output += " ";
		}
		return output;
	}
}
