/**
 * Created by Ronny Rosabal.
 * Date:      2/10/17
 * Objective:
 */
"use strict";

/*
 Write a function called "convertScoreToGradeWithPlusAndMinus".
 
 Given a score, "convertScoreToGradeWithPlusAndMinus" returns a string representing the letter grade corresponding to the given score.
 
 Notes:
 * (100 - 90) --> 'A'
 * (89  - 80) --> 'B'
 * (79  - 70) --> 'C'
 * (69  - 60) --> 'D'
 * (60  -  0) --> 'F'
 * If the given score is greater than 100 or less than 0, it should return 'INVALID SCORE'.
 * If the score is between the 0 and 2 (inclusive) of a given range, return the letter with a '-'
 * If the score is be the 8 and 9 (inclusive) of a given range, return the letter with a '+'
 * There are is no F+ and there is no F-.
 
 var output = convertScoreToGradeWithPlusAndMinus(91);
 console.log(output); // --> 'A-'*/

function convertScoreToGradeWithPlusAndMinus( score ) {
  // your code here
  var grade = "INVALID SCORE";
  var baseScore = 5;
  if( score >= 0 && score <= 100 ) {
    if( score >= 90 ) {
      grade = "A";
      baseScore = score % 90;
    } else if( score >= 80 ) {
      grade = "B";
      baseScore = score % 80;
    } else if( score >= 70 ) {
      grade = "C";
      baseScore = score % 70;
    } else if( score >= 60 ) {
      grade = "D";
      baseScore = score % 60;
    } else {
      grade = "F";
    }
  }
  
  if( baseScore <= 2 ) {
    grade += "-";
  } else if( baseScore >= 8 ) {
    grade += "+";
  }
  return grade;
}

console.log( convertScoreToGradeWithPlusAndMinus( 91 ) );
console.log( convertScoreToGradeWithPlusAndMinus( 0 ) );