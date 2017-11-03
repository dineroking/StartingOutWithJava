/**
 * Created by Ronny Rosabal.
 * Date:      9/9/17
 * Objective:
 */
"use strict";

////////////////////////////////////////////////////////////////////////////////
//FUNCTIONS TO TEST
////////////////////////////////////////////////////////////////////////////////

function testArrayToListOfNumbers() {
  let actual = arrayToList( [1, 2, 3], 0 );
  let expected = { "value" : 1, "rest" : { "value" : 2, "rest" : { "value" : 3, "rest" : null } } };
  console.log( actual );
}

function testListToArrayOfNumbers() {
  let objToTest = { "value" : 1, "rest" : { "value" : 2, "rest" : { "value" : 3, "rest" : { "value" : 4, "rest" : null } } } };
  let actual = listToArray( objToTest );
  let expected = [1, 2, 3, 4];
  assertArrayEquals( actual, expected, "it tests a list converted to an array");
}


////////////////////////////////////////////////////////////////////////////////
//ASSERTIONS
////////////////////////////////////////////////////////////////////////////////

function assertEquals( actual, expected, testName ) {
  
  let message = "";       // message to display to user
  
  if( actual === expected ) {
    message = "Passed: \t" + testName + "\n";
  } else {
    message = "Failed: \t" + testName + "\n"
  }
  
  message += "Expected: \t" + expected + "\n";
  message += "Actual: \t" + actual;
  console.log( message );
  
}

function assertArrayEquals( actual, expected, testName ) {
  
  let message = "Failed: " + testName + "\n";
  let actualMessage = "Actual: \t";
  let expectedMessage = "Expected: \t";
  let areEqual = true;
  
  if( actual.length === expected.length ) {
    actual.forEach( function( element, index, array ) {
      if( element !== expected[index] ) {
        areEqual = false;
      }
    } );
  } else {
    areEqual = false;
  }
  
  actualMessage += JSON.stringify( actual );
  expectedMessage += JSON.stringify( expected );
  
  if( areEqual ) {
    message = "Passed: " + testName + "\n";
    message += expectedMessage + "\n";
    message += actualMessage + "\n";
  } else {
    message += expectedMessage + "\n";
    message += actualMessage + "\n";
  }
  
  console.log( message );
}

function assertObjectEquals( actual, expected, testName ) {

}


////////////////////////////////////////////////////////////////////////////////
//TEST CALLS
////////////////////////////////////////////////////////////////////////////////
testArrayToListOfNumbers();
testListToArrayOfNumbers();