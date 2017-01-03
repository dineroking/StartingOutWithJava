/**
 * Created by Ronny Rosabal.
 * Date:      1/1/17
 * Objective:
 */
"use strict";

/*
 Write a function called "getFirstElementOfProperty".
 
 Given an object and a key, "getFirstElementOfProperty" returns the first element of the array located at the given key.
 
 Notes:
 * If the array is empty, it should return undefined.
 * If the property at the given key is not an array, it should return undefined.
 * If there is no property at the key, it should return undefined.
 
 
 var obj = {
 key: [1, 2, 4]
 };
 var output = getFirstElementOfProperty(obj, 'key');
 console.log(output); // --> 1*/

var obj = {
  key  : [1, 2, 4],
  key2 : []
};

function getFirstElementOfProperty( obj, key ) {
  if( key in obj ) {
    if( Array.isArray( obj[key] ) && obj[key].length > 0 ) {
      return obj[key][0];
    }
  }
  return undefined;
}