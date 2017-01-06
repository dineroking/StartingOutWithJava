/**
 * Created by Ronny Rosabal.
 * Date:      1/6/17
 * Objective:
 */
"use strict";

/*
 Write a function called "findShortestWordAmongMixedElements".
 
 Given an array, "findShortestWordAmongMixedElements" returns the shortest string within the given array.
 
 Notes:
 * If there are ties, it should return the first element to appear in the given array.
 * Expect the given array to have values other than strings.
 * If the given array is empty, it should return an empty string.
 * If the given array contains no strings, it should return an empty string.
 
 var output = findShortestWordAmongMixedElements([4, 'two', 2, 'three']);
 console.log(output); // --> 'two'*/

function findShortestWordAmongMixedElements( arr ) {
  return arr.reduce( function( shortest, elem, index, array ) {
    if( typeof elem === "string" && shortest.length === 0 ) {
      shortest = elem;
    }else if( typeof elem === "string" && elem.length < shortest.length ) {
      shortest = elem;
    }
    return shortest;
  }, "" );
}

console.log( findShortestWordAmongMixedElements( [4, "two", 2, "three" ] ) );