/**
 * Created by Ronny Rosabal.
 * Date:      5/18/18
 * Objective:
 */
"use strict";

let square = function (num) {
    return num * num;
};

let cube = function (num) {
    return num * num * num;
};

let fullName = function (firstName, lastName) {
    return firstName + ' ' + lastName;
};

let power = function (num, exp) {
    if (exp === 0) {
        return 1;
    } else {
        return num * power(num, exp - 1);
    }

};

/*let sumCubes = function( numbers ) {
  let total = 0;
  for( let i = 0; i < numbers.length; i++ ) {
    total += cube( numbers[i] );
  }
  return total;
};*/

let each = function (list, func) {
    if (Array.isArray(list)) {
        for (let i = 0; i < list.length; i++) {
            func(list[i], i);
        }
    } else {
        for (let prop in list) {
            func(list[prop], prop);
        }
    }
};

let abs = function (num) {
    if (num >= 0) {
        return num;
    }
    return -num;
};

let sumSquares = function (numbers) {
    let total = 0;
    each(numbers, function (num) {
        total += square(num);
    });
    return total;
};

let sumCubes = function (numbers) {
    let total = 0;
    each(numbers, function (num) {
        total += cube(num);
    });
    return total;
};

let product = function (numbers) {
    let total = 1;
    each(numbers, function (num) {
        total *= num;
    });
    return total;
};

let cubeAll = function (numbers) {
    let total = [];
    each(numbers, function (num) {
        total.push(cube(num));
    });
    return total;
};

let odds = function (numbers) {
    let total = [];
    each(numbers, function (num) {
        if (num % 2 !== 0) {
            total.push(num);
        }
    });
    return total;
};

let sumByAllElementsMultipliedByFour = function (numbers) {
    return sumSquares(numbers);
};

let sumBy = function (numbers, func) {
    return reduce( numbers, function( sum, elem, index ) {
      return sum + func( elem );
    }, 0 );
};

let productBy = function (numbers, func) {
    let total = 1;
    for (let i = 0; i < numbers.length; i++) {
        total *= func(numbers[i]);
    }
    return total;
};

let doubleAll = function (numbers) {
    let doubled = [];
    each(numbers, function (num) {
        doubled.push(num + num);
    });
    return doubled;
};

let halveAll = function (numbers) {
    let halved = [];
    each(numbers, function (num) {
        halved.push(num / 2);
    });
    return halved;
};

let upperCaseAll = function (strings) {
    let upperCased = [];
    each(strings, function (str) {
        upperCased.push(str.toUpperCase());
    });
    return upperCased;
};

let map = function (list, func) {
    let mapped = [];
    if (!Array.isArray( list )) {
        mapped = {};
    }
    each(list, function (elem, key) {
        mapped[key] = func(elem, key);
    });
    return mapped;
};

let people = [
    {name: {first: "Alyssa", middle: "P.", last: "Hacker"}, age: 26},
    {name: {first: "Ben", last: "Bitdiddle"}, age: 34},
    {name: {first: "Eva", middle: "Lu", last: "Ator"}, age: 40},
    {name: {first: "Lem", middle: "E.", last: "Tweakit"}, age: 45},
    {name: {first: "Louis", last: "Reasoner"}, age: 21}
];

let even = function (numbers) {
    return filter(numbers, function (number) {
        return number % 2 === 0;
    });
};

let multiplesOfThree = function (numbers) {
    return filter(numbers, function (number) {
        return number % 3 === 0;
    });
};

let filter = function (list, func) {
    let filtered;
    if (Array.isArray(list)) {
        filtered = [];
        each(list, function (elem, index) {
            if (func(elem, index)) {
                filtered.push(elem);
            }
        });
    } else {
        filtered = {};
        each(list, function (value, key) {
            if (func(value, key)) {
                filtered[key] = value;
            }
        });
    }
    return filtered;
};

let startsWithChar = function (strings, char) {
    return filter(strings, function (string) {
        return string.charAt(0) === char;
    });
};

let indexedExponentials = function (numbers) {
    let raisedNumbers = [];
    each(numbers, function (number, index) {
        raisedNumbers.push(Math.pow(number, index));
    });
    return raisedNumbers;
};

let evenIndexedOddNumbers = function (numbers) {
    let filtered = [];
    each(numbers, function (number, index) {
        if (number % 2 !== 0 && index % 2 === 0) {
            filtered.push(number);
        }
    });
    return filtered;
};

let values = function (list) {
    let values = [];
    each(list, function (value, prop) {
        values.push(value);
    });
    return values;
};

let keysLongerThan = function (list, propLength) {
    let filteredObj = {};
    each(list, function (value, prop) {
        if (prop.length >= propLength) {
            filteredObj[prop] = value;
        }
    });
    return filteredObj;
};

let incrementValues = function ( list ) {
    return map( list, function( value, prop ) {
        if( typeof value === 'number' ) {
            return ++value;
        }
        return value;
    } );
};

let evens = function (array) {
    return filter(array, function (number) {
        return number % 2 === 0;
    });
};

let evenIndexedEvenLengths = function (strings) {
    return filter(strings, function (string, index) {
        return string.length % 2 === 0 && index % 2 === 0;
    });
};

let objPropertyType = function (obj, type) {
    return filter(obj, function (value, prop) {
        return typeof value === type;
    });
};

let ages = function (people) {
    return map(people, function (person, personIndex) {
        return person.age;
    });
};

let max = function (numbers) {
    return reduce( numbers, function( highest, elem, index ) {
      if( elem > highest ) {
        return elem;
      }
      return highest;
    }, numbers[0] );
};

let maximus = function (numbersList) {
    return map(numbersList, function (numbers, numbersIndex) {
        return max(numbers);
    });
};

let sampleInput = [ // it's an array
    [1, 3, 2], // of arrays of numbers
    [4, 23, 100],
    [7, 6, 3, -2]
];

let exponentials = function (numbers) {
    return map(numbers, function (number, index) {
        return Math.pow(number, number);
    });
};

let reverse = function (str) {
    let reversed = '';
    for (let i = str.length - 1; i >= 0; i--) {
        reversed += str.charAt(i);
    }
    return reversed;
};

let reverseWords = function (str) {
    let words = str.split(' ');
    each(words, function (word, index) {
        words[index] = reverse(word);
    });
    return words.join(' ');
};

let pluck = function (people, key) {
    return map(people, function (person, index) {
        return person[key];
    })
};

let parseCSV = function (str) {
    let people = str.split('\n');
    return map(people, function (person, index) {
        let eachPerson = person.split(',');
        return {name: {first: eachPerson[0], middle: eachPerson[1], last: eachPerson[2]}, age: eachPerson[3]};
    });
};

let csvString = "Alyssa,P.,Hacker,26\nBen,,Bitdiddle,34\nEva,Lu,Ator,40\nLem,E.,Tweakit,45\nLouis,,Reasoner,21";

let map2 = function ( numbers1, numbers2, func ) {
    return map( numbers1, function( number, index ) {
        return func( number, numbers2[index] );
    } )
};
let mapN = function( func ) {
  let argumentsList = Array.from( arguments );                    // creates an array from the arguments list
  func = argumentsList.splice( argumentsList.length - 1, 1 );     // separates the function arg from the rest of arg
  let rearrangedList = [];                                        // first arr holds first elem from all arr and so on
  each( argumentsList[0], function( number, numberIndex ) {
    rearrangedList.push( map( argumentsList, function( numbers, numbersIndex ) {
      return argumentsList[numbersIndex][numberIndex];
    } ) );
  });
  return map( rearrangedList, function( numbers, index ) {
    return func[0].apply( this, numbers );
  });
};

let testMapN = function() {
  return mapN([1, 2, 3], [4, 5, 6], [2, 2, 2], function( a, b, c ){
    return (a * b) + c;
  } );
};
let testMapN2 = function() {
  return mapN( [1,2,3] , function( a ) {
    return a * a;
  } );
};

let reduce = function( arr, func, start ) {
  let acc = start;
  if( start === undefined ) {
    acc = arr[0];
    arr = arr.slice( 1 );
  }
  each( arr, function( elem, index ) {
    acc = func( acc, elem, index );
  } );
  return acc;
};

let range = function( start, end ) {
  let numberRange = [];
  for( ; start <= end; start++ ) {
    numberRange.push( start );
  }
  return numberRange;
};

let factorial = function( num ) {
  return reduce( range( 1, num ), function( fact, elem, index ) {
    return fact * elem;
  } );
};

let countOccurrences = function( str, char ) {
  return reduce( str.split(''), function( count, elem, index ) {
    if( elem === char ) {
      return ++count;
    }
    return count;
  }, 0 )
};

let everyNumberOdd = function( numbers ) {
  return reduce( numbers, function( areOdd, number, index ) {
    return areOdd && number % 2 !== 0;
  }, true );
};

let everyNumberPositive = function( numbers ) {
  return reduce( numbers, function( arePositive, number, index ) {
    return arePositive && number > -1;
  }, true );
};

let everyStringGreaterThan = function( strings, number ) {
  return reduce( strings, function( isGreater, str, index ) {
    return isGreater && str.length > number;
  }, true )
};

let everyStringContains = function( strings, char ) {
  return reduce( strings, function( containsChar, str, index ) {
    if( str.indexOf( char ) === -1 ) {
      return false;
    }
    return containsChar;
  }, true );
};

let every = function( arr, func ) {
  return reduce( arr, function( isTrue, elem, index ) {
    return isTrue && func( elem );
  }, true );
};

let everyNumberEven = function( numbers ) {
  return every( numbers, function( number ) {
    return number % 2 === 0;
  } );
};

let joinWith = function( onto, next, separator ) {
  return onto + separator + next;
};

let join = function( strings, separator ) {
  return reduce( strings, function( joined, str, index ) {
    return joinWith( joined, str, separator );
  } );
};
//TODO: delete after test

console.log( map2( [1, 2, 3], [4, 5, 6], function( a, b ) { return a * b; } ) );
console.log( testMapN() );
console.log( testMapN2() );
console.log( factorial( 3 ) );
console.log( max( [2,5,100,2] ) );
console.log( countOccurrences( 'hello', 'r') );
console.log( 'everyNumberOdd', everyNumberOdd( [1,5,101,7] ) );
console.log( everyNumberPositive( [7, 2, 4] ) );
console.log( everyStringGreaterThan( ['hello', 'about', 'other', 'sex'], 3 ) );
console.log( everyStringContains( ['hello', 'about', 'other', 'sexo'], 'o' ) );
console.log( 'everyNumberEven', everyNumberEven( [2,6,100,2] ) );
console.log( joinWith( 'this is a test', 'try me', ':') );
console.log( join( ['hello', 'about', 'other', 'sex'], ' ') );
