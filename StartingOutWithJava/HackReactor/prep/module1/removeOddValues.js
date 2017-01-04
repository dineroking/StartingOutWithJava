/**
 * Created by Ronny Rosabal.
 * Date:      1/4/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "removeOddValues".
 
 Given an object, "removeOddValues" removes any properties whose valuse are odd numbers.
 
 var obj = {
 a: 2,
 b: 3,
 c: 4
 };
 removeOddValues(obj);
 console.log(obj); // --> { a: 2, c: 4 }*/

var obj = {
  a : 2,
  b : 3,
  c : 4
};

function removeOddValues( obj ) {
  for( var prop in obj ) {
    if( obj.hasOwnProperty( prop ) && obj[prop] % 2 !== 0 ) {
      delete obj[prop];
    }
  }
}

removeOddValues( obj );
console.log( obj );