/**
 * Created by Ronny Rosabal.
 * Date:      1/6/17
 * Objective:
 */
"use strict";

/*
 Write a function called "isPersonOldEnoughToVote".
 
 Given a "person" object, that contains an "age" property, "isPersonOldEnoughToVote" returns whether the given person is old enough to vote.
 
 Notes:
 * The legal voting age in the United States is 18.
 
 var obj = {
 age: 19
 };
 var output = isPersonOldEnoughToVote(obj);
 console.log(output); // --> true*/

var obj = {
  age : 19
};

function isPersonOldEnoughToVote( obj ) {
  return obj.age >= 18;
}

console.log( isPersonOldEnoughToVote( obj ) );