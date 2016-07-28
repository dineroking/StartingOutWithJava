/*
 * ReportCard.java
 * Ronny Rosabal
 * Programming Fundamentals I
 * COSC 1336 2003 6W2
 * 07.26.16
 * To calculate and display the average test score and letter grade of student.
 * */


/*PROGRAM DESCRIPTION
 * 
 * PURPOSE: To calculate and display the average test score and letter grade of student.
 * INPUT:   Name of student, and five test scores.
 * PROCESS: Store five test scores and divide by five test and calculate letter grade.
 * OUTPUT:  Display student's name, students average score and letter grade
 */
package chapter3;
//package gradebook;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ReportCard {

	public static void main(String[] args) {

		//declare all variables for input and calculation(s)
		
		String name;			// holds name of student
		int numTest;			// holds number of tests taken
		double score,			// holds total of all the scores
			averageScore;		// holds average score of tests
		char grade;				// holds the letter grade calculated for student
		Scanner keyboard;		// holds input from user keyboard  (needs Scanner import)
		DecimalFormat format;   // holds the format for the average test score (needs DecimalFormat import)
		
		
	}

}
