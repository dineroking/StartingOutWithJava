/**
 * Created by Ronny Rosabal.
 * Date:      1/11/17
 * Objective:
 */
"use strict";

/*
 Write a function called "filterEvenLengthWords".
 
 Given an array of strings, "filterEvenLengthWords" returns an array containing only the elements of the given array whose length is an even number.
 
 var output = filterEvenLengthWords(['word', 'words', 'word', 'words']);
 console.log(output); // --> ['word', 'word']*/

function filterEvenLengthWords( arr ) {
  return arr.filter( function( word, index, array ){
    return word.length % 2 === 0;
  } );
}

console.log( filterEvenLengthWords(['word', 'words', 'word', 'words'] ) );