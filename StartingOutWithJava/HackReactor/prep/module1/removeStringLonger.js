/**
 * Created by Ronny Rosabal.
 * Date:      1/3/2017
 * Objective:
 */
"use strict";

/*Write a function called "removeStringValuesLongerThan".
 
 Given an number and an object, "removeStringValuesLongerThan" removes any properties on the given object whose values are strings longer than the given number.
 
 var obj = {
 name: 'Montana',
 age: 20,
 location: 'Texas'
 };
 removeStringValuesLongerThan(6, obj);
 console.log(obj); // { age: 20, location: 'Texas' }*/

var obj = {
  name     : 'Montana',
  age      : 20,
  location : 'Texas'
};

function removeStringValuesLongerThan( num, obj ) {
  for( var prop in obj ) {
    if( obj.hasOwnProperty( prop ) && obj[prop].length > num ) {
      delete obj[prop];
    }
  }
}

removeStringValuesLongerThan( 1, obj );
console.log( obj );