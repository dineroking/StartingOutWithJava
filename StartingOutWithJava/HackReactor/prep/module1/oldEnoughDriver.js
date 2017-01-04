/**
 * Created by Ronny Rosabal.
 * Date:      1/4/2017
 * Objective:
 */
"use strict";

/*
 Write a function called "isPersonOldEnoughToDrive".
 
 Given a "person" object, that contains an "age" property, "isPersonOldEnoughToDrive" returns whether the given person is old enough to drive.
 
 Notes:
 * The legal driving age in the United States is 16.
 
 var obj = {
 age: 16
 };
 var output = isPersonOldEnoughToDrive(obj);
 console.log(output); // --> true*/

var obj = {
  age : 16
};

function isPersonOldEnoughToDrive( obj ) {
  return obj.age >= 16;
}

console.log( isPersonOldEnoughToDrive( obj ) );