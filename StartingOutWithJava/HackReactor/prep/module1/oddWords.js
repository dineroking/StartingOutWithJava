/**
 * Created by Ronny Rosabal.
 * Date:      12/31/16
 * Objective:
 */
"use strict";

/*
 Write a function called "getOddLengthWordsAtProperty".
 
 Given an object and a key, "getOddLengthWordsAtProperty" returns an array containing all the odd length word elements of the array located at the given key.
 
 Notes:
 * If the array is empty, it should return an empty array.
 * If it contains no odd length elements, it should return an empty array.
 * If the property at the given key is not an array, it should return an empty array.
 * If there is no property at the given key, it should return an empty array.
 
 var obj = {
 key: ['It', 'has', 'some', 'words']
 };
 var output = getOddLengthWordsAtProperty(obj, 'key');
 console.log(output); // --> ['has', 'words']*/

var obj = {
  key  : ['It', 'has', 'some', 'words'],
  key2 : []
};

function getOddLengthWordsAtProperty( obj, key ) {
  if( key in obj ) {
    if( Array.isArray( obj[key] ) ) {
      return obj[key].filter( function( value, index, array ) {
        return value.length % 2 !== 0;
      } );
    }
  }
  return [];
}

console.log( getOddLengthWordsAtProperty( obj, "key" ) );
console.log( getOddLengthWordsAtProperty( obj, "key2" ) );
