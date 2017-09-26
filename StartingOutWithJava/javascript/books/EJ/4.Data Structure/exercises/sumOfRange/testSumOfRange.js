/**
 * Created by Ronny Rosabal.
 * Date:      8/24/17
 * Objective:
 */
"use strict";


// TEST FUNCTIONS

function testRangeWithNoStep() {
  
  let actual = range( 1, 10 );
  let expected = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  
  assertArrayEquals( actual, expected, "it creates an array with elements from 1 to 10 with single steps" );
  
}

function testRangeWithPositiveStep() {
  
  let actual = range( 1, 10, 3 );
  let expected = [1, 4, 7, 10];
  
  assertArrayEquals( actual, expected, "it creates an array with elements from 1 to 10 with three steps" );
  
}

function testRangeWithNegativeStep() {
  
  let actual = range( 10, 1, -3 );
  let expected = [10, 7, 4, 1];
  
  assertArrayEquals( actual, expected, "it creates an array with elements from 10 to 1 with three steps" );
  
}

function testRangeSumWithPositiveElements() {
  
  let actual = rangeSum( range( 1, 10 ) );
  let expected = 55;
  
  assertEquals( actual, expected, "it adds all the elements in an array with elements from 1 to 10" );
}

function testRangeSumWithNegativeElements() {
  
  let actual = rangeSum( range( -1, -10, -1 ) );
  let expected = -55;
  
  assertEquals( actual, expected, "it add all the elements in an array with elements from -1 to -10" );
}


// ASSERTIONS

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


// CALLS TESTS

testRangeWithNoStep();
testRangeWithPositiveStep();
testRangeWithNegativeStep();
testRangeSumWithPositiveElements();
testRangeSumWithNegativeElements();