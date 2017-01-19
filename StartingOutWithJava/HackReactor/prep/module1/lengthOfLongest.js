/**
 * Created by Ronny Rosabal.
 * Date:      1/9/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLengthOfLongestElement".
 
 Given an array, "getLengthOfLongestElement" returns the length of the longest string in the given array.
 
 Notes:
 * It should return 0 if the array is empty.
 
 var output = getLengthOfLongestElement(['one', 'two', 'three']);
 console.log(output); // --> 5*/

function getLengthOfLongestElement( arr ) {
  return arr.reduce( function( longest, curr, index, array ) {
    return curr.length > longest.length ? curr : longest;
  }, "" ).length;
}

console.log( getLengthOfLongestElement( ['one', 'two', 'three'] ) );
console.log( getLengthOfLongestElement( [] ) );