/**
 * Created by Ronny Rosabal.
 * Date:      2/11/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLongestOfThreeWords".
 
 Given 3 words, "getLongestOfThreeWords" returns the longest of three words.
 
 Notes:
 * If there is a tie, it should return the first word in the tie.
 
 var output = getLongestOfThreeWords('these', 'three', 'words');
 console.log(output); // --> 'these'*/

function getLongestOfThreeWords( word1, word2, word3 ) {
  // your code here
  var longest = word1;
  for( var prop in arguments ) {
    if( arguments[prop].length > longest.length ) {
      longest = arguments[prop];
    }
  }
  return longest;
}

console.log( getLongestOfThreeWords( 'these', 'three', 'words' ) );