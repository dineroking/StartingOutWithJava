/**
 * Created by Ronny Rosabal.
 * Date:      1/5/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "removeStringValues".
 
 Given an object, "removeStringValues" removes any properties on the given object whose values are strings.
 
 var obj = {
 name: 'Sam',
 age: 20
 }
 removeStringValues(obj);
 console.log(obj); // { age: 20 }*/

var obj = {
  name : 'Sam',
  age  : 20
};

function removeStringValues( obj ) {
  for( var prop in obj ) {
    if( obj.hasOwnProperty( prop ) && typeof obj[prop] === "string" ) {
      delete obj[prop];
    }
  }
}

removeStringValues( obj );
console.log( obj );