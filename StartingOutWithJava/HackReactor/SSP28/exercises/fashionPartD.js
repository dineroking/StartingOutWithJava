/**
 * Created by Ronny Rosabal.
 * Date:      6/2/2018
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

let expected = [{
  'nameWords'       : ['tasselled', 'black', 'low-top', 'lace-up'],
  'targetWordIndex' : 3
}, {
  'nameWords'       : ['tasselled', 'green', 'low-top', 'lace-up'],
  'targetWordIndex' : 3
}, {
  'nameWords'       : ['red', 'leather', 'laced', 'sneakers'],
  'targetWordIndex' : 2
}, {
  'nameWords'       : ['black', 'leather', 'laced', 'sneakers'],
  'targetWordIndex' : 2
}];

let renderShoesByKeyword = function( inventoryList, keyword ) {
  let renderedList = [];
  inventoryList.forEach( function( designer ) {
    designer.shoes.forEach( function( shoe ) {
      if( getShoeKeywordIndex( shoe, keyword ) !== -1 ) {
        renderedList.push( renderShoeObjectWithIndex( shoe ) );
      }
    } );
  } );
  return renderedList;
};

let getShoeKeywordIndex = function ( shoe, keyword ) {
  let keywordIndex = -1;
  // break shoeName into an array using a space ' '
  let words = shoe.name.split( ' ' );
  // check each elem and if keyword is found, update keywordFound and keywordIndex
  words.forEach( function( word, wordIndex ) {
    if( word.includes( keyword ) ) {
      keywordIndex = wordIndex;
    }
  } );
  return keywordIndex;
};

let renderShoeObjectWithIndex = function( shoe ) {
  return { 'nameWords' : shoe.name.split( ' ' ), 'targetWordIndex' : getShoeKeywordIndex( shoe, 'lace') };
};



// ASSERTS

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

let testGetShoeKeywordIndexWithMatch = function() {
  let actual = getShoeKeywordIndex( inventory[0]['shoes'][0], 'lace' );
  let expected = 3;
  assertEquals( actual, expected, 'it finds the index position of the word \"lace\"' );
};

let testRenderShoesByKeyword = function() {
  let actual = renderShoesByKeyword( inventory, 'lace' );
  assertEquals( JSON.stringify( actual ), JSON.stringify( expected ), 'it renders a list of shoes that contain the word \"lace\"' );
};

// TEST CALLS
testGetShoeKeywordIndexWithMatch();
testRenderShoesByKeyword();