/**
 * Created by Ronny Rosabal.
 * Date:      12/31/2016
 * Objective:
 */
"use strict";

/*Write a function called "countAllCharacters".
 
 Given a string, "countAllCharacters" returns an object where each key is a character in the given string. The value of each key should be how many times each character appeared in the given string.
 
 Notes:
 * If given an empty string, countAllCharacters should return an empty object.
 
 var output = countAllCharacters('banana');
 console.log(output); // --> {b: 1, a: 3, n: 2}*/

function countAllCharacters( string ) {
  var chars = string.trim().split( "" );
  console.log( chars );
  return chars.reduce( function( obj, value, index, array ) {
    if( value !== " " ) {
      if( !(value in obj ) ) {
        obj[value] = 1;
      } else {
        obj[value]++;
      }
    }
    return obj;
  }, {} );
}

console.log( countAllCharacters( "banana" ) );
console.log( countAllCharacters( "" ) );
console.log( countAllCharacters( "this is a string " ) );