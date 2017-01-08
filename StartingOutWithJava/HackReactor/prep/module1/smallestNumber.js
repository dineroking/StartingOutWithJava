/**
 * Created by Ronny Rosabal.
 * Date:      1/7/17
 * Objective:
 */
"use strict";

/*
 Write a function called "findSmallestNumberAmongMixedElements".
 
 Given an array of mixed elements, "findSmallestNumberAmongMixedElements" returns the smallest number within the given array.
 
 Notes:
 * If the given array is empty, it should return 0.
 * If the array contains no numbers, it should return 0.
 
 var output = findSmallestNumberAmongMixedElements([4, 'lincoln', 9, 'octopus']);
 console.log(output); // --> 4*/

function findSmallestNumberAmongMixedElements( arr ) {
  var results = 0;
  var numFound = false;
  for( var i = 0; i < arr.length; i++ ) {
    if( !isNaN( arr[i] ) && !numFound ) {
      results = arr[i];
      numFound = true;
    } else if( !isNaN( arr[i] ) && arr[i] < results ) {
      results = arr[i];
    }
  }
  return results;
}

console.log( findSmallestNumberAmongMixedElements( [4, 'lincoln', 9, 'octopus', 2] ) );
console.log( findSmallestNumberAmongMixedElements( [] ) );