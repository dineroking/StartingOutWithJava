/**
 * Created by Ronny Rosabal.
 * Date:      6/7/17
 * Objective: book exercise to create a chessboard
 */
"use strict";

// VARIABLES

var testBoard = "# \n #";


// FUNCTIONS

function buildBoard( columns, rows ) {
  
  var board = "";           // holds the pattern of the board
  
  // run through each row
  for( var r = 0; r < rows; r++ ) {
    
    // run through each column
    for( var c = 0; c < columns; c += 2 ) {
      board += ( r % 2 === 0 ) ? "# " : " #";
    }
    // move to the next line
    board += "\n";
  }
  
  return board;
}


// ASSERTIONS

function assertIsEqual( actual, expected, testName ){
  
  var failMessage;            // holds the message when the test fails
  
  if( actual === expected ) {
    
    // display the passed message
    console.log( "Test passed" );
  } else {
    
    // create the failed message
    failMessage += "Failed: " + testName;
    failMessage += "expected '" + expected;
    failMessage += "' and got ' " + actual;
    
    // display the failed message
    console.log( failMessage );
    
  }
}
assertIsEqual( buildBoard( 2, 2 ), testBoard, "builds a chessboard");