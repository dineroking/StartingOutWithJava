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
  let expected = { "value" : 1, "list" : { "value" : 2, "list" : { "value" : 3, "list" : null } } };
  assertObjectEquals( actual, expected, "tests an array converted into an list" );
}

function testListToArrayOfNumbers() {
  let objToTest = {
    "value" : 1,
    "list"  : { "value" : 2, "list" : { "value" : 3, "list" : { "value" : 4, "list" : null } } }
  };
  let actual = listToArray( objToTest );
  let expected = [1, 2, 3, 4];
  assertArrayEquals( actual, expected, "it tests a list converted to an array" );
}

function testPrependOfNumbers() {
  let objToTest = { "value" : 1, "list" : { "value" : 2, "list" : null } };
  let actual = prepend( 19, objToTest );
  let expected = { "value" : 19, "list" : { "value" : 1, "list" : {"value" : 2, "list" : null } } };
  assertObjectEquals( actual, expected, "it tests adding a value to the front of a list" );
}

function testNthWithElement() {
  
  let objToTest = { "value" : 1, "list" : { "value" : 2, "list" : { "value" : 3, "list" : null } } };
  let actual = nth( 3, objToTest );
  let expected = 3;
  assertEquals( actual, expected, "it looks for an element in a list" );
  
}

function testNthWithoutELement() {
  
  let objToTest = { "value" : 1, "list" : { "value" : 2, "list" : { "value" : 3, "list" : null } } };
  let actual = nth( 3, objToTest );
  let expected = undefined;
  assertEquals( actual, expected, "it looks for an element in a list" );
  
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
  
  let message = "Failed: " + testName + "\n";
  let actualMessage = "Actual: \t";
  let expectedMessage = "Expected: \t";
  let areEqual = true;
  
  if( JSON.stringify( actual ) !== JSON.stringify( expected ) ) {
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


////////////////////////////////////////////////////////////////////////////////
//TEST CALLS
////////////////////////////////////////////////////////////////////////////////
testArrayToListOfNumbers();
testListToArrayOfNumbers();
testPrependOfNumbers();
testNthWithElement();
testNthWithoutELement();