/**
 * Created by Ronny Rosabal.
 * Date:      2/6/17
 * Objective:
 */
"use strict";

/*
 Write a function called "isOddWithoutModulo".
 
 Given a number, "isOddWithoutModulo" returns whether the passed in number is odd.
 
 Note:
 * It does so without using the modulo operator (%).
 * It should work for negative numbers and zero.
 
 var output = isOddWithoutModulo(17);
 console.log(output); // --> true*/

function isOddWithoutModulo( num ) {
  return num / 2 > Math.floor( num / 2 );
}

console.log( isOddWithoutModulo( 17 ) );
console.log( isOddWithoutModulo( 16 ) );
console.log( isOddWithoutModulo( -17 ) );
console.log( isOddWithoutModulo( -16 ) );