/**
 * Created by Ronny Rosabal.
 * Date:      5/30/18
 * Objective:
 */
'use strict';

let currentInventory = [
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

function renderInventory( inventoryList ) {
  
  let designersInfo = [];
  inventoryList.forEach( function( designer ) {
    designer.shoes.forEach( function( shoe ) {
      designersInfo.push( getDesignerName( designer ) + ', ' + getShoeName( shoe ) + ', ' + getShoePrice( shoe ) );
    } );
  } );
  
  return designersInfo.join( '\n' );
}

//Create helper functions as needed

function getDesignerName ( designer ) {
  return designer.name;
}

function getShoeName( shoe ) {
  return shoe.name;
}

function getShoePrice( shoe ) {
  return shoe.price;
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


// TESTS

// testing getDesignerName

let testGetDesignerNameWithFirstDesigner = function() {
  let actual = getDesignerName( currentInventory[0] );
  let expected = 'Brunello Cucinelli';
  assertEquals( actual, expected, 'it gets the name of the designer' );
};

// testing getShoeName

let testGetShoeNameWithFirstShoe = function() {
  let actual = getShoeName( currentInventory[0].shoes[0] );
  let expected = 'tasselled black low-top lace-up';
  assertEquals( actual, expected, 'it gets the name of the shoe' );
};

// testing getShoePrice

let testGetShoePriceWithFirstShoe = function() {
  let actual = getShoePrice( currentInventory[0].shoes[0] );
  let expected = 1000;
  assertEquals( actual, expected, 'it gets the price of the shoe' );
};

// testing renderInventory

function testRenderInventoryWithTwoDesigners() {
  let actual = renderInventory( currentInventory );
  let expected = '';
  assertEquals( actual, expected, 'it renders an inventory of designer shoes' );
}


// TEST CALLS

testGetDesignerNameWithFirstDesigner();
testGetShoeNameWithFirstShoe();
testGetShoePriceWithFirstShoe();
testRenderInventoryWithTwoDesigners();