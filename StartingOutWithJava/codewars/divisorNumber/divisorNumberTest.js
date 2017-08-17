/**
 * Created by Ronny Rosabal.
 * Date:      8/7/17
 * Objective:
 */
"use strict";

// TEST FUNCTIONS

function testGetDivisorCntWithOneDivisor() {
  
  let actualDivisorCnt = getDivisorCnt( 4 );
  let expectedDivisorCnt = 1;
  assertEquals( actualDivisorCnt, expectedDivisorCnt, "it finds number of divisors for number 4");
  
}

function testGetDivisorsWithEvenNumber() {
  
  let actualDivisors = getDivisors( 8 );
  let expectedDivisors = [1, 2, 4, 8];
  assertArrayEquals( actualDivisors, expectedDivisors, "it gets the divisors of number 8" );
  
}

function testGetDivisorsWithOddNumber() {
  
  let actualDivisors = getDivisors( 15 );
  let expectedDivisors = [1, 3, 5, 15];
  assertArrayEquals( actualDivisors, expectedDivisors, "it gets the divisors of number 15" );
  
}

function testGetDivisorsWithNegativeNumber() {
  
  let actualDivisors = getDivisors( -8 );
  let expectedDivisors = [1, -1, 2, -2, 4, -4, 8, -8];
  assertArrayEquals( actualDivisors, expectedDivisors, "it gets the divisors of number -8" );
  
}

function testGetDivisorsWithPrimeNumber() {
  
  let actualDivisors = getDivisors( 19 );
  let expectedDivisors = [1, 19];
  assertArrayEquals( actualDivisors, expectedDivisors, "it gets the divisors of number 19" );
  
}


// ASSERTIONS

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


// TEST CALLS

// getDivisors
testGetDivisorsWithEvenNumber();
testGetDivisorsWithOddNumber();
testGetDivisorsWithNegativeNumber();
testGetDivisorsWithPrimeNumber();

// getDivisorCnt
testGetDivisorCntWithOneDivisor();