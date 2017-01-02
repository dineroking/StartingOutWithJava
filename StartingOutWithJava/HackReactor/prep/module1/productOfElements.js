/**
 * Created by Ronny Rosabal.
 * Date:      1/1/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getProductOfAllElementsAtProperty".
 
 Given an object and a key, "getProductOfAllElementsAtProperty" returns the product of all the elements in the array located at the given key.
 
 Notes:
 * If the array is empty, it should return 0.
 * If the property at the given key is not an array, it should return 0.
 * If there is no property at the given key, it should return 0.
 
 var obj = {
 key: [1, 2, 3, 4]
 };
 var output = getProductOfAllElementsAtProperty(obj, 'key');
 console.log(output); // --> 24*/

var obj = {
  key  : [1, 2, 3, 4],
  key2 : []
};

function getProductOfAllElementsAtProperty( obj, key ) {
  if( key in obj ) {
    if( Array.isArray( obj[key] ) && obj[key].length > 0 ) {
      return obj[key].reduce( function( prod, nextValue, index, array ) {
        return prod * nextValue;
      } );
    }
  }
  return 0;
}

console.log( getProductOfAllElementsAtProperty( obj, "key" ) );
console.log( getProductOfAllElementsAtProperty( obj, "key2" ) );