/**
 * Created by Ronny Rosabal.
 * Date:      12/31/16
 * Objective:
 */
"use strict";

/*
 Write a function called "getSquaredElementsAtProperty".
 
 Given an object and a key, "getSquaredElementsAtProperty" returns an array containing all the squared elements of the array located at the given key.
 
 Notes:
 * If the array is empty, it should return an empty array.
 * If the property at the given key is not an array, it should return an empty array.
 * If there is no property at the key, it should return an empty array.
 
 var obj = {
 key: [2, 1, 5]
 };
 var output = getSquaredElementsAtProperty(obj, 'key');
 console.log(output); // --> [4, 1, 25]*/

var obj = {
  key  : [2, 1, 5],
  key2 : []
};

function getSquaredElementsAtProperty( obj, key ) {
  if( key in obj ) {
    if( Array.isArray( obj[key] ) ) {
      return obj[key].map( function( value, index, array ) {
        return value * value;
      } );
    }
  }
  return [];
}

console.log( getSquaredElementsAtProperty( obj, "key" ) );
console.log( getSquaredElementsAtProperty( obj, "key2" ) );