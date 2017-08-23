/**
 * Created by Ronny Rosabal.
 * Date:      8/22/2017
 * Objective:
 */
"use strict";

// TEST FUNCTIONS

function testNextPrimeWithZero() {
  
  let numberToTest = 0;
  let expected = 2;
  let actual = nextPrime( numberToTest );
  
  assertEquals( actual, expected, "it finds the next prime number after 0" );
}

function testNextPrimeWithNegative() {
  
  let numberToTest = -5;
  let expected = "not a valid entry";
  let actual = nextPrime( numberToTest );
  
  assertEquals( actual, expected, "it finds the next prime number after -5" );
}

function testNextPrimeWithPrime() {
  
  let numberToTest = 1000005;
  let expected = 1000001;
  let actual = nextPrime( numberToTest );
  
  assertEquals( actual, expected, "it finds the next prime number after 17" );
}

function testIsPrimeWithNegative() {
  
  let numberToTest = -5;
  let expected = false;
  let actual = isPrime( numberToTest );
  
  assertEquals( actual, expected, "it test whether -5 is a prime number" );
}

function testIsPrimeWithZero() {
  
  let numberToTest = -5;
  let expected = false;
  let actual = isPrime( numberToTest );
  
  assertEquals( actual, expected, "it test whether 0 is a prime number" );
}

function testIsPrimeWithPrime(){
  
  let numberToTest = 13;
  let expected = true;
  let actual = isPrime( numberToTest );
  
  assertEquals( actual, expected, "it test whether 13 is a prime number" );
}

function testIsPrimeWithNonPrime() {
  
  let numberToTest = 4;
  let expected = false;
  let actual = isPrime( numberToTest );
  
  assertEquals( actual, expected, "it test whether 4 is a prime number" );
}


// ASSERTIONS

function assertEquals( actual, expected, testName ) {
  
  let message = "";       // message to display to user
  
  if( actual === expected ) {
    message = "Passed: " + testName + "\n";
  } else {
    message = "Failed: " + testName + "\n"
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


// TEST CALLS

testNextPrimeWithNegative();
testNextPrimeWithZero();
testNextPrimeWithPrime();

testIsPrimeWithNegative();
testIsPrimeWithZero();
testIsPrimeWithPrime();
testIsPrimeWithNonPrime();