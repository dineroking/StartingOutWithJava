/**
 * Created by Ronny Rosabal.
 * Date:      2/9/17
 * Objective:
 */
"use strict";

/*
 Write a function called "computeSumBetween".
 
 Given 2 integers, "computeSumBetween" returns the sum between the two given integers, beginning at num1, and excluding num2.
 
 Notes:
 * The sum between 1 and 4 is 1 + 2 + 3 = 6.
 * If num2 is not greater than num1, it should return 0.
 
 var output = computeSumBetween(2, 5);
 console.log(output); // --> 9*/

function computeSumBetween( num1, num2 ) {
  if( num1 >= num2 ) {
    return 0;
  } else {
    return num1 + computeSumBetween( num1 + 1, num2 );
  }
}

console.log( computeSumBetween( 2, 5 ) );
console.log( computeSumBetween( 4, 5 ) );