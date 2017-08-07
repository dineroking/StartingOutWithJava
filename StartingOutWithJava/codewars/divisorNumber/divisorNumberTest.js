/**
 * Created by Ronny Rosabal.
 * Date:      8/7/17
 * Objective:
 */
"use strict";

// TESTS



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
  
}