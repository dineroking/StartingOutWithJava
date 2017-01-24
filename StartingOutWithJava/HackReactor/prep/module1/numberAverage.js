/**
 * Created by Ronny Rosabal.
 * Date:      1/6/17
 * Objective:
 */
"use strict";

/*
 Write a function called "computeAverageOfNumbers".
 
 Given an array of numbers, "computeAverageOfNumbers" returns their average.
 
 Notes:
 * If given an empty array, it should return 0.
 
 var input = [1,2,3,4,5];
 var output = computeAverageOfNumbers(input);
 console.log(output); // --> 3*/

var input = [1, 2, 3, 4, 5];

function computeAverageOfNumbers( input ) {
  if( input.length > 0 ) {
    return input.reduce( function( sum, elem, index, array ) {
        return sum + elem;
      }, 0 ) / input.length;
  }
  return 0;
}

console.log( computeAverageOfNumbers( input ) );
console.log( computeAverageOfNumbers( [] ) );