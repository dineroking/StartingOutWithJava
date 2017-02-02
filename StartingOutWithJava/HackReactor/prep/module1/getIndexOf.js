/**
 * Created by Ronny Rosabal.
 * Date:      2/2/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "getIndexOf".
 
 Given a character and a string, "getIndexOf" returns the first position of the given character in the given string.
 
 Notes:
 * Strings are zero indexed, meaning the first character in a string is at position 0.
 * When a string contains more than one occurrence of a character, it should return the index of its first occurrence.
 * If the character does not exist in the string, it should return -1.
 * Do not use the native indexOf function in your implementation.
 
 var output = getIndexOf('a', 'I am a hacker');
 console.log(output); // --> 2*/

function getIndexOf( char, str ) {
  var ind = -1;
  str.split( "" ).forEach( function( elem, index, array ) {
    if( elem === char && ind === -1 ) {
      ind = index;
    }
  } );
  return ind;
}

console.log( getIndexOf( 'a', 'I am a hacker' ) );
console.log( getIndexOf( 'x', 'I\'m a good lover' ) );