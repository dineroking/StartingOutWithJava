/**
 * Created by Ronny Rosabal.
 * Date:      1/21/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLengthOfShortestElement".
 
 Given an array, "getLengthOfShortestElement" returns the length of the shortest string in the given array.
 
 Notes:
 * It should return 0 if the array is empty.
 
 var output = getLengthOfShortestElement(['one', 'two', 'three']);
 console.log(output); // --> 3*/

function getLengthOfShortestElement( arr ) {
  if( Array.isArray( arr ) && arr.length > 0 ) {
    return arr.reduce( function( shortest, elem, index, array ) {
      if( shortest === 0 ) {
        return elem.length;
      } else if( elem.length < shortest ) {
        return elem.length;
      }
      return shortest;
    }, 0 );
  }
  return 0;
}

console.log( getLengthOfShortestElement( ['one', 'two', 'three'] ) );
console.log( getLengthOfShortestElement( [] ) );