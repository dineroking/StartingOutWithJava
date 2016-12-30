/**
 * Created by Ronny Rosabal.
 * Date:      12/30/2016
 * Objective:
 */
"use strict";

/*Write a function called "getElementsThatEqual10AtProperty".
 
 Given an object and a key, "getElementsThatEqual10AtProperty" returns an array containing all the elements of the array located at the given key that are equal to ten.
 
 Notes:
 * If the array is empty, it should return an empty array.
 * If the array contains no elements equal to 10, it should return an empty array.
 * If the property at the given key is not an array, it should return an empty array.
 * If there is no property at the key, it should return an empty array.
 
 var obj = {
 key: [1000, 10, 50, 10]
 };
 var output = getElementsThatEqual10AtProperty(obj, 'key');
 console.log(output); // --> [10, 10]*/

var obj = {
  key : [1000, 10, 50, 10]
};

function getElementsThatEqual10AtProperty( obj, key ) {
  var matchedKeys = [];
  if( key in obj ) {
    if( Array.isArray( obj[key] ) ) {
      obj[key].forEach( function( value, index, array ) {
        if( value === 10 ) {
          matchedKeys.push( value );
        }
      } );
    }
  }
  return matchedKeys;
}

console.log( getElementsThatEqual10AtProperty( obj, 'key' ) );