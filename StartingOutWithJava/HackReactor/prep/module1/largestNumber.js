/**
 * Created by Ronny Rosabal.
 * Date:      1/9/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLargestNumberAmongMixedElements".
 
 Given any array, "getLargestNumberAmongMixedElements" returns the largest number in the given array.
 
 Notes:
 * The array might contain values of a type other than numbers.
 * If the array is empty, it should return 0.
 * If the array contains no numbers, it should return 0.
 
 var output = getLargestNumberAmongMixedElements([3, 'word', 5, 'up', 3, 1]);
 console.log(output); // --> 5*/

function getLargestNumberAmongMixedElements( arr ) {
  return arr.reduce( function( largest, current, index, array ) {
    if( largest === 0 && !isNaN( current ) ) {
      return current;
    } else if( !isNaN( current ) && current > largest ) {
      return current;
    }
    return largest;
  }, 0 );
}

console.log( getLargestNumberAmongMixedElements( [3, 'word', 5, 'up', 3, 1] ) );
console.log( getLargestNumberAmongMixedElements( [] ) );