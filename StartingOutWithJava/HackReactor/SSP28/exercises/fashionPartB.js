/**
 * Created by Ronny Rosabal.
 * Date:      5/30/2018
 * Objective:
 */
'use strict';

let inventory = [{
  name  : 'Brunello Cucinelli',
  shoes : [{
    name  : 'tasselled black low-top lace-up',
    price : 1000
  }, {
    name  : 'tasselled green low-top lace-up',
    price : 1100
  }, {
    name  : 'plain beige suede moccasin',
    price : 950
  }, {
    name  : 'plain olive suede moccasin',
    price : 1050
  }]
}, {
  name  : 'Gucci',
  shoes : [{
    name  : 'red leather laced sneakers',
    price : 800
  }, {
    name  : 'black leather laced sneakers',
    price : 900
  }]
}];


function calculateAveragePricePerDesigner ( inventoryList ) {
  let averagePrice = {};
  averagePrice['designers'] = inventoryList.map( function( designer ) {
    return { 'name' : designer.name, 'averagePrice' : calcAverageShoePrice( designer.shoes ) };
  } );
  return averagePrice;
}

//Create helper functions as needed

function calcTotalShoePrice( shoes ) {
  return shoes.reduce( function( sum, shoe ) {
    return sum + shoe.price;
  }, 0 );
}

function calcAverageShoePrice( shoes ) {
  return calcTotalShoePrice( shoes ) / shoes.length;
}


// ASSERTS

function assertObjectEquals( actual, expected, testName ) {
  let message = '';
  actual = JSON.stringify( actual );
  expected = JSON.stringify( expected );
  if( actual === expected ) {
    message = 'passed';
  } else {
    message = 'FAILED [' + testName + '] expected \"' + expected + '\" but got ' + actual + '\"';
  }
  console.log( message );
}

function assertEquals( actual, expected, testName ) {
  let message = '';
  if( actual === expected ) {
    message = 'passed';
  } else {
    message = 'FAILED [' + testName + '] expected \"' + expected + '\" but got ' + actual + '\"';
  }
  console.log( message );
}

// TESTS

function testCalcTotalShoePriceWithPositiveNumbers() {
  let actual = calcTotalShoePrice( inventory[1].shoes );
  let expected = 1700;
  assertEquals( actual, expected, 'it add all the numbers in an array' );
}

function testCalcAverageShoePriceWithPositiveNumbers() {
  let actual = calcAverageShoePrice( inventory[0].shoes );
  let expected = 1025;
  assertEquals( actual, expected, 'it calculates the average of all the numbers in an array' );
}

function testCalculateAveragePricePerDesigner() {
  let actual = calculateAveragePricePerDesigner( inventory );
  let expected = { 'designers': [ { 'name': 'Brunello Cucinelli', 'averagePrice': 1025 }, { 'name': 'Gucci', 'averagePrice': 850 } ] };
  assertObjectEquals( actual, expected, 'it creates a list of designers with the average of their shoes prices' );
}

// TESTS CALLS

testCalcTotalShoePriceWithPositiveNumbers();
testCalcAverageShoePriceWithPositiveNumbers();
testCalculateAveragePricePerDesigner();