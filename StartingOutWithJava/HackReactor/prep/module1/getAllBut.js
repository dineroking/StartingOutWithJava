/**
 * Created by Ronny Rosabal.
 * Date:      1/28/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "getAllElementsButNth".
 
 Given an array and an index, "getAllElementsButNth" returns an array with all the elements but the nth.
 
 var output = getAllElementsButNth(['a', 'b', 'c'], 1);
 console.log(output); // --> ['a', 'c']*/

function getAllElementsButNth( arr, n ) {
  return arr.filter( function( elem, index, array ) {
    return index !== n;
  } );
}

console.log( getAllElementsButNth( ['a', 'b', 'c'], 1 ) );