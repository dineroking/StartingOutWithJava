/**
 * Created by Ronny Rosabal.
 * Date:      1/22/17
 * Objective:
 */
"use strict";

/*
 Write a function called "findSmallestElement".
 
 Given an array of numbers, "findSmallestElement" returns the smallest number within the given array.
 
 Notes:
 * If the given array is empty, it should return 0.
 
 var output = findSmallestElement([4, 1, 9, 10]);
 console.log(output); // --> 1*/

function findSmallestElement( arr ) {
  return arr.reduce( function( smallest, elem, index, array ) {
    if( index === 0 ) {
      return elem;
    } else if( elem < smallest ) {
      return elem;
    }
    return smallest;
  }, 0 );
}

console.log( findSmallestElement( [4, 1, 9, 10] ) );
console.log( findSmallestElement( [] ) );