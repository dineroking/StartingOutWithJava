/**
 * Created by Ronny Rosabal.
 * Date:      2/3/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "getStringLength".
 
 Given a string, "getStringLength" returns the length of the given string.
 
 Notes:
 * Do NOT use any native 'length' methods.
 * You might consider using 'substring' or 'slice' as alternatives.
 
 var output = getStringLength('hello');
 console.log(output); // --> 5*/

function getStringLength( str ) {
  var count = 0;
  str.split( "" ).forEach( function( elem, index, arr ) {
    count++;
  } );
  return count;
}

console.log( getStringLength( "hello" ) );