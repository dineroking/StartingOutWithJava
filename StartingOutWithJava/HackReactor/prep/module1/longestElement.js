/**
 * Created by Ronny Rosabal.
 * Date:      1/22/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLongestElement".
 
 Given an array, "getLongestElement" returns the longest string in the given array.
 
 Notes:
 * If there are ties, it returns the first element to appear.
 * If the array is empty, tt should return an empty string.
 
 var output = getLongestElement(['one', 'two', 'three']);
 console.log(output); // --> 'three'*/

function getLongestElement( arr ) {
  return arr.reduce( function( longest, next, index, array ) {
    return next.length > longest.length ? next : longest;
  }, "" );
}

console.log( getLongestElement( ['one', 'two', 'three'] ) );
console.log( getLongestElement( [] ) );