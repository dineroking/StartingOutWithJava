/**
 * Created by Ronny Rosabal.
 * Date:      6/21/17
 * Objective:
 */
"use strict";

/*
 This is a variation of the "Fashion Inventory" problem.
 
 Please DO NOT paste code from before, however. Tackle each problem on its own.
 
 It's the same inventory data structure as earlier:
 
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
 
 Now find all the black shoes. It's the same output as part 1, but filtered to only shoe names that contain "black" in them.
 
 Brunello Cucinelli,tasselled black low-top lace-up,1000
 Gucci,black leather laced sneakers,900
 
 Write your own unit tests.*/

// CODE

/**
 * renderInventory renders a list of the inventory of a specific color of shoes
 * @param inventory the complete inventory list
 * @returns {string} the list rendered by the specified color
 */
function renderInventory( inventory ) {
  
  var inventoryList = "";     // the list of designers with black shoes
  
  inventory.forEach( function( designer, designerIndex, designerArray ) {
    designer.shoes.forEach( function( shoe, shoeIndex, shoeArray ) {
      if( filterShoeByColor( inventory, designerIndex, shoeIndex, "black" ) ) {
        
        // if the color of shoes appear, add them to the list
        inventoryList += printArguments( getDesignerName( inventory, designerIndex ),
                                         getShoeName( inventory, designerIndex, shoeIndex ),
                                         getShoePrice( inventory, designerIndex, shoeIndex ) ) + "\n";
      }
    } );
  } );
  
  return inventoryList;
  
}

/**
 * getDesignerName returns the name of a specified designer
 * @param inventory the complete inventory list
 * @param designerNumber the specific designer's number
 * @return {string} the name of the designer
 */
function getDesignerName( inventory, designerNumber ) {
  return inventory[designerNumber].name;
}

/**
 * getShoeName returns the name of the designer
 * @param inventory the complete inventory list
 * @param designerNumber the number of the designer
 * @param shoeNumber the number of the shoe
 * @return {string} the name of the shoe
 */
function getShoeName( inventory, designerNumber, shoeNumber ) {
  return inventory[designerNumber].shoes[shoeNumber].name;
}

/**
 * getShoePrice returns the price of the specified shoe
 * @param inventory the complete inventory list
 * @param designerNumber the number of the designer
 * @param shoeNumber the number of the shoe
 * @return {number} the price of the shoe
 */
function getShoePrice( inventory, designerNumber, shoeNumber ) {
  return inventory[designerNumber].shoes[shoeNumber].price;
}

/**
 * filterShoeByColor returns true if a shoe of the specified color is found or false otherwise
 * @param inventory the complete inventory list
 * @param designerNumber the designer number
 * @param shoeNumber the shoe number
 * @param shoeColor the color to filter for
 * @return {boolean} true if a shoe of the specified color is found or false otherwise
 */
function filterShoeByColor( inventory, designerNumber, shoeNumber, shoeColor ) {
  return inventory[designerNumber].shoes[shoeNumber].name.indexOf( shoeColor ) !== -1;
}

/**
 * printArguments prints the arguments passed to it
 * @return {string} a formatted string with the arguments
 */
function printArguments() {
  
  var formattedArguments = "";        // holds the arguments formatted
  for( var argument in arguments ) {
    if( arguments.hasOwnProperty( argument ) ) {
      if( parseInt( argument ) === arguments.length - 1 ) {
        formattedArguments += arguments[argument];
      } else {
        formattedArguments += arguments[argument] + ", "
      }
    }
  }
  
  return formattedArguments;
}

// UNIT TESTS

function assertIsEqual( actual, expected, testName ) {
  
  var message;      // holds the passed or failed message to be displayed
  
  if( actual === expected ) {
    
    // create the passed message
    message = "Test passes.";
  } else {
    
    // create the failed message
    message = "Failed [" + testName + "], ";
    message += "expected " + expected;
    message += " and got " + actual;
  }
  
  // display message
  console.log( message );
}


// TEST LIST

var inventory = [
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

console.log( printArguments( "r", "o", "n", "n", "y" ) );
console.log( renderInventory( inventory ) );