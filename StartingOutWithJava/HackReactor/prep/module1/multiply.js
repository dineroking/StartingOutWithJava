/**
 * Created by Ronny Rosabal.
 * Date:      2/5/17
 * Objective:
 */
"use strict";

/*
 Write a function called "multiply".
 
 Given 2 numbers, "multiply" returns their product.
 
 Notes:
 * It should not use the multiply operator (*).\
 
 var output = multiply(4, 7);
 console.log(output); // --> 28*/

function multiply( num1, num2 ) {
  if( num2 === 0 ) {
    return 0;
  } else if( num1 < 0 && num2 < 0 ) {
    return Math.abs( num1 ) + multiply( num1, num2 + 1 );
  } else if( num2 < 0 ) {
    return multiply( num2, num1 );
  } else {
    return num1 + multiply( num1, num2 - 1 );
  }
}

console.log( multiply( 4, 7 ) );
console.log( multiply( -4, -7 ) );
console.log( multiply( -4, 7 ) );
console.log( multiply( 4, -7 ) );