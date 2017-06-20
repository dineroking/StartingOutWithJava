/**
 * Created by Ronny Rosabal.
 * Date:      6/18/17
 * Objective:
 */
"use strict";

/*
 You have a fashion catalog, an inventory of items from various high-fashion designers.
 Each designer has a lineup of shoes. Each shoe has a name and a price.
 
 It looks like this:
 var currentInventory = [
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
 
 Look up all the shoes across all the designers and list them out in a flat list:
 {designer name}, {shoe name}, {price}
 {designer name}, {shoe name}, {price}
 
 E.g.,
 Brunello Cucinelli, tasselled black low-top lace-up, 1000
 Brunello Cucinelli, tasselled green low-top lace-up, 1100
 ...
 
 Write your own unit tests.*/

function renderInventory( inventory ) {
  // your code here
  var inventoryList = "";         // the list of inventory
  
  inventory.forEach( function( designer, designerIndex, inventoryArray ) {
    designer.shoes.forEach( function( shoe, shoeIndex, shoesArray ) {
      inventoryList += printArguments( getDesignerName( inventoryArray, designerIndex ),
                                       getShoeName( inventoryArray, designerIndex, shoeIndex ),
                                       getShoePrice( inventoryArray, designerIndex, shoeIndex ) ) + "\n";
    } );
  } );
  // hint: before you just dive into coding...
  // it's a good idea to sketch out a skeleton like you've been seeing earlier in this module...
  console.log( inventoryList );
}

function getDesignerName( inventory, designerNumber ) {
  
  // return the name of the designer
  return inventory[designerNumber].name;
}

function getShoeName( inventory, designerNumber, shoeNumber ) {
  
  // return the name of the shoe
  return inventory[designerNumber].shoes[shoeNumber].name;
}

function getShoePrice( inventory, designerNumber, shoeNumber ) {
  
  // return the price of the shoe
  return inventory[designerNumber].shoes[shoeNumber].price
}

function printArguments() {
  
  var args = "";           // the args to be printed
  for( var argument in arguments ) {
    
    if( arguments.hasOwnProperty( argument ) ) {
      
      if( parseInt( argument ) === arguments.length - 1 ) {
        
        // do not add a coma after the last element
        args += arguments[argument];
      } else {
        
        args += arguments[argument] + ", ";
      }
    }
  }
  
  // display the arguments
  return args;
}


// SAMPLE TO TEST

var currentInventory = [
  {
    name  : 'Brunello Cucinelli',
    shoes : [
      { name : 'tasselled black low-top lace-up', price : 1000 },
      { name : 'tasselled green low-top lace-up', price : 1100 },
      { name : 'plain beige suede moccasin', price : 950 },
      { name : 'plain olive suede moccasin', price : 1050 }
    ]
  },
  {
    name  : 'Gucci',
    shoes : [
      { name : 'red leather laced sneakers', price : 800 },
      { name : 'black leather laced sneakers', price : 900 }
    ]
  }
];

// UNIT TESTS

function assertIsEqual( actual, expected, testName ) {
  
  var message;          // holds the passed or failed message
  
  if( actual === expected ) {
    
    // create the passed message
    message = "Test passed.";
  } else {
    
    // create the failed message
    message = "Failed [" + testName + "],";
    message += " expected " + expected;
    message += " and got " + actual;
  }
  
  // display the message
  console.log( message );
}

// test getDesignerName

assertIsEqual( getDesignerName( currentInventory, 0 ), "Brunello Cucinelli", "it finds the name of the specified" +
                                                                             " designer" );

// test getShoeName

assertIsEqual( getShoeName( currentInventory, 0, 0 ), "tasselled black low-top lace-up", "it finds the name of the" +
                                                                                         " specified shoe" );

// test getShoePrice

assertIsEqual( getShoePrice( currentInventory, 0, 0 ), 1000, "it finds the price of the specified shoe" );

// test printArguments

assertIsEqual( printArguments( 1, 2, 3 ), "1, 2, 3", "it prints the arguments separated by a comma" );

renderInventory( currentInventory );