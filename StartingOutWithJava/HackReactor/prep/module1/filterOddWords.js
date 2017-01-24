/**
 * Created by Ronny Rosabal.
 * Date:      1/9/17
 * Objective:
 */
"use strict";

/*
 Write a function called "filterOddLengthWords".
 
 Given an array of string, "filterOddLengthWords" returns an array containing only the elements of the given array whose lengths are odd numbers.
 
 var output = filterOddLengthWords(['there', 'it', 'is', 'now']);
 console.log(output); // --> ['there', "now']*/

function filterOddLengthWords( arr ) {
  return arr.filter( function( words, index, array ) {
    return words.length % 2 !== 0;
  } );
}

console.log( filterOddLengthWords( ['there', 'it', 'is', 'now'] ) );