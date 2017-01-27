/**
 * Created by Ronny Rosabal.
 * Date:      1/26/2017
 * Objective:
 */
"use strict";

/*Write a function called "computeSumOfAllElements".
 
 Given an array of numbers, "computeSumOfAllElements" returns the sum of all the elements in the given array.
 
 var output = computeSumOfAllElements([1, 2, 3])
 console.log(output); // --> 6*/

function computeSumOfAllElements( arr ) {
  return arr.reduce( function( sum, num, index, array ) {
    return sum + num;
  }, 0 );
}

console.log( computeSumOfAllElements( [1, 2, 3] ) );