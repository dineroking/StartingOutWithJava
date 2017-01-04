/**
 * Created by Ronny Rosabal.
 * Date:      1/4/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "removeArrayValues".
 
 Given an object, "removeArrayValues" removes any properties whose values are arrays.
 
 var obj = {
 a: [1, 3, 4],
 b: 2,
 c: ['hi', 'there']
 }
 removeArrayValues(obj);
 console.log(obj); // --> { b: 2 }*/

var obj = {
  a : [1, 3, 4],
  b : 2,
  c : ['hi', 'there']
};

function removeArrayValues( obj ) {
  for( var prop in obj ) {
    if( obj.hasOwnProperty( prop ) && Array.isArray( obj[prop] ) ) {
      delete obj[prop];
    }
  }
}

removeArrayValues( obj );
console.log( obj );