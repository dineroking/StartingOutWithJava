/**
 * Created by Ronny Rosabal.
 * Date:      5/30/18
 * Objective:
 */
'use strict';

function findLongestPalindrome(sentence) {
  // split sentence into words
  let words = sentence.split( ' ' );
  // iterate words and collect the palindromes
  let palindromes = words.filter( function( elem ) {
    return isPalindrome( elem );
  } );
  // sort the list of palindromes by word length
  palindromes.sort( sortAscendingByLength );
  // return the largest item in the sorted list
  return palindromes[palindromes.length - 1];
}


function reverseString( string ) {
  let letters = string.split( '' );
  letters.reverse();
  return letters.join( '' );
}

function isPalindrome(word) {
  // hint: you can detect palindromes by comparing a string to its reverse
  return word === reverseString( word );
}

function sortAscendingByLength(a, b) {
  return a.length - b.length;
}




// ASSERTS

let assertEquals = function( actual, expected, testName ) {
  let message = '';
  if( actual === expected ) {
    message = 'passed';
  } else {
    message = 'FAILED [' + testName + '] expected \"' + expected + '\" but got \"' + actual + '\"';
  }
  console.log( message );
};

let assertArrayEquals = function( actual, expected, testName ) {
  let message = '';
  let areEqual = true;
  if( actual.length === expected.length ) {
    areEqual = actual.every( function( elem, index ) {
      return elem === expected[index];
    } );
  } else {
    areEqual = false;
  }
  if( areEqual ) {
    message = 'passed';
  } else {
    message = 'FAILED [' + testName + '] expected \"' + expected + '\" but got \"' + actual + '\"';
  }
  console.log( message );
};

// TESTS

// testing reverseString

let testReverseStringWithEvenString = function() {
  let actual = reverseString( 'word' );
  let expected = 'drow';
  assertEquals( actual, expected, 'it reverses the word \"word\"' );
};

let testReverseStringWithOddString = function() {
  let actual = reverseString( 'words' );
  let expected = 'sdrow';
  assertEquals( actual, expected, 'it reverses the word \"words\"' );
};

// testing isPalindrome

let testIsPalindromeWithPalindrome = function() {
  let actual = isPalindrome( 'alula' );
  let expected = true;
  assertEquals( actual, expected, 'it checks that the word \"alula\" is a palindrome' );
};

let testIsPalindromeWithoutPalindrome = function() {
  let actual = isPalindrome( 'cholestasis' );
  let expected = false;
  assertEquals( actual, expected, 'it checks that the word \"cholestasis\" is a palindrome' );
};

// testing sortAscendingByLength

let testSortAscendingByLengthWithDifferentLengthWords = function() {
  let actual = ['a', 'arrow', 'does', 'man'].sort( sortAscendingByLength );
  let expected = ['a', 'man', 'does', 'arrow' ];
  assertArrayEquals( actual, expected, 'it sorts a string array in ascending order by length' );
};

let testSortAscendingByLengthWithRepeatingLengthWords = function() {
  let actual = ['some', 'arrow', 'does', 'a'].sort( sortAscendingByLength );
  let expected = ['a', 'some', 'does', 'arrow' ];
  assertArrayEquals( actual, expected, 'it sorts a string array in ascending order by length' );
};

//testing findLongestPalindrome

let testFindLongestPalindromeWithEqualLengths = function() {
  let actual = findLongestPalindrome( 'Our civic duty is to kayak' );
  let expected = 'kayak';
  assertEquals( actual, expected, 'it checks a sentence for the longest palindrome' );
};

let testFindLongestPalindromeWithoutEqualLengths = function() {
  let actual = findLongestPalindrome( 'Our civic duty is to kayak without a rotator as you well know' );
  let expected = 'rotator';
  assertEquals( actual, expected, 'it checks a sentence for the longest palindrome' );
};

let testFindLongestPalindromeWithMixedCase = function() {
  let actual = findLongestPalindrome( 'Our civic duty is to kayak without a RoTaToR as you well know' );
  let expected = 'RoTaToR';
  assertEquals( actual, expected, 'it checks a sentence for the longest palindrome' );
};




// test calls

testReverseStringWithEvenString();
testReverseStringWithOddString();
testIsPalindromeWithoutPalindrome();
testIsPalindromeWithPalindrome();
testSortAscendingByLengthWithDifferentLengthWords();
testSortAscendingByLengthWithRepeatingLengthWords();
testFindLongestPalindromeWithEqualLengths();
testFindLongestPalindromeWithMixedCase();
testFindLongestPalindromeWithoutEqualLengths();