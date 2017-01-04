/**
 * Created by Ronny Rosabal.
 * Date:      1/4/17
 * Objective:
 */
"use strict";

/*
 Write a function called "removeNumberValues".
 
 Given an object, "removeNumberValues" removes any properties whose valuse are numbers.
 
 var obj = {
 a: 2,
 b: 'remaining',
 c: 4
 };
 removeNumberValues(obj);
 console.log(obj); // --> { b: 'remaining' }*/


var obj = {
  a : 2,
  b : 'remaining',
  c : 4
};

function removeNumberValues( obj ) {
  for( var prop in obj ) {
    if( obj.hasOwnProperty( prop ) && !isNaN( obj[prop] ) ) {
      delete obj[prop];
    }
  }
}

removeNumberValues( obj );
console.log( obj );