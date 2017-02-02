/**
 * Created by Ronny Rosabal.
 * Date:      1/29/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "sumDigits".
 
 Given a number, "sumDigits" returns the sum of all its digits.
 
 var output = sumDigits(1148);
 console.log(output); // --> 14
 
 If the number is negative, the first digit should count as negative.
 
 var output = sumDigits(-316);
 console.log(output); // --> 4
 
 Notes:
 * In order to use some of the methods that will be most helpful to you, you will most likely want to do some string to number conversion and vice versa.
 * Be sure to familiarize yourself with the "toString" method, as well as the "Number" function.*/

function sumDigits( num ) {
  var chars = num.toString().split( "" );
  var hasNegative = chars[0] === "-";
  return chars.reduce( function( sum, char, index, array ) {
    if( !hasNegative || index > 1 ) {
      return sum + parseInt( char );
    } else if( hasNegative && index === 1 ) {
      return parseInt( char ) - (parseInt( char ) + parseInt( char ))
    }
    return sum;
  }, 0 );
}


console.log( sumDigits( -1148 ) );