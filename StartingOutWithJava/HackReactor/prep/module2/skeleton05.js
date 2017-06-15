/**
 * Created by Ronny Rosabal.
 * Date:      6/11/17
 * Objective:
 */
"use strict";

/*
 Find the longest single-word palindrome within a phrase.
 
 The sorting implementation required by this particular implementation strategy / outline has been provided in this case, as a convenience. Study it carefully to make sure you can create custom sort functions of your own, later.
 
 Notes:
 * Use all the functions in the skeleton.
 * If there are multiple longest palindromes of equal length, return the last one.
 * The phrase will only contain letters (no symbols, punctuation, or numbers).
 * Your palindrome detection should be case-insensitive.*/

function findLongestPalindrome( sentence ) {
  // split sentence into words
  var wordList = sentence.split( " " );
  // iterate words and collect the palindromes
  var palindromeList = wordList.filter( function( word, index, array ) {
    return isPalindrome( word );
  } );
  // sort the list of palindromes by word length
  palindromeList = palindromeList.sort( sortAscendingByLength );
  // return the largest item in the sorted list
  return palindromeList[palindromeList.length - 1];
}

function reverseString( str ) {
  // split the string into single letters
  var letterList = str.split( "" );
  // reverse the array and return it as a string
  return letterList.reverse().join( '' );
}

function isPalindrome( word ) {
  // hint: you can detect palindromes by comparing a string to its reverse
  return word.toLowerCase() === reverseString( word ).toLowerCase();
}

function sortAscendingByLength( a, b ) {
  if( a.length > b.length ) {
    return 1;
  } else if( a.length < b.length ) {
    return -1;
  }
  return 0;
}

// UNIT TESTING

function assertIsEqual( actual, expected, testName ) {
  
  var outputMessage;      // holds the pass or fail message to be displayed
  
  if( actual === expected ) {
    
    // create the passed message;
    outputMessage = "Test passed.";
  } else {
    
    // create the failed message
    outputMessage = "Failed [" + testName + "], ";
    outputMessage += "it expected " + expected + " and it got ";
    outputMessage += actual + "."
  }
  
  // display message
  console.log( outputMessage );
}

assertIsEqual( reverseString( "Ronny" ), "ynnoR",
               "it reverses a string to show the last letter as first and the first" +
               " letter as last" );
assertIsEqual( isPalindrome( "racecar" ), true, "it checks if the word is a palindrome" );

var potentialPalindromes = "Ronny and Christian are driving a racecar but mom is not at their level .";

assertIsEqual( findLongestPalindrome( potentialPalindromes ), "racecar", "it finds the longest palindrome" );