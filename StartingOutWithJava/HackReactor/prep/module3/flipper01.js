/**
 * Created by Ronny Rosabal.
 * Date:      8/5/2017
 * Objective:
 */
"use strict";

/*
Flip every pair of characters in a string.

  Example:
var input = 'check out how interesting this problem is, it\'s insanely interesting!';
var output = flipPairs(input);
console.log(output); // --> hcce kuo toh wnietertsni ghtsip orlbmei ,si 't sniasenyli tnreseitgn!
*!/*/

function flipPairs( str ) {
  
  let flippedStr = "";
  for( let i = 0; i < str.length; i+=2 ) {
    flippedStr += charFlipper( str.charAt(i), str.charAt(i + 1) );
  }
  return flippedStr;
}

function charFlipper( firstChar, secondCharacter ){
  return secondCharacter + firstChar;
}

function testCharFlipper() {
  let initial = "ronny";
  let actual = charFlipper( initial.charAt(0), initial.charAt(1) );
  let expected = "or";
  assertEquals( actual, expected, "it flips the order of two letters in a string");
}

function testFlipPairs() {
  
  let initial = "check out how interesting this problem is, it\'s insanely interesting!";
  let actual = flipPairs( initial );
  let expected = "hcce kuo toh wnietertsni ghtsip orlbmei ,si 't sniasenyli tnreseitgn!";
  assertEquals( actual, expected, "it flips every two characters in a string");
}

function assertEquals( actual, expected, testName ) {
  if( actual === expected ) {
    console.log( "passed" );
  } else {
    console.log( "failed [" + testName +"] \nexpected: \t" + expected + " \nactual: \t" + actual );
  }
}

testCharFlipper();
testFlipPairs();