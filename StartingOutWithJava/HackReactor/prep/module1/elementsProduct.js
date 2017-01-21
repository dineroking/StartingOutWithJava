/**
 * Created by Ronny Rosabal.
 * Date:      1/19/17
 * Objective:
 */
"use strict";

/*
 Write a function called "computeProductOfAllElements".
 
 Given an array of numbers, "computeProductOfAllElements" returns the products of all the elements in the given array.
 
 Notes:
 * If given array is empty, it should return 0.
 
 var output = computeProductOfAllElements([2, 5, 6]);
 console.log(output); // --> 60*/

function computeProductOfAllElements( arr ) {
  if( arr.length > 0 && Array.isArray( arr ) ) {
    return arr.reduce( function( prod, num, index, array ) {
      return prod * num;
    } );
  }
  return 0
}

console.log( computeProductOfAllElements( [2, 5, 6] ) );
console.log( computeProductOfAllElements( [] ) );