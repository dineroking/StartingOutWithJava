/**
 * Created by Ronny Rosabal.
 * Date:      12/30/2016
 * Objective:
 */
"use strict";

/*Write a function called "extend".
 
 Given two objects, "extend" adds properties from the 2nd object to the 1st object.
 
 Notes:
 * Add any keys that are not in the 1st object.
 * If the 1st object already has a given key, ignore it (do not overwrite the property value).
 * Do not modify the 2nd object at all.
 
 var obj1 = {
 a: 1,
 b: 2
 };
 var obj2 = {
 b: 4,
 c: 3
 };
 
 extend(obj1, obj2);
 
 console.log(obj1); // --> {a: 1, b: 2, c: 3}
 console.log(obj2); // --> {b: 4, c: 3}*/

var obj1 = {
  a : 1,
  b : 2
};
var obj2 = {
  b : 4,
  c : 3
};

function extend( obj1, obj2 ) {
  for( var prop in obj2 ) {
    if( !(prop in obj1) ) {
      obj1[prop] = obj2[prop];
    }
  }
  return obj1;
}

console.log( extend( obj1, obj2 ));