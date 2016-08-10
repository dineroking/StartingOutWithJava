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
		int numTest = 0;		// holds number of tests taken
		double scores = 0,		// holds total of all the scores
			averageScore;		// holds average score of tests
		char grade = 'F';		// holds the letter grade calculated for student
		Scanner keyboard;		// holds input from user keyboard  (needs Scanner import)
		DecimalFormat format;   // holds the format for the average test score (needs DecimalFormat import)
		
		keyboard = new Scanner(System.in);
		format = new DecimalFormat("#00.00");
		
		// get student name
		System.out.print("Student's name: ");
		name = keyboard.nextLine();
		
		// get all test scores, add them together and get number of tests
		for( int i = 0; i < 5; i++ ){
			System.out.print("Enter score for test " + (i + 1) + ": ");
			scores += keyboard.nextDouble();
			numTest++;
		}
		//calculate the average score
		averageScore = scores / numTest;
						
		// assign letter grade based on the following scale
		/*
		 * A: 90 - 100
		 * B: 80 - 89
		 * C: 70 - 79
		 * D: 60 - 69
		 * F: 0 - 59
		 */
		
		if( 0 <= averageScore && averageScore <= 100 ){
			if( averageScore >= 90 ){
				grade = 'A';
			}else if( averageScore >= 80 ){
				grade = 'B';
			}else if( averageScore >= 70 ){
				grade = 'C';
			}else if( averageScore >= 60 ){
				grade = 'D';
			}else{
				grade = 'F';
			}
			System.out.println(name + " has an average score of " + format.format(averageScore) + " or a(n) " + 
					grade + " for the class.");
		}else{
			System.out.println("Invalid score entries!");
		}
		
		keyboard.close();
	}

}