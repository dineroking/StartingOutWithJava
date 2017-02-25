/**
 * Created by Ronny Rosabal.
 * Date:      2/17/2017
 * Objective:
 */
"use strict";

/*
 Module 0 Wiki: https://github.com/tim-hr/reactor-prep/wiki/Module-0
 
 Write a function 'transformFirstAndLast' that takes in an array, and returns an object with:
 1) the first element of the array as the object's key, and
 2) the last element of the array as that key's value.
 
 Example input:
 ['Queen', 'Elizabeth', 'Of Hearts', 'Beyonce']
 
 Function's return value (output):
 {
 Queen : 'Beyonce'
 }
 
 Do not change the input array. Assume all elements in the input array will be of type 'string'.
 
 Note that the input array may have a varying number of elements. Your code should flexibly accommodate that.
 
 E.g. it should handle input like:
 ['Kevin', 'Bacon', 'Love', 'Hart', 'Costner', 'Spacey']
 
 Function's return value (output):
 {
 Kevin : 'Spacey'
 }*/

function transformFirstAndLast( array ) {
  var obj = {};
  obj[array[0]] = array[array.length - 1];
  return obj;
}

console.log( transformFirstAndLast( ['Kevin', 'Bacon', 'Love', 'Hart', 'Costner', 'Spacey'] ) );