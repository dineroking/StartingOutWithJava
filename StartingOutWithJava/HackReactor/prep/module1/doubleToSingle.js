/**
 * Created by Ronny Rosabal.
 * Date:      1/6/17
 * Objective:
 */
"use strict";

/*
 Write a function called "convertDoubleSpaceToSingle".
 
 Given a string, "convertDoubleSpaceToSingle" returns the passed in string, with all the double spaces converted to single spaces.
 
 var output = convertDoubleSpaceToSingle("string  with  double  spaces");
 console.log(output); // --> "string with double spaces"
 
 Notes:
 * In order to do this problem, you should be familiar with "String.split", and "Array.join".*/

function convertDoubleSpaceToSingle( str ) {
  return str.trim().split( "  " ).join( " " );
}

console.log( convertDoubleSpaceToSingle( "this  is  a  long  string" ) );