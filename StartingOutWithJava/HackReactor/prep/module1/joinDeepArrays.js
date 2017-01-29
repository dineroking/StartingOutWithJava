/**
 * Created by Ronny Rosabal.
 * Date:      1/28/2017
 * Objective:
 */
"use strict";

/*Write a function called "joinArrayOfArrays".
 
 Given an array of arrays, "joinArrayOfArrays" returns a single array containing the elements of the nested arrays.
 
 var output = joinArrayOfArrays([[1, 4], [true, false], ['x', 'y']]);
 console.log(output); // --> [1, 4, true, false, 'x', 'y']
 
 You should be familiar with the "concat" method for this problem.*/

function joinArrayOfArrays( arr ) {
  return arr.reduce( function( result, innerArr, index, array ) {
    return result.concat( innerArr );
  }, [] );
}

console.log( joinArrayOfArrays( [[1, 4], [true, false], ['x', 'y']] ) );