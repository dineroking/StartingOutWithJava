/*
 * Challenge:  6. Time Calculator
 * Date:  	   10.17.16
 * Objective:  Calculate the number of minutes, hours, or days based of the amount
 * 			   of seconds entered.
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE:	Calculate and display the number of minutes, hours or days based on 
 * 			the user input.
 * INPUT:	The number of seconds.
 * PROCESS:	Divide the input by the number of seconds in a minute(60), hour(3600),
 * 			or day(86400).
 * OUTPUT:	A message displaying the correct time.
 */
package chapter3;
import javax.swing.JOptionPane;

public class TimeCalculator {

	public static void main(String[] args) {
		
		// VARIABLES
		final int secPerMin = 60,			// number of seconds per minute
				  secPerHour = 3600,		// number of seconds per hour
				  secPerDay = 86400;		// number of seconds per day
		int totalSeconds,					// total seconds entered by user
			minutes,
			hours,
			days,
			seconds;
		
		// INPUT
		totalSeconds = getSeconds();
		
		// CALCULATIONS
		days = calcDays(totalSeconds, secPerDay);
		hours = calcHours(totalSeconds, secPerDay, secPerHour);
		
		
		// OUTPUT
		displayResults( hours );
	}
	
	// INPUT
	public static int input( String msg ){
		return Integer.parseInt( JOptionPane.showInputDialog( null, msg ));
	}
	
	public static int getSeconds(){
		return input( "Enter total number of seconds." );
	}
	
	// CALCULATIONS
	public static int calcDays( int totalSeconds, int secPerDay ){
		return totalSeconds / secPerDay;
	}
	
	public static int calcHours( int totalSeconds, int secPerDay, int secPerHour ){
		return ( totalSeconds % secPerDay ) / secPerHour;
	}
	
	public static int calcMinutes( int totalSeconds, int secPerDay, int secPerHour, int secPerMin ){
		return ( totalSeconds % secPerDay % secPerHour ) / secPerMin;
	}
	
	public static int caclSeconds( int totalSeconds, int secPerDay, int secPerHour, int secPerMin ){
		return ( totalSeconds % secPerDay % secPerHour ) % secPerMin;
	}
	
	// OUTPUT
	public static void displayResults( int msg ){
		JOptionPane.showMessageDialog(null, msg );
	}
}
