/**
 * Created by Ronny Rosabal.
 * Date:      1/1/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getLastElementOfProperty".
 
 Given an object and a key, "getLastElementOfProperty" returns the last element of an array located at the given key.
 
 Notes:
 * If the array is empty, it should return undefined.
 * if the property at the given key is not an array, it should return undefined.
 * If there is no property at the key, it should return undefined.
 
 var obj = {
 key: [1, 2, 5]
 };
 var output = getLastElementOfProperty(obj, 'key');
 console.log(output); // --> 5*/

var obj = {
  key  : [1, 2, 5],
  key2 : []
};

function getLastElementOfProperty( obj, key ) {
  if( key in obj ) {
    if( Array.isArray( obj[key] ) && obj[key].length > 0 ) {
      return obj[key][obj[key].length - 1];
    }
  }
  return undefined;
}

console.log( getLastElementOfProperty( obj, "key" ) );
console.log( getLastElementOfProperty( obj, "key2" ) );