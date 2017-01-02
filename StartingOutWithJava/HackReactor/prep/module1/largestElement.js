/**
 * Created by Ronny Rosabal.
 * Date:      1/1/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLargestElementAtProperty".
 
 Given an object and a key, "getLargestElementAtProperty" returns the largest element in the array located at the given key.
 
 Notes:
 * If the array is empty, it should return undefined.
 * If the property at the given key is not an array, it should return undefined.
 * If there is no property at the key, it should return undefined.
 
 var obj = {
 key: [1, 2, 4]
 };
 var output = getLargestElementAtProperty(obj, 'key');
 console.log(output); // --> 4*/

function getLargestElementAtProperty( obj, key ) {
  if( key in obj ) {
    if( Array.isArray( obj[key] ) && obj[key].length > 0 ) {
      return obj[key].reduce( function( smallest, nextValue, index, array ) {
        return nextValue > smallest ? nextValue : smallest;
      } );
    }
  }
  return undefined;
}