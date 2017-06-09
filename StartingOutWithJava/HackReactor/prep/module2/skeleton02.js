/**
 * Created by Ronny Rosabal.
 * Date:      6/3/17
 * Objective:
 */
"use strict";

/*
 An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 
 Write and test a function that determines whether a string is an isogram.
 
 Notes:
 * Assume your input is only letters.
 * Assume the empty string is an isogram.
 * Ignore case.
 * Follow the pseudocode exactly!
 * */

function isIsogram( text ) {
  
  return new Set( text ).size === text.length;
  // add each char to a set
  // https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set
  // note: a set drops dup values
  // thus, to see if all the chars were unique,
  // check length of text and the size of the set
}

function assertIsEqual( actual, expected, testName ) {
  
  if( actual === expected ) {
    
    // message if test passed
    console.log( "Test passed.");
  } else {
    
    var message;        // holds the message to display to user
    // create the message to present when the test failed
    message = "Fail: " + testName;
    message += ", it expected " + expected;
    message += " and it got " + actual;
    
    // display the message
    console.log( message );
    
  }
}

assertIsEqual( isIsogram( "rony" ), false, "it checks if a word is a isogram" );