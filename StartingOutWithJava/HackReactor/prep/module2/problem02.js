/**
 * Created by Ronny Rosabal.
 * Date:      6/20/17
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
 
 Now output the average cost of all shoes per designer in this format:
 
 var expected = {
 'designers': [
 {
 'name': 'Brunello Cucinelli',
 'averagePrice': 1025
 },
 {
 'name': 'Gucci',
 'averagePrice': 850
 }
 ]
 };
 
 Write your own unit tests.*/

/**
 * renderDesignerAverage renders an object that has an array with each designer and his/her average shoe price
 * @param inventory the inventory list with all the designers and their shoes' info
 * @returns {{}} an object with array of designers and their average shoe price
 */
function renderDesignerAverage( inventory ) {
  
  var object = {};      // holds an object with an array of designers
  
  object.designers = inventory.map( function( designer, designerIndex, array ) {
    return {
      "name"         : getDesignerName( inventory, designerIndex ),
      "averagePrice" : calcAveragePriceForDesigner( inventory, designerIndex )
    };
  } );
  
  return object;
  
}

/**
 * getDesignerName returns the name of a specified designer
 * @param inventory the list of all the designers and their shoes' info
 * @param designerNumber the number of a particular designer
 */
function getDesignerName( inventory, designerNumber ) {
  return inventory[designerNumber].name;
}

/**
 * calCesignerShoePriceTotal calculates the total price of all the shoes of a particular designer
 * @param inventory the list of all the designers and their shoes' info
 * @param designerNumber the number of a particular designer
 * @returns {*} the total price of the shoes
 */
function calcDesignerShoePriceTotal( inventory, designerNumber ) {
  return inventory[designerNumber].shoes.reduce( function( sum, shoe, index, array ) {
    return sum + shoe.price;
  }, 0 );
}

/**
 * getNumberOfShoes returns the total number of shoes in a designer's collection
 * @param inventory the list of all the designers and their shoes' info
 * @param designerNumber the number of a particular designer
 * @returns {Number} the total number of shoes in a designer's collection
 */
function getNumberOfShoes( inventory, designerNumber ) {
  return inventory[designerNumber].shoes.length;
}

/**
 * calcAveragePriceForDesigner calculates the average shoe price for a designer's collection of shoes
 * @param inventory the list of all the designers and their shoes' info
 * @param designerNumber the number of a particular designer
 * @returns {number} the average price of the shoes
 */
function calcAveragePriceForDesigner( inventory, designerNumber ) {
  return calcDesignerShoePriceTotal( inventory, designerNumber ) / getNumberOfShoes( inventory, designerNumber );
}


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


// TEST SAMPLES

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

var expected = {
  'designers' : [
    {
      'name'         : 'Brunello Cucinelli',
      'averagePrice' : 1025
    },
    {
      'name'         : 'Gucci',
      'averagePrice' : 850
    }
  ]
};

assertIsEqual( calcDesignerShoePriceTotal( inventory, 0 ), 4100, "it calculates the total price of all the shoes of" +
                                                                 " a designer" );
assertIsEqual( getDesignerName( inventory, 0 ), "Brunello Cucinelli", "it finds the name of a specified designer" );

assertIsEqual( getNumberOfShoes( inventory, 0 ), 4, "it finds the number of shoes in a designers collection" );

assertIsEqual( calcAveragePriceForDesigner( inventory, 0 ), 4100 / 4, "it calculates the average price of shoes per" +
                                                                      " desinger" );
assertIsEqual( renderDesignerAverage( inventory ), expected, "it renders the average price for each designer" );

console.log( renderDesignerAverage( inventory ) );