/**
 * Created by Ronny Rosabal.
 * Date:      7/15/17
 * Objective:
 */
"use strict";

let journal = [];

function addEntry( events, didIConvertToSquerral ) {
  
  journal.push( {
                  events           : events,
                  turnedToSquerril : didIConvertToSquerral
                } );
}

addEntry( ["work", "touched tree", "pizza", "running",
           "television"], false );
addEntry( ["work", "ice cream", "cauliflower", "lasagna",
           "touched tree", "brushed teeth"], false );
addEntry( ["weekend", "cycling", "break", "peanuts",
           "beer"], true );

console.log( journal );

// CORRELATION METHODS

function hasEvent( eventsList, eventToFind ) {
  // if eventList has eventToFind
    // return true
  // else
    // return false
}

function hasEventHasConversion( event, conversion ) {
  // if the event was in the list and the conversion was made
    // return true
  // else
    // return false
}

function noEventNoConversion( event, conversion ) {
  // if the event was not in the list and no conversion was made
    // return true
  // else
    // return false
}

function hasEventNoConversion( event, conversion ) {
  // if event was in the list and no conversion was made
    // return true
  // else
    // return false
}

function noEventHasConvertion( event, convertion ) {
  // if event was not in the list and the conversion was made
    // return true
  // else
    // return false
}

function convertEventTo1or0( event ) {
  // if event is true
    // return 1
  // else
    // return 0
}

function correlationEquation( journalEntries, eventToTest ) {
  let hasEventHasConversionCount = 0;
  let noEventNoCorversionCount = 0;
  let hasEventNoCoversionCount = 0;
  let noEventHasConversionCount = 0;
  let eventCount = 0;
  let conversionCount = 0;
  
  // foreach journal entry
    // calculate hasEventHasConversionCount
    // calculate noEventNoConversionCount
    // calculate hasEventNoConversionCount
    // calculate noEventHasConversionCount
}

// ASSERTIONS

function assertEquals( actual, expected, testName ) {
  let message = "";
  if( actual === expected ) {
    message += "Passed";
    message += "Expected: " + expected;
    message += "\nActual: " + actual;
  } else {
    message += "Failed\n";
    message += "Expexted: " + expected;
    message += "\nActual: " + actual;
  }
  return message;
}

// TESTS