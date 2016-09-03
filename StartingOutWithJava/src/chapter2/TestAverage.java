/*
 * Challenge:  10. Test Average
 * Date: 	   09.03.16
 * Objective:  To calculate the average of test scores
 */

/*
 * PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate the average of test scores
 * INPUT:	The number of tests taken and the score for each test
 * PROCESS: Adds all the test scores and divides them by the number of tests
 * OUTPUT: 	Tests scores and the test score average
 */
package chapter2;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TestAverage {

	public static void main(String[] args) {
		
		// VARIABLES
		int [] scores = new int[3];				// an array of scores
		int numOfScores = 3,					// total number of scores
			totalScores = 0;					// sum of all the scores
		double averageScore = 0;				// average score
		
		// USER INPUT
		for( int i = 0; i < scores.length; i++ ){
			scores[i] = getScore( i + 1 );
		}
		
		// CALCULATE SCORES
		totalScores = calcTotal( scores );
		averageScore = calcAverage(scores, totalScores);
		
		// USER OUTPUT
		displayResults(scores, averageScore);

	}
	
	/**
	 * Gets each of the scores from the user
	 * @param score - Score number
	 * @return the score
	 */
	public static int getScore( int score ){
		return Integer.parseInt( JOptionPane.showInputDialog(null, "Enter score #" 
	+ score + "."));
	}
	
	/**
	 * Calculates the sum of all the scores
	 * @param scores - array of all the scores
	 * @return the sum all of the scores
	 */
	public static int calcTotal( int[]scores ){
		int sum = 0;
		for( int i = 0; i < scores.length; i++ ){
			sum += scores[i];
		}
		return sum;
	}
	
	/**
	 * Calculates the average score for the student
	 * @param scores - an array of all the scores
	 * @param totalScore - the sum of all the scores
	 * @return the average score
	 */
	public static double calcAverage( int[]scores, int totalScore ){
		return totalScore / scores.length;
	}
	
	/**
	 * Displays the scores and average score
	 * @param scores - array of all the scores
	 * @param average - average scores
	 */
	public static void displayResults( int[]scores, double average ){
		DecimalFormat format = new DecimalFormat("##.00");
		String output = "";
		for( int i = 0; i < scores.length; i++ ){
			output += "\nScore #" + (i + 1) + ":\t\t" + scores[i];
		}
		output += "\nAverage:\t\t" + format.format(average);
		System.out.println( output );
	}

}
