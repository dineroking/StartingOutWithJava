/**
 * Created by Ronny Rosabal.
 * Date:      9/9/17
 * Objective:
 */
"use strict";

/*
Flip every chunk of n characters in a string, where n is any positive integer greater than 1.

Note that this is intentionally very similar to the previous problem.
  
  Please focus on getting a working solution with the tools you know well.
  
  Practice the interactive/collaborative interview style that's described in the documentation.

Example:
  var input = 'a short example';
var output = flipEveryNChars(input, 5);
console.log(output); // --> ohs axe trelpma*/

function flipEveryNChars( str, numOfChars ) {
  let flippedString = "";
  let holder = "";
  let startChar = 0;
  while( startChar < str.length ) {
    if( (startChar + numOfChars ) <= str.length ) {
      holder = str.substr( startChar, numOfChars );
      flippedString += reverseChars( holder );
    } else {
      holder = str.slice( startChar );
      flippedString += reverseChars( holder );
    }
    startChar += numOfChars;
  }
  
  return flippedString;
}

function reverseChars( str ) {
  let result = str.split( "" );
  result = result.reverse();
  return result.join( "" );
}

console.log( flipEveryNChars( "a short example", 5 ) );
console.log( flipEveryNChars( "a short example", 2 ) );