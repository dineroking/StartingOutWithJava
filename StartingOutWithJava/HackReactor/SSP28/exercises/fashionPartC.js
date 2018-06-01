/**
 * Created by Ronny Rosabal.
 * Date:      5/31/18
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

// your code here

function listAllBlackShoes( inventoryList ) {
  return inventoryList.reduce( function( str, designer ) {
    if( filterByShoeAttribute( designer.shoes, 'black' ).length > 0 ) {
      filterByShoeAttribute( designer.shoes, 'black' ).forEach( function( shoe ) {
        str += designer.name + ', ' + shoe.name + ', ' + shoe.price + '\n';
      } );
    }
    return str;
  }, '' );
}

// make it very clean and organized, please! :)

function filterByShoeAttribute( shoes, attr ) {
  return shoes.filter( function( shoe ) {
    return shoe.name.indexOf( attr ) !== -1;
  } );
}


// ASSERTS

function assertArrayEquals( actual, expected, testName ){
  let areEqual = true;
  let message = '';
  if( actual.length === expected.length ) {
    areEqual = actual.every( function( elem, index ) {
      return JSON.stringify( elem ) ===  JSON.stringify( expected[index] );
    } );
  } else {
    areEqual = false;
  }
  
  if( areEqual ) {
    message = 'passed';
  }  else {
    message = 'FAILED [' + testName + '] expected \"' + JSON.stringify( expected )+ '\" and got \"' + JSON.stringify( actual )+ '\"';
  }
  console.dir( message );
}

// TESTS

function testFilterByShoeAttributeWithBlackAttr() {
  let actual = filterByShoeAttribute( inventory[0].shoes, 'black' );
  let expected = [{
    name  : 'tasselled black low-top lace-up',
    price : 1000
  }];
  assertArrayEquals( actual, expected, 'it filters shoes by the color black' );
}

testFilterByShoeAttributeWithBlackAttr();
console.log( filterByShoeAttribute( inventory[0].shoes, 'plain' ) );
console.log( listAllBlackShoes( inventory ) );