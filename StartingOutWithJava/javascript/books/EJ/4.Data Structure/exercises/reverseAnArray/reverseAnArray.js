/**
 * Created by Ronny Rosabal.
 * Date:      9/9/17
 * Objective:
 */
"use strict";

/*
Arrays have a method reverse, which changes the array by inverting the order in which its elements appear. For this exercise, write two functions, reverseArray and reverseArrayInPlace. The first, reverseArray, takes an array as an argument and produces a new array that has the same elements in the inverse order. The second, reverseArrayInPlace, does what the reverse method does: it modifies the array given as argument in order to reverse its elements. Neither may use the standard reverse method.
  Thinking back to the notes about side effects and pure functions in the previous chapter, which variant do you expect to be useful in more situations? Which one is more efficient?
*/

function reverseArray( arr ) {
  
  let reversedArray = [];
  
  for( let i = arr.length; i > 0; i-- ) {
    let temp = arr[i - 1];
    reversedArray.push( temp );
  }
  return reversedArray;
}

function reverseArrayInPlace( arr ) {
  let tempELem;                                 // holds a element temporarily
  let startIndex = 0;                           // holds the start index of the array
  const middleIndex = arr.length / 2;           // holds the middle index of the array
  let lastIndex = arr.length - 1;               // holds the last index of an array
  
  for( ; startIndex < middleIndex; startIndex++ ) {
  tempELem = arr[startIndex];
  arr[startIndex] = arr[lastIndex - startIndex];
  arr[lastIndex - startIndex] = tempELem;
}
return arr;
}