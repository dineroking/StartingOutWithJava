/**
 * Created by Ronny Rosabal.
 * Date:      4/10/17
 * Objective:
 */
"use strict";

function average( numbers ) {
  // process array of numbers
  return sum( numbers ) / numbers.length;
  
}

function sum( numbers ) {
  return numbers.reduce( function( result, next, index, array ) {
    return result + next;
  }, 0 );
}

function assertEquals( actual, expected, testName ) {
  if( actual === expected ) {
    console.log( testName + ": passed" );
  } else {
    var message = "Failed: [" + testName;
    message += "] expected \"" + expected;
    message += "\" and got \"" + actual + "\"";
    console.log( message );
  }
}

// sum tests
assertEquals( sum( [1, 2, 3] ), 6, "it adds all the numbers in an array" );
assertEquals( sum( [-1, 2, 3] ), 4, "it adds all the numbers in an array" );
assertEquals( sum( [-1, -2, -3] ), -6, "it adds all the numbers in an array" );

// average tests
assertEquals( average( [1, 2, 3] ), 2, "it averages the numbers in an array" );
assertEquals( average( [-1, 2, 3, 0] ), 1, "it averages the numbers in an array" );
assertEquals( average( [-1, -2, -3] ), -2, "it averages the numbers in an array" );