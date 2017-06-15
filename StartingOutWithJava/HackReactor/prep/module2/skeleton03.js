/**
 * Created by Ronny Rosabal.
 * Date:      6/9/17
 * Objective: The skeleton03 exercise from the Hack Reactor prep course
 */
"use strict";

/*
 Basic instructions
 
 Flesh out the implementation described by this "skeleton", and test it.
 
 More instructions
 
 Implementation of WHAT, you say? What's the problem statement???
 
 Well, you should be able to tell what this code is intended to do just from reading the starter "skeleton".
 
 Assuming you find the above statement to be true upon reading the outline, well, then that illustrates the power of good outlining. You don't need a bunch of comments explaining the code. The code is effectively SELF-EXPLANATORY, even at this early, not-fully-implemented stage. This is the level of clarity that you should aim for in your own coding too.
 
 Some notes about this skeleton
 
 When you create such "skeletons" for your own programs, this is a good full-fledged sample to bear in mind.
 
 Note the mixture of real "stub" code and pseudocode.
 
 The stubs are just a few function names and a few key variable names, not whole for-loops and whatnot.
 
 The pseudocode style we want for this purpose is at the level of precise English. It also is not describing for-loops and whatnot. It also is only inside functions. Don't pseudocode functions, just write the functions as empty stubs. That saves you precious time later, with less rewriting.
 */

function findMaxRepeatCountInWord( word ) {
  // Break up individual words into individual letters.
  var letters = word.split( "" );
  var maxRepeatedCount;
  // Count the instances of each letter
  letters = letters.reduce( function( obj, letter, index, array ) {
    if( !( letter in obj ) ) {
      obj[letter] = 1;
    } else {
      obj[letter]++;
    }
    return obj;
  }, {} );
  // Iterate all the counts and find the highest
  maxRepeatedCount = letters[word.charAt( 0 )];
  for( var letter in letters ) {
    if( letters.hasOwnProperty( letter ) && letters[letter] > maxRepeatedCount ) {
      maxRepeatedCount = letters[letter];
    }
  }
  // Return this word's max repeat count
  return maxRepeatedCount;
}

function findFirstWordWithMostRepeatedChars( text ) {
  var maxRepeatCountOverall = 0;
  var wordWithMaxRepeatCount = '';
  
  // Break up input text into words (space-delimited).
  var wordList = text.split( " " );
  // For each word...
  for( var i = 0; i < wordList.length; i++ ) {
    var repeatCountForWord = findMaxRepeatCountInWord( wordList[i] );
    //  If that max repeat count is higher than the overall max repeat count, then
    if( repeatCountForWord > maxRepeatCountOverall ) {
      //    update maxRepeatCountOverall
      maxRepeatCountOverall = repeatCountForWord;
      //    update wordWithMaxRepeatCount
      wordWithMaxRepeatCount = wordList[i];
    }
    
  }
  
  return wordWithMaxRepeatCount;
}


// UNIT TESTING

function assertIsEqual( actual, extected, testName ) {
  
  var outputMessage;        // holds the message with the results of the test
  if( actual === extected ) {
    
    // create message for when the test passes
    outputMessage = "Test passed.";
    console.log( outputMessage );
    
  } else {
    
    // create message for when the test fails
    outputMessage = "Failed: [" + testName + "] ";
    outputMessage += " extected '" + extected + "'";
    outputMessage += " and it got '" + actual + "'.";
    console.log( outputMessage );
  }
}

assertIsEqual( findMaxRepeatCountInWord( "ronny" ), 2, "it checks a word and finds the letter with the highest count" );
assertIsEqual( findFirstWordWithMostRepeatedChars( "it checks a word and finds the letter with the highest count" ),
               "highest", "it finds the word with the most repeated characters." );