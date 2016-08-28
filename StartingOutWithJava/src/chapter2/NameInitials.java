/*
 * Challenge: 2. Name and Initials
 * Date: 08.27.16
 */

package chapter2;

public class NameInitials {

	public static void main(String[] args) {

		Person ronny = new Person("Ronny", "Rosabal", "Male", 34);
		ronny.setmName("Alain");
		
		char firstInitial = ronny.getfName().charAt(0); 		// first name initial
		char middleInitial = ronny.getmName().charAt(0);		// middle name initial
		char lastInitial = ronny.getlName().charAt(0);			// last name initial
		
		// print initials
		
		String print;											// string to be printed
		print = "First Inital:\t" + firstInitial;
		print += "\nMiddle Initial:\t" + middleInitial;
		print += "\nLast Initial:\t" + lastInitial;
		
		System.out.println(print);
	}

}
