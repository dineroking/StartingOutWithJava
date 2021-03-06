/**
 * Created by Ronny Rosabal.
 * Date:      1/23/17
 * Objective:
 */
"use strict";

/*
 Write a function called "findShortestElement".
 
 Given an array, "findShortestElement" returns the shortest string within the given array.
 
 Notes:
 * If there are ties, it should return the first element to appear.
 * If the given array is empty, it should return an empty string.
 
 var output = findShortestElement(['a', 'two', 'three']);
 console.log(output); // --> 'a'*/

function findShortestElement( arr ) {
  return arr.reduce( function( shortest, elem, index, array ) {
    if( array.length > 0 && index === 0 ) {
      return elem;
    } else if( elem.length < shortest.length ) {
      return elem;
    }
    return shortest;
  }, "" );
}

console.log( findShortestElement( ['a', 'two', 'three'] ) );
console.log( findShortestElement( [] ) );