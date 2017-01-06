/**
 * Created by Ronny Rosabal.
 * Date:      1/6/17
 * Objective:
 */
"use strict";

/*
 Write a function called "countCharacter".
 
 Given a string input and a character, "countCharacter" returns the number of occurences of a given character in the given string.
 
 var output = countCharacter('I am a hacker', 'a');
 console.log(output); // --> 3*/

function countCharacter( str, char ) {
  var count = 0;
  for( var i = 0; i < str.length; i++ ) {
    if( str.charAt( i ) === char ) {
      count++;
    }
  }
  return count;
}

console.log( countCharacter( "I am a hacker.", "a") );