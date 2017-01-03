/**
 * Created by Ronny Rosabal.
 * Date:      1/1/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getSumOfAllElementsAtProperty".
 
 Given an object and a key, "getSumOfAllElementsAtProperty" returns the sum of all the elements in the array located at the given key.
 
 Notes:
 * If the array is empty, it should return 0.
 * If the property at the given key is not an array, it should return 0.
 * If there is no property at the key, it should return 0.
 
 var obj = {
 key: [4, 1, 8]
 };
 var output = getSumOfAllElementsAtProperty(obj, 'key');
 console.log(output); // --> 13*/

var obj = {
  key: [4, 1, 8],
  key2: []
};

function getSumOfAllElementsAtProperty( obj, key ){
  if( key in obj ){
    if( Array.isArray( obj[key] ) ){
      return obj[key].reduce( function( sum, nextValue, index, array ){
        return sum + nextValue;
      }, 0 );
    }
  }
  return 0;
}

console.log( getSumOfAllElementsAtProperty( obj, "key" ) );
console.log( getSumOfAllElementsAtProperty( obj, "key2" ) );