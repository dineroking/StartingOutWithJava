/**
 * Created by Ronny Rosabal.
 * Date:      1/9/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLongestWordOfMixedElements".
 
 Given an array of mixed types, "getLongestWordOfMixedElements" returns the longest string in the given array.
 
 Notes:
 * If the array is empty, it should return an empty string ("").
 * If the array contains no strings; it should return an empty string.
 
 var output = getLongestWordOfMixedElements([3, 'word', 5, 'up', 3, 1]);
 console.log(output); // --> 'word'*/

function getLongestWordOfMixedElements( arr ) {
  return arr.reduce( function( longest, currWord, index, array ){
    if( typeof currWord === "string" && currWord.length > longest.length ) {
      return currWord;
    }
    return longest;
  }, "" );
}

console.log( getLongestWordOfMixedElements( [3, 'word', 5, 'up', 3, 1] ) );
console.log( getLongestWordOfMixedElements( [] ) );