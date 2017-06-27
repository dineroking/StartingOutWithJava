/**
 * Created by Ronny Rosabal.
 * Date:      6/25/17
 * Objective:
 */
"use strict";

/*
 This is a variation of the "Fashion Inventory" problem.
 
 Please DO NOT paste code from before, however. Tackle each problem on its own.
 
 It's the same inventory data structure:
 
 var inventory = [
 {
 name: 'Brunello Cucinelli',
 shoes: [
 {name: 'tasselled black low-top lace-up', price: 1000},
 {name: 'tasselled green low-top lace-up', price: 1100},
 {name: 'plain beige suede moccasin', price: 950},
 {name: 'plain olive suede moccasin', price: 1050}
 ]
 },
 {
 name: 'Gucci',
 shoes: [
 {name: 'red leather laced sneakers', price: 800},
 {name: 'black leather laced sneakers', price: 900}
 ]
 }
 ];
 
 The task now is to find all the laced shoes. Output shoe names that contain "lace" in them, and indicate which word contains "lace".
 
 The output format should be structured like this:
 
 [
 {
 "nameWords": [
 "tasselled",
 "black",
 "low-top",
 "lace-up"
 ],
 "targetWordIndex": 3
 },
 {
 "nameWords": [
 "tasselled",
 "green",
 "low-top",
 "lace-up"
 ],
 "targetWordIndex": 3
 },
 {
 "nameWords": [
 "red",
 "leather",
 "laced",
 "sneakers"
 ],
 "targetWordIndex": 2
 },
 {
 "nameWords": [
 "black",
 "leather",
 "laced",
 "sneakers"
 ],
 "targetWordIndex": 2
 }
 ]
 
 Assert the validity of the values and structure of your output.*/

// FUNCTIONS

function renderInventory( inventory ) {
  
  // run through all the designers in the inventory
  return inventory.map( function( desinger, designerIndex, array ){
    
    // for each designer in the inventory, run to each of his/her shoes
    // if the word is in the name of the shoe
    // create an object that holds an array of the name of the shoe splitted
    // add to the object 
  } );
  
}

function findWordInShoeName( name, word ) {
  return name.indexOf( word ) !== -1;
}

function splitShoeName( name ) {
  return name.split();
}

function getWordInNameIndex( name, word ) {
  return name.indexOf( word );
}


// UNIT TESTS

function assertIsEqual( actual, expected, testName ) {
  
  var message = "";       // holds the passed or failed message
  if( actual === expected ) {
    
    // create the pass message
    message = "Test passed.";
  } else {
    
    // create the fail message
    message = "Failed [" + testName + "], ";
    message += "expected " + expected;
    message += " and it got " + actual;
  }
  
  // display the message
  console.log( message );
}