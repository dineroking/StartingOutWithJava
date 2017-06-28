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

/*function renderInventory( inventory ) {
  
  var wordToSearch = "lace";  // holds the word to search for in a name
  var foundShoes = [];
  
  for( let i = 0; i < inventory.length; i++ ) {
    for( let j = 0; j < inventory[i].shoes.length; j++ ) {
      if( findWordInShoeName( inventory[i].shoes[j].name, wordToSearch ) ) {
        foundShoes.push( {
                           "nameWords"       : splitShoeName( inventory[i].shoes[j].name ),
                           "targetWordIndex" : getWordInNameIndex( inventory[i].shoes[j].name, wordToSearch )
                         } );
      }
    }
  }
  return foundShoes;
}*/

/**
 * renderInventory() renders an array with the shoes that contain a specified word
 * @param inventory the complete inventory of designers and their shoes
 * @returns {Array} an array of objects with an array of the shoe name and the index where the word was found
 */
function renderInventory( inventory ){
  
  let wordToSearch = "lace";    // the word to search for in the name of the shoes
  let foundShoes = [];          // the array to hold all of the objects with the shoe names
  
  inventory.forEach( function( designer, designerIndex, array ) {
    designer.shoes.forEach( function( shoe, shoeIndex, shoeArray ) {
      if( findWordInShoeName( shoe.name, wordToSearch ) ) {
        foundShoes.push( {
                           "nameWords"       : splitShoeName( shoe.name ),
                           "targetWordIndex" : getWordInNameIndex( shoe.name, wordToSearch )
                         } );
      }
    } );
  } );
  
  return foundShoes;
}

/**
 * findWordInShoeName() looks to see if a specified word appears in the name of the shoe
 * @param name the name of the shoe
 * @param word the word to search for
 * @returns {boolean} true if the word is found or false otherwise
 */
function findWordInShoeName( name, word ) {
  return name.indexOf( word ) !== -1;
}

/**
 * splitShoeName() splits a name/sentence into an array of words delimited by blank spaces
 * @param name the name to be split
 * @returns {Array|*} an array of the words contained in the name
 */
function splitShoeName( name ) {
  return name.split( " " );
}

/**
 * getWordInNameIndex() returns the index of the word in the name
 * @param name the name to find the work in
 * @param word the word to look for in the name
 * @returns {number} the index of where the word was found or -1 if not found
 */
function getWordInNameIndex( name, word ) {
  
  let foundIndex = -1;      // holds the index of the word if found
  
  name.split( " " ).forEach( function( elem, index, array ) {
    if( elem.indexOf( word ) !== -1 && foundIndex === -1 ) {
      foundIndex = index;
    }
  } );
  
  return foundIndex;
}


// UNIT TESTS

function assertIsEqual( actual, expected, testName ) {
  
  let message = "";       // holds the passed or failed message
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

assertIsEqual( findWordInShoeName( "black bitch laces", "lace" ), true, "it finds if a word exists in a" +
                                                                        " sentence" );
assertIsEqual( splitShoeName( "black bitch laces" ), ["black", "bitch", "laces"], "it splits a sentence" +
                                                                                  " into an array of" +
                                                                                  " words" );
assertIsEqual( getWordInNameIndex( "black bitch laces", "lace" ), 2, "it finds the index of a word in a" +
                                                                     " sentence" );


// SAMPLES

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

console.log( renderInventory( inventory ) );



// HR SOLUTION ------------------------------------------------------------------------------------------

function getLaceNameDataForShoes(inventory) {
  return getAllShoes(inventory)
  .filter(isLacedShoe)
  .map(getLaceNameDataForShoe);
}

function getAllShoes(inventory) {
  return inventory.reduce(function(shoes, goodsForDesigner) {
    return shoes.concat(goodsForDesigner.shoes);
  }, []);
}

function isLacedShoe(shoe) {
  return isLaced(shoe.name);
}

function isLaced(name) {
  return name.indexOf('lace') >= 0;
}

function getLaceNameDataForShoe(shoe) {
  var nameWords = shoe.name.split(' ');
  return {
    nameWords: nameWords,
    targetWordIndex: nameWords.findIndex(isLaced)
  };
}

function assertObjectsEqual(actual, expected, testName) {
  actual = JSON.stringify(actual);
  expected = JSON.stringify(expected);
  if (actual === expected) {
    console.log('passed [' + testName + ']');
  } else {
    console.log('FAILED [' + testName + '] Expected ' + expected + ', but got ' + actual);
  }
}

function testRendersOutputFormat() {
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
  var output = getLaceNameDataForShoes(inventory);
  var expectedOutput = [
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
  ];
  assertObjectsEqual(output, expectedOutput, 'should render output array identical to expected output array');
}

// Run test suite
testRendersOutputFormat();
