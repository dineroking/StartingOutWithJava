/**
 * Created by Ronny Rosabal.
 * Date:      1/4/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "removeEvenValues".
 
 Given any object, "removeEvenValues" removes any properties whose values are even numbers.
 
 Do this in place and return the original object, do not construct a cloned object that omits the properties.
 
 var obj = {
 a: 2,
 b: 3,
 c: 4
 };
 removeEvenValues(obj);
 console.log(obj); // --> { b: 3 }*/

var obj = {
  a : 2,
  b : 3,
  c : 4
};

function removeEvenValues( obj ) {
  for( var prop in obj ) {
    if( obj.hasOwnProperty( prop ) && obj[prop] % 2 === 0 ) {
      delete obj[prop];
    }
  }
}

removeEvenValues( obj );
console.log( obj );