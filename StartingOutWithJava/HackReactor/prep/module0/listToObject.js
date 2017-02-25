/**
 * Created by Ronny Rosabal.
 * Date:      2/17/2017
 * Objective:
 */
"use strict";

/*
 Write a function 'fromListToObject' which takes in an array of arrays, and returns an object with each pair of elements in the array as a key-value pair.
 
 Example input:
 [['make', 'Ford'], ['model', 'Mustang'], ['year', 1964]]
 
 Function's return value (output):
 {
 make : 'Ford'
 model : 'Mustang',
 year : 1964
 }
 
 Do not change the input string. Assume that all elements in the array will be of type 'string'.
 
 Note that the input may have a different number of elements than the given sample.
 For instance, if the input had 6 values instead of 4, your code should flexibly accommodate that.*/

function fromListToObject( arr ) {
  return arr.reduce( function( obj, elem, index, array ) {
    obj[elem[0]] = elem[1];
    return obj;
  }, {} );
}

console.log( fromListToObject( [['make', 'Ford'], ['model', 'Mustang'], ['year', 1964]] ) );