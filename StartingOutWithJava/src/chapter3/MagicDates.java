/*
 * Challenge:  2. Magic Dates
 * Date: 	   10/16/16
 * Objective:  Take day, month and year for a date and determine if the day 
 * 			   times the month equals the year.
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE:	Calculates whether the day of a date calculated by the month equals
 * 			the year.
 * INPUT:	The day, the month and the year of a date.
 * PROCESS:	Multiply the day by the month and then compare it to the year.
 * OUTPUT:	A message for each situation.
 */

package chapter3;
import javax.swing.JOptionPane;

public class MagicDates {

	public static void main(String[] args) {
		
		// VARIABLES
		int day,			// the day of the user provided date
			month,			// the month of the user provided date
			year,			// the year of the user provided date
			total;			// the product of day times month
		
		// INPUT
		day = getDay();
		month = getMonth();
		year = getYear();
		
		// CALCULATIONS
		total = calcTotal(day, month);
		
		// OUTPUT
		displayRestuls( isMatch(total, year) );

	}
	
	// INPUT
	public static int userInput( String msg ){
		return Integer.parseInt(JOptionPane.showInputDialog(null, msg));
	}
	
	public static int getDay(){
		return userInput("Enter the day of a date:");
	}
	
	public static int getMonth(){
		return userInput("Enter the month of a date:");
	}
	
	public static int getYear(){
		return userInput("Enter the year of the date:");
	}
	
	// CALCULATIONS
	public static int calcTotal( int day, int month ){
		return day * month;
	}
	
	public static boolean isMatch( int total, int year){
		return total == year;
	}
	
	// OUTPUT
	public static void displayRestuls( boolean isMatch ){
		if( isMatch ){
			System.out.println("Your numbers are magic.");
		}else{
			System.out.println("Your numbers suck ass.");
		}
	}

}
