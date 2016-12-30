/**
 * Created by Ronny Rosabal.
 * Date:      12/29/2016
 * Objective:
 */
"use strict";

/*Write a function called "countWords".
 
 Given a string, "countWords" returns an object where each key is a word in the given string, with its value being how many times that word appeared in th given  string.
 
 Notes:
 * If given an empty string, it should return an empty object.
 
 var output = countWords('ask a bunch get a bunch');
 console.log(output); --> {ask: 1, a: 2, bunch: 2, get: 1}*/

function countWords( str ) {
  var words = str.trim().split( " " );
  /*var obj = {};
  for( var i = 0; i < words.length; i++ ){
    if( words[i] in obj ){
      obj[words[i]]++;
    }else {
      obj[words[i]] = 1;
    }
  }
  return obj;*/
  return words.reduce( function( obj, value, index, array ){
    if( array.length > 1 ){
      if( value in obj ){
        obj[value]++;
      }else {
        obj[value] = 1;
      }
    }
    return obj;
  }, {} );
}

console.log( countWords(""));