/**
 * Created by Ronny Rosabal.
 * Date:      2/11/17
 * Objective:
 */
"use strict";

/*
 Write a function called "or".
 
 Given 2 boolean expressions, "or" returns true or false, corresponding to the || operator.
 
 Notes:
 * Do not use the || operator.
 * Use ! and && operators instead.
 
 var output = or(true, false);
 console.log(output); // --> true;*/

function or( exp1, exp2 ) {
  return !( !exp1 && !exp2 );
}

console.log( "expects true:", or( true, true ) );
console.log( "expects false:", or( false, false ) );
console.log( "expects true:", or( true, false ) );
console.log( "expects true:", or( false, true ) );