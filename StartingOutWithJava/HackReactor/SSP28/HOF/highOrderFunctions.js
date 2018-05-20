/**
 * Created by Ronny Rosabal.
 * Date:      5/18/18
 * Objective:
 */
"use strict";

let square = function( num ) {
  return num * num;
};

let cube = function( num ) {
  return num * num * num;
};

let fullName = function( firstName, lastName ) {
  return firstName + ' ' + lastName;
};

let power = function( num, exp ) {
  if( exp === 0 ) {
    return 1;
  } else {
    return num * power( num, exp - 1 );
  }

};

/*let sumCubes = function( numbers ) {
  let total = 0;
  for( let i = 0; i < numbers.length; i++ ) {
    total += cube( numbers[i] );
  }
  return total;
};*/

let each = function( list, func ) {
  if( Array.isArray( list ) ) {
    for( let i = 0; i < list.length; i++ ) {
      func( list[i], i );
    }
  } else {
    for( let prop in list ) {
      func( list[prop], prop );
    }
  }
};

let sumSquares = function( numbers ) {
  let total = 0;
  each( numbers, function( num ) {
    total += square( num );
  } );
  return total;
};

let sumCubes = function( numbers ) {
  let total = 0;
  each( numbers, function( num ){
    total += cube( num );
  } );
  return total;
};

let product = function( numbers ) {
  let total = 1;
  each( numbers, function( num ) {
    total *= num;
  });
  return total;
};

let cubeAll = function( numbers ) {
  let total = [];
  each( numbers, function( num ) {
    total.push( cube( num ) );
  } );
  return total;
};

let odds = function( numbers ) {
  let total = [];
  each( numbers, function( num ) {
    if( num % 2 !== 0 ) {
      total.push( num );
    }
  } );
  return total;
};

let sumByAllElementsMultipliedByFour = function( numbers ) {
  return sumSquares( numbers );
};

let sumBy = function( numbers, func ) {
  let total = 0;
  for( let i = 0; i < numbers.length; i++ ) {
    total += func( numbers[i] );
  }
  return total;
};

let productBy = function( numbers, func ) {
  let total = 1;
  for( let i = 0; i < numbers.length; i++ ) {
    total *= func( numbers[i] );
  }
  return total;
};

let doubleAll = function( numbers ) {
  let doubled = [];
  each( numbers, function( num ) {
    doubled.push( num + num );
  } );
  return doubled;
};

let halveAll = function( numbers ) {
  let halved = [];
  each( numbers, function( num ) {
    halved.push( num / 2 );
  } );
  return halved;
};

let upperCaseAll = function( strings ) {
  let upperCased = [];
  each( strings, function( str ) {
     upperCased.push( str.toUpperCase() );
  } );
  return upperCased;
};

let map = function( array, func ) {
  let mapped = [];
  each( array, function( elem ) {
    mapped.push( func( elem ) );
  } );
  return mapped;
};

let people = [
  {name: "Alyssa P. Hacker", age: 26},
  {name: "Ben Bitdiddle", age: 34},
  {name: "Eva Lu Ator", age: 19},
  {name: "Lem E. Tweakit", age: 40}
];

let even = function( numbers ) {
  return filter( numbers, function( number ) {
    return number % 2 === 0;
  } );
};

let multiplesOfThree = function( numbers ) {
  return filter( numbers, function( number ) {
    return number % 3 === 0;
  } );
};

let filter = function( list, func ) {
  let filtered;
  if( Array.isArray( list) ) {
    filtered = [];
    each( list, function( elem, index ) {
      if( func( elem, index ) ) {
        filtered.push( elem );
      }
    } );
  } else {
    filtered = {};
    each( list, function( value, key ) {
      if( func( value, key ) ) {
        filtered[key] = value;
      }
    } );
  }
  return filtered;
};

let startsWithChar = function( strings, char ) {
  return filter( strings, function( string ) {
    return string.charAt( 0 ) === char;
  } );
};

let indexedExponentials = function( numbers ) {
  let raisedNumbers = [];
  each( numbers, function( number, index ) {
    raisedNumbers.push( Math.pow( number, index ) );
  } );
  return raisedNumbers;
};

let evenIndexedOddNumbers = function( numbers ) {
  let filtered = [];
  each( numbers, function( number, index ) {
    if( number % 2 !== 0 && index % 2 === 0 ) {
      filtered.push( number );
    }
  } );
  return filtered;
};

let values = function( list ) {
  let values = [];
  each( list, function( value, prop ) {
    values.push( value );
  });
  return values;
};

let keysLongerThan = function( list, propLength ) {
  let filteredObj = {};
  each( list, function( value, prop ) {
    if( prop.length >= propLength ) {
      filteredObj[prop] = value;
    }
  } );
  return filteredObj;
};

let incrementValues = function( list ) {
  let incremented = {};
  each( list, function( value, prop ) {
    if( typeof value === 'number') {
      incremented[prop] = ++value;
    } else {
      incremented[prop] = value;
    }
  } );
  return incremented;
};

let evens = function( array ) {
  return filter( array, function( number ) {
    return number % 2 === 0;
  } );
};

let evenIndexedEvenLengths = function( strings ) {
  return filter( strings, function( string, index ) {
    return string.length % 2 === 0 && index % 2 === 0;
  } );
};

let objPropertyType = function( obj, type ) {
  return filter( obj, function( value, prop ) {
    return typeof value === type;
  } );
};

//TODO: delete after test
console.dir( map( [1,2,3], square ) );
console.log( map(["hello", "world"], function( str ) {
  return str.toUpperCase();
}) );
console.log( map(["the", "quick", "brown", "fox", "jumped"], function( str ) {
  return str.length;
} ) );
console.log( map( people, function( person ) {
  return person.name + ' is ' + person.age
} ) );

console.log( even( [1,2,3,4] ) );
console.log( multiplesOfThree( [1,2,3,5, 6, 8, 9] ) );
console.log( startsWithChar(['starts', 'other', 'special', 'zoo'], 's' ) );
console.dir( indexedExponentials( [2, 3, 4] ) );
console.dir( evenIndexedOddNumbers( [1,2,4,3,5,6,8] ) );
console.dir( values( { "name" : "Ronny", 'age' : 35, 'sex' : 'very male' } ) );
console.dir( keysLongerThan( { "name" : "Ronny", 'age' : 35, 'sex' : 'very male' }, 4 ) );
console.dir( incrementValues( {'name' : 'ronny', 'age' : 34, 'sex' : 'male'} ) );
console.log( evens( [1,2,3,4] ) );
console.log( evenIndexedEvenLengths( ['rone', 'ronn', 'stevan', 'arggs', 'thats'] ) );
console.dir( objPropertyType( { "name" : "Ronny", 'age' : 35, 'sex' : 'very male' }, 'number' ) );