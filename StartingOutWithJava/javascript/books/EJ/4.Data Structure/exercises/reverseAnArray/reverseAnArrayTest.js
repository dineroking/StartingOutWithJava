/**
 * Created by Ronny Rosabal.
 * Date:      9/9/17
 * Objective:
 */
"use strict";


/////////////////////////////////
// TEST FUNCTIONS
/////////////////////////////////

function testReverseArrayWithEvenNumberElements() {
  let actual = reverseArray( [2, 4, 5, 8] );
  let expected = [8, 5, 4, 2];
  assertArrayEquals( actual, expected, "it reverses the elements in an array with even number of elements without" +
                                       " modifying original" );
}

function testReverseArrayWithOddNumberElements() {
  let actual = reverseArray( [2, 4, 5, 8, 9] );
  let expected = [9, 8, 5, 4, 2];
  assertArrayEquals( actual, expected, "it reverses the elements in an array with odd number of elements without" +
                                       " modifying original" );
}

function testReverseArrayInPlaceWithEvenNumberElements() {
  let actual = reverseArray( [2, 4, 5, 8] );
  let expected = [8, 5, 4, 2];
  assertArrayEquals( actual, expected, "it reverses the elements of an array with even number of elements by" +
                                       " modifying the original array" );
}

function testReverseArrayInPlaceWithOddNumberElements() {
  let actual = reverseArray( [2, 4, 5, 8, 9] );
  let expected = [9, 8, 5, 4, 2];
  assertArrayEquals( actual, expected, "it reverses the elements of an array with even number of elements by" +
                                       " modifying the original array" );
}


/////////////////////////////////
// ASSERTIONS
/////////////////////////////////

function assertEquals( actual, expected, testName ) {
  
  let message = "";       // message to display to user
  
  if( actual === expected ) {
    message = "Passed: " + testName + "\n";
  } else {
    message = "Failed: " + testName + "\n"
  }
  
  message += "Expected: " + expected + "\n";
  message += "Actual: " + actual;
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


/////////////////////////////////
// TEST CALLS
/////////////////////////////////

testReverseArrayWithEvenNumberElements();
testReverseArrayWithOddNumberElements();
testReverseArrayInPlaceWithEvenNumberElements();
testReverseArrayInPlaceWithOddNumberElements();