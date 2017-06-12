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

function findLongestPalindrome(sentence) {
  // split sentence into words
  // iterate words and collect the palindromes
  // sort the list of palindromes by word length
  // return the largest item in the sorted list
}

function reverseString(string) {
}

function isPalindrome(word) {
  // hint: you can detect palindromes by comparing a string to its reverse
}

function sortAscendingByLength(a, b) {
  if (a.length > b.length) {
    return 1;
  } else if (a.length < b.length) {
    return -1;
  }
  return 0;
}