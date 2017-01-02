/**
 * Created by Ronny Rosabal.
 * Date:      1/1/17
 * Objective:
 */
"use strict";

/*Write a function called "removeNumbersLargerThan".
 
 Given a number and an object, "removeNumbersLargerThan" removes any properties whose values are numbers greater than the given number.
 
 var obj = {
 a: 8,
 b: 2,
 c: 'montana'
 }
 removeNumbersLargerThan(5, obj);
 console.log(obj); // --> { b: 2, c: 'montana' }*/

var obj = {
  a: 8,
  b: 2,
  c: 'montana'
};

function removeNumbersLargerThan( num, obj ){
  for( var prop in obj ){
    if( obj.hasOwnProperty(prop) && obj[prop] > num ){
      delete obj[prop];
    }
  }
}

function removeNumbersLessThan( num, obj ){
  for( var prop in obj ){
    if( obj.hasOwnProperty(prop) && obj[prop] < num ){
      delete obj[prop];
    }
  }
}
removeNumbersLargerThan( 5, obj );
console.log( obj );