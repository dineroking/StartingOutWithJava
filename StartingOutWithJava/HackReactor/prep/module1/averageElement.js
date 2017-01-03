/**
 * Created by Ronny Rosabal.
 * Date:      12/31/16
 * Objective:
 */
"use strict";

/*
 Write a function called "getAverageOfElementsAtProperty".
 
 Given an object and a key, "getAverageOfElementsAtProperty" returns the average of all the elements in the array located at the given key.
 
 Notes:
 * If the array at the given key is empty, it should return 0.
 * If the property at the given key is not an array, it should return 0.
 * If there is no property at the given key, it should return 0.
 
 
 var obj = {
 key: [1, 2, 3]
 };
 var output = getAverageOfElementsAtProperty(obj, 'key');
 console.log(output); // --> 2*/

var obj = {
  key  : [1, 2, 3],
  key2 : []
};

function getAverageOfElementsAtProperty( obj, key ) {
  if( key in obj ) {
    if( Array.isArray( obj[key] ) && obj[key].length > 0 ) {
      return obj[key].reduce( function( sum, currValue, index, array ) {
          return sum + currValue;
        }, 0 ) / obj[key].length;
    }
  }
  return 0;
}

console.log( getAverageOfElementsAtProperty( obj, "key" ) );
console.log( getAverageOfElementsAtProperty( obj, "key2" ) );