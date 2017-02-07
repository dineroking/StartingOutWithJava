/**
 * Created by Ronny Rosabal.
 * Date:      2/7/17
 * Objective:
 */
"use strict";

/*
 Write a function called "multiplyBetween".
 
 Given 2 integers, "multiplyBetween" returns the product between the two given integers, beginning at num1, and excluding num2.
 
 Notes:
 * The product between 1 and 4 is 1 * 2 * 3 = 6.
 * If num2 is not greater than num1, it should return 0.
 
 var output = multiplyBetween(2, 5);
 console.log(output); // --> 24*/

function multiplyBetween( num1, num2 ) {
  var prod = 1;
  if( num1 >= num2 ) {
    prod = 0;
  } else {
    for( var i = num1; i < num2; i++ ) {
      prod *= i;
      console.log( prod );
    }
  }
  return prod;
}

console.log( multiplyBetween( 2, 5 ) );