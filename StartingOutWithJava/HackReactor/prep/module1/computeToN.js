/**
 * Created by Ronny Rosabal.
 * Date:      2/10/17
 * Objective:
 */
"use strict";

/*
 Write a function called "computeSummationToN".
 
 Given a number, "computeSummationToN" returns the sum of sequential numbers leading up to the given number, beginning at 0.
 
 Notes:
 * If n = 4, it should calculate the sum of 1 + 2 + 3 + 4, and return 10.
 
 var output = computeSummationToN(6);
 console.log(output); // --> 21*/

function computeSummationToN( n ) {
  if( n === 0 ) {
    return 0;
  } else {
    return n + computeSummationToN( n - 1 );
  }
}

console.log( computeSummationToN( 6 ) );