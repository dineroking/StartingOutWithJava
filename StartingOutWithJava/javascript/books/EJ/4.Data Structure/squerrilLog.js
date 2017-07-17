/**
 * Created by Ronny Rosabal.
 * Date:      7/15/17
 * Objective:
 */
"use strict";

var journal = [];

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