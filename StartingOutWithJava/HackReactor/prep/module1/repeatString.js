/**
 * Created by Ronny Rosabal.
 * Date:      2/10/17
 * Objective:
 */
"use strict";

/*
 Write a function called "repeatString".
 
 Given a string and a number, "repeatString" returns the given string repeated the given number of times.
 
 var output = repeatString('code', 3);
 console.log(output); // --> 'codecodecode'*/

function repeatString( string, num ) {
  var str = "";
  for( var i = 0; i < num; i++ ) {
    str += string;
  }
  return str;
}

console.log( repeatString( "code", 3 ) );